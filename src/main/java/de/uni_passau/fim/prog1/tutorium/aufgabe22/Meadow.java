package de.uni_passau.fim.prog1.tutorium.aufgabe22;

import java.util.Random;

/**
 * Bitte bedenke: Dies ist nur ein Lösungvorschlag der Tutoren.
 *
 * <p>Alte Klausuraufgabe: Goat Life.
 * Die genaue Angabe ist auf dem Tutoriumsblatt 5 Aufgabe 22 gegeben.
 */
public class Meadow {
    /**
     * Die Größe der Wiese.
     */
    private static final int MEADOW_SIZE = 5;

    /**
     * Ein Random Number Generator, welcher (wie der Name schon suggeriert) zufällige Zahlen
     * generieren kann.
     */
    private final Random rng;

    /**
     * Die Ziege, die auf der Wiese lebt. Sie ist sehr hungrig.
     */
    private final Goat goat;

    /**
     * Stellt eine Wiese dar. Jede Zelle repräsentiert die Höhe des Grases.
     */
    private final int[][] meadow;

    /**
     * Konstruiert die Wiese.
     */
    public Meadow() {
        rng = new Random();
        this.goat = new Goat(rng.nextInt(MEADOW_SIZE), rng.nextInt(MEADOW_SIZE));
        this.meadow = rMeadow(MEADOW_SIZE, MEADOW_SIZE);
    }

    /**
     * Initialisiert die Wiese und die einzelnen Zellen. Jede Zelle hat eine zufällige Grashöhe
     * zwischen 1 und 10.
     *
     * @param width Die Breite der Wiese
     * @param height Die Höhe der Wiese
     * @return eine Wiese welche Zellen zufällig langes Gras haben
     */
    private int[][] rMeadow(int width, int height) {
        int[][] meadow = new int[height][width];
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                meadow[row][col] = 1 + rng.nextInt(10);
            }
        }
        return meadow;
    }

    /**
     * Simuliert einen Tag der Ziege auf dieser Wiese. Die Ziege kann verhungern, wenn die Wiese
     * kein Gras mehr hat. Genauere Regeln stehen auf der Angabe.
     */
    public void nextDay() {
        int goatRow = goat.getCurrentRow();
        int goatCol = goat.getCurrentCol();

        int maxValue = meadow[goatRow][goatCol];
        int maxRow = goatRow;
        int maxCol = goatCol;
        for (int row = -1; row <= 1; row++) {
            for (int col = -1; col <= 1; col++) {
                // Positionen abhängig der ursprünlichen Position der Ziege
                int curRow = goatRow + row;
                int curCol = goatCol + col;

                if (curRow >= 0 && curCol >= 0 && curRow < meadow.length &&
                        curCol < meadow[row].length) {
                    int currentValue = meadow[curRow][curCol];
                    if (currentValue > maxValue) {
                        maxValue = currentValue;
                        maxRow = curRow;
                        maxCol = curCol;
                    }
                }
            }
        }
        if (maxValue <= 0) {
            goat.setDead(true);
            return;
        }

        goat.setCurrentRow(maxRow);
        goat.setCurrentCol(maxCol);
        meadow[maxRow][maxCol] -= 30;

        for (int row = 0; row < meadow.length; row++) {
            for (int col = 0; col < meadow[row].length; col++) {
                if (row != maxRow && col != maxCol) {
                    meadow[row][col] += rng.nextInt(3);
                }
            }
        }
    }
}
