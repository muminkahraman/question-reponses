package qr.phases;

import interfaces.Phase;
import qr.players.Joueur;
import qr.players.Joueurs;
import qr.questions.*;
import qr.themes.Theme;

import java.util.Scanner;

public class Phase2 extends Phases implements Phase {

    public Phase2(Joueur[] phase1winners) {
        super(phase1winners);
    }


    @Override
    public void runGame() {
        System.out.println("*****************************************************\n \t\t\t\tPHASE 2 \n*****************************************************");

        //Chaque joueur va répondre deux fois à une question de difficulté moyenne
        //de deux thèmes qu'il va choisira
        for (int k = 0; k < 2; ++k) {
            for (int i = 0; i < joueurs.getRandomPlayers().length; ++i) {
                Theme themeChose = Qrgame.themeChoice();
                Scanner sc = new Scanner(System.in);
                Joueur player = joueurs.getRandomPlayers()[i];

                System.out.println("Joueur " + player.getNomJoueur() + "\n---------------");
                Question q = Qrgame.pickRandomQuestion(themeChose);

                while ((q.getIndicator() == 1) || (q.getDifficulty() != Difficulty.MEDIUM)) {
                    q = Qrgame.pickRandomQuestion(themeChose);
                }

                q.setIndicator(1);
                System.out.println(q);
                String reponse = sc.nextLine();

                super.traiterReponse(reponse,q,player,3);


            }
        }


    }


    @Override
    public Joueur[] selectPlayers() {
        return null;
    }


}
