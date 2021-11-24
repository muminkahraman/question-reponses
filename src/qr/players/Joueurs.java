package qr.players;

public class Joueurs {
    private Joueur[] listJoueurs;

    public Joueurs(){
        listJoueurs = new Joueur[20];
    }
    public Joueur pickAPlayer(){
        return listJoueurs[(int)Math.random()* listJoueurs.length];
    }

    public void setRandomPlayers(){

    }

    @Override
    public String toString(){
        String resultat = "";
        for (Joueur j: listJoueurs) {
            resultat+= j.toString()+"\n";
        }
        return "Liste des Joueurs\n------------"+ resultat;
    }
}
