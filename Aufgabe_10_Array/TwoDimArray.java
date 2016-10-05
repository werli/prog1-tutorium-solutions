package Aufgabe_10_Array;

/**
 * (b) Modifiziere das Programm nun so, dass es ein zweidimensionales boolean-Array
 * der Größe 5 × 5 anstelle eines eindimensionalen Array auf der Konsole ausgibt.
 *
 * @author Phil Werli
 */
public class TwoDimArray {

    public static void main(String[] args) {
        // Anlegen eines zweidimensionalen Arrays, welches wiederum
        // aus lauter eindimensionalen Arrays besteht.
        boolean[][] array = {
                new boolean[]{true, false, true, false, true},
                new boolean[]{true, true, false, true, false},
                new boolean[]{false, true, true, false, true},
                new boolean[]{true, false, true, true, false},
                new boolean[]{false, true, false, true, true},
        };

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
