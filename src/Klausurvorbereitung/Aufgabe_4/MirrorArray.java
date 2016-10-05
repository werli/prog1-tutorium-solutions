package Klausurvorbereitung.Aufgabe_4;

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
 * @author Phil Werli
 */
public class MirrorArray {

    public static void main(String[] args) {
        int[][] array = {
                {3},
                {5, 0},
                {9, 8, 2},
                {2, 0, 4, 1},
                {3, 2, 3, 5, 3}};
        // spiegeln des Arrays durch Call by Reference
        mirrorArray(array);
        // Ausgabe des Arrays
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
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
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < (array[i].length / 2); j++) {
                int temp = array[i][j];
                array[i][j] = array[i][array[i].length - 1 - j];
                array[i][array[i].length - 1 - j] = temp;
            }
        }
    }
}
