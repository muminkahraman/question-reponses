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

import interfaces.Phase;
import qr.players.Joueur;

public class Phase3 extends Phases {

    public Phase3(Joueur[] phase2winners) {
        super(phase2winners);
        winners = new Joueur[1];
    }

    @Override
    public void runGame() {
        System.out.println("*****************************************************\n \t\t\t\tPHASE 3 \n*****************************************************");

        //Les états des joueurs sont remis à SELECTED
        for (int i = 0; i < joueurs.getRandomPlayers().length; ++i) {

            (joueurs.getRandomPlayers()[i]).setEtatJoueur(PlayerState.SELECTED);
        }

        //Les indicateurs de thème sont remis à 0
        for(Theme t: Qrgame.getThemes()){
            t.setChosenIndicator(0);
        }

        //Chaque joueur va répondre trois fois à une question de niveau difficile
        //de 3 thèmes qu'il va choisira
        for (int k = 0; k < 3; ++k) {
            for (int i = 0; i < joueurs.getRandomPlayers().length; ++i) {
                Theme themeChose = Qrgame.themeChoice();
                Scanner sc = new Scanner(System.in);
                Joueur player = joueurs.getRandomPlayers()[i];

                System.out.println("Joueur " + player.getNomJoueur() + "\n---------------");
                Question q = pickRandomQuestion(themeChose);

                while ((q.getIndicator() == 1) || (q.getDifficulty() != Difficulty.HARD)) {
                    q = pickRandomQuestion(themeChose);
                }

                q.setIndicator(1);
                System.out.println(q);
                String reponse = sc.nextLine();

                super.traiterReponse(reponse, q, player, 5);

            }
        }

        selectPlayers();
        //On reinitialise lesinicateurs des thèmes
        for (Theme t : Qrgame.getThemes()) {
            t.setChosenIndicator(0);
        }

        System.out.println("Le gagnant est\n---------------------------------------");
        System.out.println(winners[0]);

        //Les indicateurs de thème sont remis à 0
        for(Theme t: Qrgame.getThemes()){
            t.setChosenIndicator(0);
        }
    }


    @Override
    public void selectPlayers() {

        Integer[] playerScores = new Integer[joueurs.getRandomPlayers().length];

        for (int i = 0; i < joueurs.getRandomPlayers().length; ++i) {
            playerScores[i] = joueurs.getRandomPlayers()[i].getScore();
        }

        //Classement en ordre décroissant
        Arrays.sort(playerScores, Collections.reverseOrder());

        // On selectionne le meilleur pour  fin du jeu
        for (int i = 0; i < 1; ++i) {
            int score = joueurs.getRandomPlayers()[i].getScore();
            if (score == playerScores[i] && score > 0) {
                winners[i] = (joueurs.getRandomPlayers()[i]);
                (joueurs.getRandomPlayers()[i]).setEtatJoueur(PlayerState.SUPER_WINNER);
            }else{
                winners[i] = (joueurs.getRandomPlayers()[i+1]);
                (joueurs.getRandomPlayers()[i+1]).setEtatJoueur(PlayerState.SUPER_WINNER);
            }
        }

        //Les joueurs qui n'ont pas été selectionnés sont éliminés
        for (int i = 0; i < joueurs.getRandomPlayers().length; ++i) {
            if ((joueurs.getRandomPlayers()[i]).getEtatJoueur() != PlayerState.SUPER_WINNER) {
                (joueurs.getRandomPlayers()[i]).setEtatJoueur(PlayerState.ELIMINATED);
            }
        }

    }

}
