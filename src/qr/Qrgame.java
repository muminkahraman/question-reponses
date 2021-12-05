package qr;

import java.util.Scanner;

import exceptions.ExitException;
import interfaces.Phase;
import qr.players.Joueurs;
import qr.questions.Questions;
import qr.themes.Theme;
import qr.themes.Themes;

public class Qrgame implements Phase {
    private static final Scanner scanner = new Scanner(System.in);
    private static Themes themes = new Themes();
    private static Questions questions = new Questions();
    private static Joueurs joueurs = new Joueurs();

   public static void main(String[] args){

       System.out.println("*****************************************************\n \t\t\t\tJEU QUESTION / REPONSE \n*****************************************************");

       int choice = -1;

      try{
          while((choice=gameChoice()) != 0){
              System.out.println("*****************************************************\n \t\t\t\tPHASE 1 \n*****************************************************");

              joueurs.setRandomPlayers();
              System.out.println(joueurs);

              Theme themeChoisi = themeChoice();
              System.out.println(themeChoisi);


          }
      }
      catch (ExitException ex){
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
        System.out.println("Choisir un thème\n----------------------\n");
        themes.afficherLesThemes();
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        int nbChoice;
        Theme chosenTheme = null;


        while (!choice.matches("\\d+") || (nbChoice = Integer.parseInt(choice)) < 0 || nbChoice > themes.getThemeList().size()) {
            System.out.println("Choix invalide !\n\nEssayez encore :");
            choice = sc.nextLine();
        }

        chosenTheme =  themes.getThemeList().get(Integer.parseInt(choice)-1);
        if(chosenTheme.getChosenIndicator()==1){
            System.err.println("Ce thème a déjà été choisi ! Choisissez un autre :");
            themeChoice();
        }

        chosenTheme.setChosenIndicator(1);

        return chosenTheme;

    }




    @Override
    public void selectPlayers() {

    }

    @Override
    public void runGame() {

    }
}
