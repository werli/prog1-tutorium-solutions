package de.uni_passau.fim.prog1.tutorium.aufgabe10.b;

/**
 * (b) Modifiziere das Programm nun so, dass es ein zweidimensionales boolean-Array
 * der Größe 5 × 5 anstelle eines eindimensionalen Array auf der Konsole ausgibt.
 *
 * @author <a href="http://github.com/werli">Phil Werli</a>
 */
public class TwoDimArray {

    public static void main(String[] args) {
        /*
        * Anlegen eines Arrays, das wiederum boolean Arrays beinhaltet.
        * In diesen kann man dann boolean Werte speichern.
        */
        boolean[][] array = {
                new boolean[]{true, false, true, false, true},
                new boolean[]{true, true, false, true, false},
                new boolean[]{false, true, true, false, true},
                new boolean[]{true, false, true, true, false},
                new boolean[]{false, true, false, true, true}
        };
        /*
        Alternative Deklaration.
        boolean[][] array = {
                {true, false, true, false, true},
                {true, true, false, true, false},
                {false, true, true, false, true},
                {true, false, true, true, false},
                {false, true, false, true, true}
        };
        */

        /*
         * Gibt das Array Zeile für Zeile, Spalte für Spalte aus.
         */
        for (int row = 0; row < array.length; ++row) {
            // array[row].length gibt die Anzahl der Spalten in der Zeile am Index row aus.
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
