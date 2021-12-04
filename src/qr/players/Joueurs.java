package qr.players;

public class Joueurs {
    private Joueur[] listJoueurs;

    public Joueurs(){

        listJoueurs = new Joueur[]{
                new Joueur("Joueur 1"),
                new Joueur("Joueur 2"),
                new Joueur("Joueur 3"),
                new Joueur("Joueur 4"),
                new Joueur("Joueur 5"),
                new Joueur("Joueur 6"),
                new Joueur("Joueur 7"),
                new Joueur("Joueur 8"),
                new Joueur("Joueur 9"),
                new Joueur("Joueur 10"),
                new Joueur("Joueur 11"),
                new Joueur("Joueur 12"),
                new Joueur("Joueur 13"),
                new Joueur("Joueur 14"),
                new Joueur("Joueur 15"),
                new Joueur("Joueur 16"),
                new Joueur("Joueur 17"),
                new Joueur("Joueur 18"),
                new Joueur("Joueur 19"),
                new Joueur("Joueur 20"),
        };
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
