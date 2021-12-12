package qr.players;

import java.util.Arrays;
import java.util.Random;

public class Joueurs {
    private Joueur[] players;
    private Joueur[] randomPlayers;

    public Joueurs(){

        players = new Joueur[]{
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

    public Joueurs(Joueur[] selectedPlayers){
        randomPlayers = selectedPlayers;
    }

    public Joueur[] getPlayers() {
        return players;
    }

    int index = new Random().nextInt(20);

    public Joueur pickAPlayer(){
        return players[index];
    }

    public void setRandomPlayers(){
        int numberOfChosenPlayers = (int)((Math.random()*2)+4);

        //on s'assure qu'on choisisse aumoins 4 joueurs
        while(numberOfChosenPlayers < 4 || numberOfChosenPlayers > 6 ){
            numberOfChosenPlayers = (int)((Math.random()*2)+4);
        }

        Joueur[] randomPlayers = new Joueur[numberOfChosenPlayers];

        for(int i=0; i < numberOfChosenPlayers; ++i){
            Joueur j = players[(int)(Math.random()* 19)];
            //on vérifie si le joueur aléatoire est déjà dans la liste
            //des randoms players. Si non, on l'ajoute
            while((Arrays.stream(randomPlayers).anyMatch(j::equals))){
                j = players[(int)(Math.random()* 19)];
            }

            randomPlayers[i] = j;
        }

        this.randomPlayers = randomPlayers;

        //l'état des joueurs sélectionné change
        for(Joueur player : this.randomPlayers){
            player.setEtatJoueur(PlayerState.SELECTED);
        }

    }

    /**
     * Retourne la liste des joueurs choisis aléatoirement
     * @return
     */
    public Joueur[] getRandomPlayers() {
        return randomPlayers;
    }


    @Override
    public String toString(){
        String result = "Nombre de joueurs aléatoires choisi: "+randomPlayers.length+"\n";
        for (Joueur j: this.randomPlayers) {
            result+= j.toString()+"\n.........................\n";
        }
        return  result;
    }
}
