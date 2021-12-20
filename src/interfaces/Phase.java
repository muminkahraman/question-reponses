package interfaces;

import qr.players.Joueur;
import qr.themes.Theme;

/**
 * interface des Phase
 */
public interface Phase {
    /**
     * Selectionner les gagnants pour la prochaine phase et les ajouter dans
     * le tableau winners[]
     */
    public  void selectPlayers();

    /**
     * lancer la phase
     */
    public  void runGame();
}
