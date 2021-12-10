package qr.phases;

import java.util.*;

import exceptions.*;
import interfaces.Phase;
import qr.players.Joueur;
import qr.players.*;
import qr.questions.*;
import qr.themes.Theme;
import qr.themes.Themes;

/**
 * Phase I
 */
public class Qrgame implements Phase {
    private static final Scanner scanner = new Scanner(System.in);
    private static Themes themes = new Themes();
    private static Questions questions = new Questions();
    private static Joueurs joueurs = new Joueurs();
    private static Joueur[] phase2Players = new Joueur[3];

    public static void main(String[] args) {

        System.out.println("*****************************************************\n \t\t\t\tJEU QUESTION / REPONSE \n*****************************************************");

        int choice = -1;

        try {
            while ((choice = gameChoice()) != 0) {
                System.out.println("*****************************************************\n \t\t\t\tPHASE 1 \n*****************************************************");

                joueurs.setRandomPlayers();
                System.out.println("Liste des Joueurs participant au Jeu\n---------------------------------------");
                System.out.println(joueurs);

                //saisie en dur des questions
                LoadQuestions.createQuestions();
                Theme themeChoisi = themeChoice();
                //System.out.println(themeChoisi.toStringWithAllQuestions());

                //La première phase se joue et on rempli la liste des joueurs pour la phase 2
                startGame(themeChoisi);


            }
        } catch (ExitException ex) {
            System.out.println(ex.getMessage());

        }


    }

    public static Questions getQuestions() {
        return questions;
    }

    public static Themes getThemes() {
        return themes;
    }

    private static int gameChoice() throws ExitException {
        System.out.println("Choisissez une option");
        System.out.println("0. Quitter la partie\n1. Débuter la partie");
        String choice = scanner.nextLine();
        int nbChoice;
        while (!choice.matches("\\d") || (nbChoice = Integer.parseInt(choice)) < 0 || nbChoice > 2) {
            System.out.println("Choix invalide !\n\nEssayez encore :");

            choice = scanner.nextLine();
        }
        if (nbChoice == 0) throw new ExitException();
        return Integer.parseInt(choice);
    }

    private static Theme themeChoice() {
        System.out.println("Choisir un thème\n----------------------");
        themes.afficherLesThemes();
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        int nbChoice;
        Theme chosenTheme = null;


        while (!choice.matches("\\d+") || (nbChoice = Integer.parseInt(choice)) < 0 || nbChoice > themes.getThemes().size()) {
            System.out.println("Choix invalide !\n\nEssayez encore :");
            choice = sc.nextLine();
        }

        chosenTheme = themes.getThemes().get(Integer.parseInt(choice) - 1);
        if (chosenTheme.getChosenIndicator() == 1) {
            System.err.println("Ce thème a déjà été choisi ! Choisissez un autre :");
            themeChoice();
        }

        chosenTheme.setChosenIndicator(1);

        return chosenTheme;

    }

    private static Question pickRandomQuestion(Theme theme) {
        List<Question> q = theme.getThemeQuestions();
        int index = new Random().nextInt(q.size());

        return q.get(index);
    }

    private static void startGame(Theme theme) {
        Scanner sc = new Scanner(System.in);
        //Question q = pickRandomQuestion(theme);

        for (Joueur player : joueurs.getRandomPlayers()) {
            System.out.println("Joueur " + player.getNomJoueur() + "\n---------------");
            Question q = pickRandomQuestion(theme);

            while ((q.getIndicator() == 1)) {
                q = pickRandomQuestion(theme);
            }

            q.setIndicator(1);
            System.out.println(q);
            String reponse = sc.nextLine();

            if (q instanceof QCM) {
                if (reponse.equalsIgnoreCase("C")) {
                    System.out.println("Bravo..bonne reponse");
                    player.setScore(player.getScore() + 2);
                } else {
                    System.out.println("Oups..Mauvaise reponse");
                    player.setScore(player.getScore() - 1);
                }
            }

            if (q instanceof RC) {
                if (reponse.equalsIgnoreCase(((RC) q).getBonneReponse())) {
                    System.out.println("Bravo..bonne reponse");
                    player.setScore(player.getScore() + 2);
                } else {
                    System.out.println("Oups..Mauvaise reponse");
                    player.setScore(player.getScore() - 1);
                }
            }
            if (q instanceof VF) {
                if ((((VF) q).getBonneReponse() && (reponse.equalsIgnoreCase("V")))
                        || (!(((VF) q).getBonneReponse()) && (reponse.equalsIgnoreCase("F")))) {
                    System.out.println("Bravo..bonne reponse");
                    player.setScore(player.getScore() + 2);
                } else {
                    System.out.println("Oups..Mauvaise reponse");
                    player.setScore(player.getScore() - 1);
                }
            }

        }

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
                phase2Players[i] = (joueurs.getRandomPlayers()[i]);
                (joueurs.getRandomPlayers()[i]).setEtatJoueur(PlayerState.WINNER);
            }
            else{
                for(int j=i+1; j < joueurs.getRandomPlayers().length-i;++j){
                    if(joueurs.getRandomPlayers()[j].getScore()>0){
                        phase2Players[j] = (joueurs.getRandomPlayers()[j]);
                    }
                }
            }
        }

        for (int i = 0; i < joueurs.getRandomPlayers().length; ++i) {
            if ((joueurs.getRandomPlayers()[i]).getEtatJoueur() != PlayerState.WINNER) {
                (joueurs.getRandomPlayers()[i]).setEtatJoueur(PlayerState.ELIMINATED);
            }
        }

        System.out.println("Liste des Joueurs GAGNANTS et ELIMINÉS\n---------------------------------------");
        System.out.println(joueurs);

    }

    @Override
    public void selectPlayers() {

    }

    @Override
    public void runGame() {

    }


}
