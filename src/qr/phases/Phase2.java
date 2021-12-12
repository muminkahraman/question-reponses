package qr.phases;

import interfaces.Phase;
import qr.Qrgame;
import qr.players.Joueur;
import qr.players.PlayerState;
import qr.questions.*;
import qr.themes.Theme;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Phase2 extends Phases implements Phase {

    public Phase2(Joueur[] phase1winners) {
        super(phase1winners);
        winners = new Joueur[2];
    }


    @Override
    public void runGame() {
        System.out.println("*****************************************************\n \t\t\t\tPHASE 2 \n*****************************************************");

        //Les états des joueurs sont remis à SELECTED
        for (int i = 0; i < joueurs.getRandomPlayers().length; ++i) {

                (joueurs.getRandomPlayers()[i]).setEtatJoueur(PlayerState.SELECTED);
        }

        //Chaque joueur va répondre deux fois à une question de difficulté moyenne
        //de deux thèmes qu'il va choisira
        for (int k = 0; k < 2; ++k) {
            for (int i = 0; i < joueurs.getRandomPlayers().length; ++i) {
                Theme themeChose = Qrgame.themeChoice();
                Scanner sc = new Scanner(System.in);
                Joueur player = joueurs.getRandomPlayers()[i];

                System.out.println("Joueur " + player.getNomJoueur() + "\n---------------");
                Question q = pickRandomQuestion(themeChose);

                while ((q.getIndicator() == 1) || (q.getDifficulty() != Difficulty.MEDIUM)) {
                    q = pickRandomQuestion(themeChose);
                }

                q.setIndicator(1);
                System.out.println(q);
                String reponse = sc.nextLine();

                super.traiterReponse(reponse, q, player, 3);

            }
        }

        selectPlayers();
        //On reinitialise lesinicateurs des thèmes
        for (Theme t : Qrgame.getThemes()) {
            t.setChosenIndicator(0);
        }

        System.out.println("Liste des Joueurs GAGNANTS et ELIMINÉS\n---------------------------------------");
        System.out.println(joueurs);

    }


    @Override
    public void selectPlayers() {

        Integer[] playerScores = new Integer[joueurs.getRandomPlayers().length];

        for (int i = 0; i < joueurs.getRandomPlayers().length; ++i) {
            playerScores[i] = joueurs.getRandomPlayers()[i].getScore();
        }

        //Classement en ordre décroissant
        Arrays.sort(playerScores, Collections.reverseOrder());

        // On selectionne les 2 meilleurs pour la phase 3
        for (int i = 0; i < 2; ++i) {
            int score = joueurs.getRandomPlayers()[i].getScore();

            if (i > 0) {
                if (score == playerScores[i - 1]) {
                    winners[i] = (joueurs.getRandomPlayers()[i + 1]);
                    (joueurs.getRandomPlayers()[i]).setEtatJoueur(PlayerState.WINNER);
                }
            } else {
                winners[i] = (joueurs.getRandomPlayers()[i]);
                (joueurs.getRandomPlayers()[i]).setEtatJoueur(PlayerState.WINNER);
            }

        }

        //Les joueurs qui n'ont pas été selectionnés sont éliminés
        for (int i = 0; i < joueurs.getRandomPlayers().length; ++i) {
            if ((joueurs.getRandomPlayers()[i]).getEtatJoueur() != PlayerState.WINNER) {
                (joueurs.getRandomPlayers()[i]).setEtatJoueur(PlayerState.ELIMINATED);
            }
        }

    }


}
