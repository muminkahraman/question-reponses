package testqr.testPlayers;

import qr.players.*;


public class TestJoueur {
    private static Joueurs joueurs =  new Joueurs(); //va créer un tableau de joueurs
    public static void main(String[] args){

       Joueur j0 = joueurs.pickAPlayer();// choisis un joueur aléatoire dans le tableau des jouers

        joueurs.setRandomPlayers();
        System.out.println(joueurs.toString());

      Joueur j1 = new Joueur("Z");
      Joueur j2 = new Joueur("X");

      System.out.println(j1);
      System.out.println(j2);

      j1.getScore();
      j2.setEtatJoueur(PlayerState.ELIMINATED);
      System.out.println(j2);


    }
}
