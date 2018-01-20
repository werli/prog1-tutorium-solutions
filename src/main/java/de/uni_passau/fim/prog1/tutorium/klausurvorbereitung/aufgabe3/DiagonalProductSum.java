package de.uni_passau.fim.prog1.tutorium.klausurvorbereitung.aufgabe3;

/**
 * Erstelle eine Methode diagonalProductSum, die für ein übergebenes zweidimensionales
 * quadratisches Array zunächst das Produkt über die beiden Diagonalen bildet und diese
 * dann aufaddiert. Das Ergebnis soll zurückgegeben werden. Falls ein Eintrag der Matrix
 * den Wert 0 hat, so soll dieser übersprungen werden.
 * <p>
 * <blockquote><pre>
 * 3, 8, 3, 4, 1
 * 5, 0, 7, 4, 9
 * 9, 8, 2, 6, 2 -> (3 * 2 * 1 * 3) + (1 * 4 * 2 * 3) = 18 + 24 = 42
 * 2, 0, 4, 1, 6
 * 3, 2, 3, 5, 3
 * </pre></blockquote>
 *
 * @author <a href="http://github.com/werli">Phil Werli</a>
 */
public class DiagonalProductSum {

    public static void main(String[] args) {
        int[][] array = {
                {3, 8, 3, 4, 1},
                {5, 0, 7, 4, 9},
                {9, 8, 2, 6, 2},
                {2, 0, 4, 1, 6},
                {3, 2, 3, 5, 3}};

        System.out.println(diagSum(array));
    }

    /**
     * Berechnet für ein übergebenes zweidimensionales quadratisches Array das Produkt einmal der fallenden
     * und einmal der steigenden Diagonale. Die Summe der beiden Produkte wird dann zurückgegeben.
     * <p>
     * Falls ein Eintrag der Matrix den Wert 0 hat, wird dieser übersprungen, da sonst das ganze Produkt 0 ist.
     *
     * @param array das übergebene zweidimensionale Array.
     * @return die Summe der Produkte der fallenden und steigenden Diagonale.
     */
    private static int diagSum(int[][] array) {
        // neutrales Element bei der Multiplikation ist 1
        int fallingDiagonalProduct = 1;
        int risingDiagonalProduct = 1;

        for (int i = 0; i < array.length; i++) {
            // Durchgang der fallenden Diagonale
            if (array[i][i] != 0) { //
                // (a = a * b) == (a *= b) = true
                fallingDiagonalProduct *= array[i][i];
            }

            // Durchgang der steigenden Diagonale
            int lastColumn = array.length - 1;
            if (array[i][lastColumn - i] != 0) {
                risingDiagonalProduct *= array[i][lastColumn - i];
            }
        }
        return fallingDiagonalProduct + risingDiagonalProduct;
    }

}
