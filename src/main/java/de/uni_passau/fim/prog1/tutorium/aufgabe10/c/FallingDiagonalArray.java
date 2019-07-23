package de.uni_passau.fim.prog1.tutorium.aufgabe10.c;

/**
 * (c) Modifiziere das Programm nun so, dass es das Array so belegt, dass die fallende
 * Diagonale (von links oben nach rechts unten) den Wert true und alle anderen
 * Elemente den Wert false haben.
 * Beispielausgabe:
 * <code>
 * X 0 0 0 0
 * 0 X 0 0 0
 * 0 0 X 0 0
 * 0 0 0 X 0
 * 0 0 0 0 X
 * </code>
 * <p>
 * (e) Führe eine Variable size ein und modifiziere das Programm, sodass beliebig große
 * Arrays abhängig von size) belegt und ausgegeben werden können.
 *
 * @author <a href="http://github.com/werli">Phil Werli</a>
 */
public class FallingDiagonalArray {
    public static void main(String[] args) {
        // Lösung aus Teilaufgabe (e). Garantiert ein quadratisches Array.
        int size = 5;
        /*
         * Der Wert eines boolean ist ohne explizierte Deklaration <code>false</code>.
         * Das heißt, das unten erstellte zweidimensionale Array besteht erstmal NUR aus <code>false</code> Werten.
         */
        boolean[][] array = new boolean[size][size];

        /*
         * Idee: Die fallende Diagonale ist genau dann, wenn Index der Zeile gleich dem Index der Spalte ist.
         *
         * [0][0],
         * [1][1],
         * .
         * .
         * .
         * [array.length -1][array.length -1]
         * Hier wird array.length - 1 gewählt, da der Index für die Länge des Arrays bei 1 beginnt, wohingegen
         * der Index für die Elemente des Arrays bei 0 beginnt.
         *
         * Laufzeit: O(n^2).
         */
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (row == column) {
                    array[row][column] = true;
                }
            }
        }

        /*
         * Optimierungsidee: Man braucht column nur dann, wenn es den selben Wert wie row hat.
         * Dadurch kann man sich die Schleife einsparen, die die Spalten durchgegangen ist.
         *
         * Dadurch erreicht man statt quadratischer Laufzeit O(n^2) eine lineare Laufzeit O(n).
         */
        for (int i = 0; i < array.length; i++) {
            array[i][i] = true;
        }

        // gibt das Array Zeile für Zeile, Spalte für Spalte aus
        for (int row = 0; row < array.length; ++row) {
            // array[row].length gibt die Anzahl der Spalten in der Zeile row aus
            for (int column = 0; column < array[row].length; ++column) {
                if (array[row][column]) {
                    System.out.print('X');
                } else {
                    System.out.print('O');
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
