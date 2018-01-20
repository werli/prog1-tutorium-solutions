package de.uni_passau.fim.prog1.tutorium.klausurvorbereitung.aufgabe4;

/**
 * Schreibe eine Methode mirrorArray, die ein übergebenes zweidimensionales Array an der
 * Vertikalen spiegelt. Die Zeilen der Matrix können dabei unterschiedliche Längen haben.
 * In diesem Fall soll jede Zeile jeweils in ihrer Mitte gespiegelt werden.
 * Beispiel:
 * <blockquote><pre>
 * 3            3
 * 0 5          5 0
 * 9 8 2     →  2 8 9
 * 1 4 0 2      2 0 4 1
 * 3 2 3 5 3    3 5 3 2 3
 * </pre></blockquote>
 *
 * @author <a href="http://github.com/werli">Phil Werli</a>
 */
public class MirrorArray {

    public static void main(String[] args) {
        int[][] array = {
                {3},
                {5, 0},
                {9, 8, 2},
                {2, 0, 4, 1},
                {3, 2, 3, 5, 3}};
        // Spiegelung des Arrays durch Call by Reference
        mirrorArray(array);
        // Ausgabe des Arrays
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Spiegelt den Inhalt des gegebenes Array an der vertikalen Linie.
     * <p>
     * Man muss kein Array zurückgeben, da das Array durch Call-by-Reference verändert wird.
     *
     * @param array das gegebene Array, das gespiegelt wird.
     */
    private static void mirrorArray(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < (array[row].length / 2); col++) {
                int temp = array[row][col];
                array[row][col] = array[row][array[row].length - 1 - col];
                array[row][array[row].length - 1 - col] = temp;
            }
        }
    }
}
