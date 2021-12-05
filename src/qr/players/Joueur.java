package qr.players;

public class Joueur {
    private static  int NUMERO_JOUEUR = 100;
    private int numeroJoueur;
    private String nomJoueur;
    private int score;
    private PlayerState etatJoueur;

    public Joueur(String nomJoueur){
        numeroJoueur = NUMERO_JOUEUR;
        this.nomJoueur = nomJoueur;
        score = 0;
        etatJoueur = PlayerState.WAITING;

        NUMERO_JOUEUR+=10;
    }

    @Override
    public String toString(){
        return "Joueur numero: "+ numeroJoueur+ "\n"+"Nom: "+nomJoueur+"\n"+"Score: "+score+" Etat: "+etatJoueur;
    }

    public PlayerState getEtatJoueur() {
        return etatJoueur;
    }

    public void setEtatJoueur(PlayerState etatJoueur) {
        this.etatJoueur = etatJoueur;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
