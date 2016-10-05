package Aufgabe_10_Array;

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
 * @author Phil Werli
 */
public class FallingDiagonalArray {
    public static void main(String[] args) {
        // Lösung aus Teilaufgabe (e). Garantiert ein quadratisches Array.
        int size = 5;
/*         Der Wert eines boolean ist ohne explizierte Deklaration <code>false</code>.
         Das heißt, das unten erstelle zweidimensionale Array besteht erstmal NUR aus <code>false</code> Werten.*/
        boolean[][] array = new boolean[size][size];

        /*
        Die fallende Diagonale: [0][0], [1][1],
        .
        .
        .
        [array.length -1][array.length -1]

        Laufzeit: O(n^2)
         */
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (row == column) {
                    array[row][column] = true;
                }
            }
        }

        /*
        Die fallende Diagonale ist immer dann, wenn row == column.
        Wenn man column nur dann braucht, wenn sie gleich row sind, braucht
        man column gar nicht.

        Statt O(n^2) ist die Laufzeit somit O(n)
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
