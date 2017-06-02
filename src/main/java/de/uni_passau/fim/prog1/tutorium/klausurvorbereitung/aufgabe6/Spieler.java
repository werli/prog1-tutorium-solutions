package de.uni_passau.fim.prog1.tutorium.klausurvorbereitung.aufgabe6;

/**
 * Diese Klasse modelliert einen Fußballspieler.
 * <p>
 * Ein Spieler hat eine Standardposition und eine Nummer an erzielten Toren.
 *
 * @author <a href="http://github.com/werli">Phil Werli</a>
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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getAnzahlTore() {
        return anzahlTore;
    }

    public void setAnzahlTore(int anzahlTore) {
        this.anzahlTore = anzahlTore;
    }
}
