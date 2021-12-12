package qr.phases;

import qr.players.Joueur;
import qr.players.Joueurs;
import qr.questions.QCM;
import qr.questions.Question;
import qr.questions.RC;
import qr.questions.VF;

public class Phases {

    protected Joueurs joueurs;

    public Phases(Joueur[] players){
        joueurs = new Joueurs(players);
    }

    protected void traiterReponse(String reponse, Question q, Joueur player, int addScore){
        if (q instanceof QCM) {
            if (reponse.equalsIgnoreCase("C")) {
                System.out.println("Bravo..bonne reponse");
                player.setScore(player.getScore() + addScore);
            } else {
                System.out.println("Oups..Mauvaise reponse");

            }
        }

        if (q instanceof RC) {
            if (reponse.equalsIgnoreCase(((RC) q).getBonneReponse())) {
                System.out.println("Bravo..bonne reponse");
                player.setScore(player.getScore() + addScore);
            } else {
                System.out.println("Oups..Mauvaise reponse");

            }
        }
        if (q instanceof VF) {
            if ((((VF) q).getBonneReponse() && (reponse.equalsIgnoreCase("V")))
                    || (!(((VF) q).getBonneReponse()) && (reponse.equalsIgnoreCase("F")))) {
                System.out.println("Bravo..bonne reponse");
                player.setScore(player.getScore() + addScore);
            } else {
                System.out.println("Oups..Mauvaise reponse");
            }
        }
    }
}
