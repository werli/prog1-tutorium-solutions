package de.uni_passau.fim.prog1.tutorium.aufgabe22;

/**
 * Diese Klasse repräsentiert eine Ziege, welche
 */
public class Goat {
    private int currentRow;
    private int currentCol;
    private boolean dead;

    public Goat(int currentRow, int currentCol) {
        this.currentRow = currentRow;
        this.currentCol = currentCol;
        this.dead = false;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public int getCurrentCol() {
        return currentCol;
    }

    public void setCurrentCol(int currentCol) {
        this.currentCol = currentCol;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }
}
