package qr.phases;

import interfaces.Phase;
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
 * Classe mere des phases
 *
 * Attribut joueurs est la liste des joueurs de la phase
 *
 * winners[] est le tableau des gangnants de la phase
 */
public class Phases  implements Phase {

    protected Joueurs joueurs;
    protected Joueur[] winners;

    public Phases(Joueur[] players){
        this.joueurs = new Joueurs(players);
    }

    /**
     * renvoie les gagnants de la phase
     * @return
     */
    public Joueur[] getWinners() {
        return winners;
    }

    /**
     * selectionner aleatoirement une question dans un theme
     * en argument
     * @param theme
     * @return
     */
    protected Question pickRandomQuestion(Theme theme) {
        List<Question> q = theme.getThemeQuestions();
        int index = new Random().nextInt(q.size());

        return q.get(index);
    }

    /**
     * traiter la reponse du joueur et evaluer si elle est correcte ou non
     * en fonction du type de question
     * incrementer le score su joueur par addScore
     * @param reponse
     * @param q
     * @param player
     * @param addScore
     */
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


    @Override
    public void selectPlayers() {

    }

    @Override
    public void runGame() {

    }
}
