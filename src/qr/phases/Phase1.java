package qr.phases;

import interfaces.Phase;
import qr.players.Joueur;

public class Phase1 extends Phases implements Phase {

    public Phase1(Joueur[] chosenPlayers) {
        super(chosenPlayers);
    }







    @Override
    public Joueur[] selectPlayers() {
        return new Joueur[0];
    }

    @Override
    public void runGame() {

    }
}
