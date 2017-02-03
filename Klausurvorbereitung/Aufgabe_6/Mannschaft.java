package Klausurvorbereitung.Aufgabe_6;

/**
 * Diese Klasse modelliert eine Fußballmannschaft.
 * <p>
 * Eine Mannschaft besteht aus 7 Spielern.
 * <p>
 * Es gibt eine Statistikkomponente, die für eine Mannschaft den Spieler zurückgibt, der die meisten Tore geschossen hat.
 */
public class Mannschaft {

    private Spieler[] spieler = new Spieler[7];

    /**
     * Konstruiert ein neues Objekt der Klasse Mannschaft.
     *
     * @param spieler die Spieler der Mannschaft.
     */
    public Mannschaft(Spieler[] spieler) {
        this.spieler = spieler;
    }

    /**
     * Ermittelt den besten Torschützen dieser Mannschaft und gibt ihn zurück.
     *
     * @return den {@link Spieler} mit den meisten erzielten Toren.
     */
    public Spieler getTopScorer() {
        Spieler topScorer = null;
        int mostGoals = 0;
        for (int i = 0; i < spieler.length; i++) {
            if (spieler[i].getAnzahlTore() > mostGoals) {
                mostGoals = spieler[i].getAnzahlTore();
                topScorer = spieler[i];
            }
        }
        return topScorer;
    }

    public Spieler[] getPlayers() {
        return spieler;
    }

    public void setPlayers(Spieler[] players) {
        this.spieler = players;
    }
}
