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

public class Phase1 extends Phases implements Phase {


    public Phase1(Joueur[] chosenPlayers) {
        super(chosenPlayers);
        winners = new Joueur[3];
    }



    /**
     * La phase I se déroule
     * Chaque joueur répond à son tour à une question du thème commun choisi
     */
   @Override
    public  void runGame() {
       Theme theme = Qrgame.themeChoice();
        Scanner sc = new Scanner(System.in);

        for (Joueur player : joueurs.getRandomPlayers()) {
            System.out.println("Joueur " + player.getNomJoueur() + "\n---------------");
            Question q = pickRandomQuestion(theme);

            while ((q.getIndicator() == 1) || (q.getDifficulty()!= Difficulty.EASY)) {
                q = pickRandomQuestion(theme);
            }

            q.setIndicator(1);
            System.out.println(q);
            String reponse = sc.nextLine();

            super.traiterReponse(reponse,q,player,2);

        }

        selectPlayers();

        //On reinitialise lesinicateurs des thèmes
        for(Theme t: Qrgame.getThemes()){
            t.setChosenIndicator(0);
        }

        System.out.println("Liste des Joueurs GAGNANTS et ELIMINÉS\n---------------------------------------");
        System.out.println(joueurs);

    }

    /**
     * A l'issue de la phase I, le tableau des joueurs gagnants est construite
     * Ce tableau est nommé winners[] et sera utilisé pour la phase 2
     */
    @Override
    public void selectPlayers() {
        Integer[] playerScores = new Integer[joueurs.getRandomPlayers().length];

        for (int i = 0; i < joueurs.getRandomPlayers().length; ++i) {
            playerScores[i] = joueurs.getRandomPlayers()[i].getScore();
        }

        //Classement en ordre décroissant
        Arrays.sort(playerScores, Collections.reverseOrder());

        // On selectionne les 3 meilleurs pour la phase 2
        for (int i = 0; i < 3; ++i) {
            int score = joueurs.getRandomPlayers()[i].getScore();

            if (score == playerScores[i] && score > 0) {
                winners[i] = (joueurs.getRandomPlayers()[i]);
                (joueurs.getRandomPlayers()[i]).setEtatJoueur(PlayerState.WINNER);
            }
            else{
                for(int j=i+1; j < joueurs.getRandomPlayers().length-i;++j){
                    if(joueurs.getRandomPlayers()[j].getScore()>0){
                        winners[j] = (joueurs.getRandomPlayers()[j]);
                    }
                }
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
