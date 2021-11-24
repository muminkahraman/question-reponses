package qr;

import interfaces.Phase;
import qr.players.Joueurs;
import qr.questions.Questions;
import qr.themes.Themes;

public class Qrgame implements Phase {

   private Joueurs joueurs;
   private Questions questions;
   private Themes themes;

   public Qrgame(){
       joueurs = new Joueurs();
       questions = new Questions();
       themes = new Themes();
   }

   public static void main(String[] args){

   }




    @Override
    public void selectPlayers() {

    }

    @Override
    public void runGame() {

    }
}
