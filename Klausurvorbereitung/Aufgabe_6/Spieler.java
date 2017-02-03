package Klausurvorbereitung.Aufgabe_6;

/**
 * Diese Klasse modelliert einen Fußballspieler.
 * <p>
 * Ein Spieler hat eine Standardposition und eine Nummer an erzielten Toren.
 */
public class Spieler {

    private Position position;
    private int anzahlTore;

    /**
     * Konstruiert ein neues Objekt der Klasse Spieler.
     *
     * @param position die {@link Position} des Spielers
     * @param anzahlTore die Anzahl der erzielten Tore eines Spielers
     */
    public Spieler(Position position, int anzahlTore) {
        this.position = position;
        this.anzahlTore = anzahlTore;
    }

    public int getAnzahlTore() {
        return anzahlTore;
    }

    public void setAnzahlTore(int goals) {
        this.anzahlTore = goals;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
