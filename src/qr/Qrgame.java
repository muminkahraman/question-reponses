package qr;

import java.util.Scanner;

import exceptions.ExitException;
import interfaces.Phase;
import qr.players.Joueurs;
import qr.questions.Questions;
import qr.themes.Themes;

public class Qrgame implements Phase {
    private static final Scanner scanner = new Scanner(System.in);
    private static Questions questions = new Questions();

   public static void main(String[] args){
      Joueurs joueurs = new Joueurs();
      Themes themes = new Themes();


       System.out.println("*****************************************************\n \t\t\t\tJEU QUESTION / REPONSE \n*****************************************************");

       int choice = -1;

      try{
          while((choice=gameChoice()) != 0){
              System.out.println("*****************************************************\n \t\t\t\tPHASE 1 \n*****************************************************");

              joueurs.setRandomPlayers();
                System.out.println(joueurs);

          }
      }
      catch (ExitException ex){
            System.out.println(ex.getMessage());

      }




   }

    public static Questions getQuestions() {
        return questions;
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




    @Override
    public void selectPlayers() {

    }

    @Override
    public void runGame() {

    }
}
