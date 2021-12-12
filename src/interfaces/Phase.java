package interfaces;

import qr.players.Joueur;

public interface Phase {
    public abstract Joueur[] selectPlayers();
    public abstract  void runGame();
}
