package qr.phases;

import interfaces.Phase;
import qr.players.Joueur;

public class Phase3 extends Phases implements Phase {

    public Phase3(Joueur[] phase2winners) {
        super(phase2winners);
        winners = new Joueur[1];
    }


    @Override
    public void selectPlayers() {

    }

    @Override
    public void runGame() {

    }
}
