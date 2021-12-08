package qr.phases;

import java.util.*;

import exceptions.ExitException;
import interfaces.Phase;
import qr.players.Joueur;
import qr.players.Joueurs;
import qr.questions.*;
import qr.themes.Theme;
import qr.themes.Themes;
import testqr.testQuestions.TestQuestion;

/**
 * Phase I
 */
public class Qrgame implements Phase {
    private static final Scanner scanner = new Scanner(System.in);
    private static Themes themes = new Themes();
    private static Questions questions = new Questions();
    private static Joueurs joueurs = new Joueurs();
    private static ArrayList<Joueur> phase2Players = new ArrayList<Joueur>();

   public static void main(String[] args){

       System.out.println("*****************************************************\n \t\t\t\tJEU QUESTION / REPONSE \n*****************************************************");

       int choice = -1;

      try{
          while((choice=gameChoice()) != 0){
              System.out.println("*****************************************************\n \t\t\t\tPHASE 1 \n*****************************************************");

              joueurs.setRandomPlayers();
              System.out.println(joueurs);

              //saisie en dur des questions
              TestQuestion.createQuestions();
              Theme themeChoisi = themeChoice();
              //System.out.println(themeChoisi.toStringWithAllQuestions());

              //La première phase se joue et on rempli la liste des joueurs pour la phase 2
              startGame(themeChoisi);



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

    private static void startGame(Theme theme){
        List<Question> questions = theme.getListThemeQuestions();
        for(Joueur player: joueurs.getRandomPlayers()){
            System.out.println("Joueur "+player.getNomJoueur()+"\n---------------\n");
            Scanner sc = new Scanner(System.in);

            Question q = questions.get((int)Math.random()* (questions.size()-1));
            while(q.getIndicator()==1){
                q = questions.get((int)Math.random()* (questions.size()-1));
            }
            q.setIndicator(1);
            System.out.println(q);
            String reponse = sc.nextLine();
            if(q instanceof QCM){
                if(reponse=="D" || reponse == "d"){
                    System.out.println("Bravo..bonne reponse");
                    player.setScore(player.getScore()+2);
                }
                else{
                    System.out.println("Oups..Mauvaise reponse");
                    player.setScore(player.getScore()-1);
                }
            }
            if(q instanceof RC){
                if(reponse==((RC) q).getBonneReponse()){
                    System.out.println("Bravo..bonne reponse");
                    player.setScore(player.getScore()+2);
                }
                else{
                    System.out.println("Oups..Mauvaise reponse");
                    player.setScore(player.getScore()-1);
                }
            }
            if(q instanceof VF){
                if( (((VF)q).getBonneReponse() && (reponse=="V" || reponse=="v"))
                        || (!(((VF)q).getBonneReponse()) && (reponse=="F" || reponse=="f"))   ){
                    System.out.println("Bravo..bonne reponse");
                    player.setScore(player.getScore()+2);
                }
                else{
                    System.out.println("Oups..Mauvaise reponse");
                    player.setScore(player.getScore()-1);
                }
            }
        }

        Integer[] playerScores = new Integer[joueurs.getRandomPlayers().length];

        for(int i = 0; i < joueurs.getRandomPlayers().length; ++i){
            playerScores[i] = joueurs.getRandomPlayers()[i].getScore();
        }

        //Classement en ordre décroissant
        Arrays.sort(playerScores, Collections.reverseOrder());
        //a customiser
        // On selectionne les 3 meilleurs pour la phase 2
        for(int i = 0; i<3;++i){
            for(int k = 0; k < joueurs.getRandomPlayers().length; ++k){
                if(joueurs.getRandomPlayers()[k].getScore()==playerScores[i]){
                    phase2Players.add(joueurs.getRandomPlayers()[k]);
                }
            }
        }
    }

    @Override
    public void selectPlayers() {

    }

    @Override
    public  void runGame() {

    }




}
