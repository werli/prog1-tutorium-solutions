package Aufgabe_12_arraySum;

/**
 * Schreibe ein Programm, welches die Summe des größten Wertes aller Spalten eines
 * zweidimensionalen Arrays berechnet. Das Array kann mehrere Zeilen haben (≥ 1) Das
 * Array kann dabei beliebig hardcodiert initialisiert werden. Zusätzlich kann davon
 * ausgegangen werden, dass das Array rechtecking ist.
 *
 * Beispiel 1:
 * _________
 * |4|6|7|8|
 * |8|3|1|6|  ergibt 29, da 8 + 6 + 7 + 8 = 29.
 * ‾‾‾‾‾‾‾‾‾
 * Beispiel 2:
 * _____________
 * |4|6|7|8|2|7|
 * |8|3|1|6|3|1|  ergibt 42, da 8 + 6 + 9 + 8 + 4 + 7 = 42.
 * |1|4|9|2|4|5|
 * ‾‾‾‾‾‾‾‾‾‾‾‾‾
 * Beispielausgabe:
 * Die Summe des größten Wertes aller Spalten des Arrays ist 29.
 */
public class arraySum {

    public static void main(String[] args) {
        int[][] array = {
                {4, 6, 7, 8},
                {8, 3, 1, 6}};
       /*
        * Idee: Gehe jede Spalte Zeile für Zeile durch und schaue dort nach dem Maximum.
        * Addiere das Maxiumum der Spalten auf eine Variable sum.
        */
        int sum = 0;

        /*
         * array[0].length liefert die Anzahl der Zeilen in der ersten Spalte.
         * Da das Array rechteckig ist, hat die erste Spalte gleich viele Zeile wie die anderen Spalten.
         */
        for (int column = 0; column < array[0].length; ++column) { // gehe über Spalten ...
            // maximaler Wert in einer Spalte
            int max = 0;

            for (int row = 0; row < array.length; ++row) { // ... und danach über Zeilen
                if (array[row][column] > max) {
                    max = array[row][column];
                }
            }

            sum = sum + max;
        }
        System.out.println("Die Summe des größten Wertes aller Spalten des Arrays ist " + sum + ".");
    }
}
