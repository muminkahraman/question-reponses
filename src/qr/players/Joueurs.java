package qr.players;

import java.util.Arrays;

public class Joueurs {
    private Joueur[] listJoueurs;
    private Joueur[] randomPlayers;

    public Joueurs(){

        listJoueurs = new Joueur[]{
                new Joueur("A"),
                new Joueur("B"),
                new Joueur("C"),
                new Joueur("D"),
                new Joueur("E"),
                new Joueur("F"),
                new Joueur("G"),
                new Joueur("H"),
                new Joueur("I"),
                new Joueur("J"),
                new Joueur("K"),
                new Joueur("L"),
                new Joueur("M"),
                new Joueur("N"),
                new Joueur("O"),
                new Joueur("P"),
                new Joueur("Q"),
                new Joueur("R"),
                new Joueur("S"),
                new Joueur("T"),
        };


    }

    public Joueur[] getListJoueurs() {
        return listJoueurs;
    }

    public Joueur pickAPlayer(){
        return listJoueurs[(int)(Math.random()*19)];
    }

    public void setRandomPlayers(){
        int numberOfChosenPlayers = (int)((Math.random()*2)+4);

        //on s'assure qu'on choisisse aumoins 4 joueurs
        while(numberOfChosenPlayers < 4 || numberOfChosenPlayers > 6 ){
            numberOfChosenPlayers = (int)((Math.random()*2)+4);
        }

        Joueur[] randomPlayers = new Joueur[numberOfChosenPlayers];

        for(int i=0; i < numberOfChosenPlayers; ++i){
            Joueur j = listJoueurs[(int)(Math.random()* 19)];
            //on vérifie si le joueur aléatoire est déjà dans la liste
            //des randoms players. Si non, on l'ajoute
            while((Arrays.stream(randomPlayers).anyMatch(j::equals))){
                j = listJoueurs[(int)(Math.random()* 19)];
            }

            randomPlayers[i] = j;
        }

        this.randomPlayers = randomPlayers;

    }

    @Override
    public String toString(){
        String result = "Nombre de joueurs aléatoires choisi: "+randomPlayers.length+"\n";
        for (Joueur j: this.randomPlayers) {
            result+= j.toString()+"\n\n";
        }
        return "Liste des Joueurs participant au Jeu\n---------------------------------------\n\n"+ result;
    }
}
