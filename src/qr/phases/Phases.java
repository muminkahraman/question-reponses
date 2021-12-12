package qr.phases;

import qr.players.Joueur;
import qr.players.Joueurs;
import qr.questions.QCM;
import qr.questions.Question;
import qr.questions.RC;
import qr.questions.VF;
import qr.themes.Theme;

import java.util.List;
import java.util.Random;

/**
 * Classe mère des phases
 *
 * Attribut joueurs est la liste des joueurs de la phase
 *
 * winners[] est le tableau des gangnants de la phase
 */
public class Phases {

    protected Joueurs joueurs;
    protected Joueur[] winners;

    public Phases(Joueur[] players){
        joueurs = new Joueurs(players);
    }

    public Joueur[] getWinners() {
        return winners;
    }

    /**
     * selectionner aléatoirement une question dans un thème
     * en argument
     * @param theme
     * @return
     */
    protected Question pickRandomQuestion(Theme theme) {
        List<Question> q = theme.getThemeQuestions();
        int index = new Random().nextInt(q.size());

        return q.get(index);
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
