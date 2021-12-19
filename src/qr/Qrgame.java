package qr;

import java.util.*;

import exceptions.*;
import interfaces.Phase;
import qr.phases.Phase1;
import qr.phases.Phase2;
import qr.phases.Phase3;
import qr.players.Joueur;
import qr.players.*;
import qr.questions.*;
import qr.themes.Theme;
import qr.themes.Themes;

/**
 * Application principale main
 */
public class Qrgame {
    private static final Scanner scanner = new Scanner(System.in);
    private static Themes themes = new Themes();
    private static Questions questions = new Questions();
    private static Joueurs joueurs = new Joueurs();

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

                //La première phase se joue et on rempli la liste des joueurs pour la phase 2
                Phase1 phase1 = new Phase1(joueurs.getRandomPlayers());
                phase1.runGame();

                //la phase2 commence en chargeant le tableau des gagnants de la phase1
                Phase2 phase2 = new Phase2(phase1.getWinners());
                phase2.runGame();

                //la phase3 commence en chargeant le tableau des gagnants de la phase2
                Phase3 phase3 = new Phase3(phase2.getWinners());
                phase3.runGame();
                System.out.println("FIN DE LA PARTIE. VOULEZ-VOUS REJOUER ?");

            }
        } catch (ExitException ex) {
            System.out.println(ex.getMessage());

        }


    }

    /**
     * Renvoie la liste des questions
     * @return
     */
    public static Questions getQuestions() {
        return questions;
    }

    /**
     * Renvoie la liste des thèmes
     * @return
     */
    public static Themes getThemes() {
        return themes;
    }

    /**
     * Choix de l'opération
     * Gestion des saisies utilisateurs pour tout le jeu
     * @return
     * @throws ExitException
     */
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

    /**
     * Un thème pour la phase 1 est choisit
     * @return
     */
    public static Theme themeChoice() {
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

}
