package Aufgabe_11_outputArray;

/**
 * Schreibe eine Methode printArray(boolean[][] array), welche ein zweidimensionales boolean-Array ausgibt.
 * Schreibe anschließend die Methoden {@link #addDiagFalling(boolean[][])} und
 * {@link #addDiagRising(boolean[][])}, welche das übergebene Array auf der fallende
 * Diagonale (von links oben nach rechts unten) bzw. der steigenden Diagonale
 * (von links unten nach rechts oben) mit <code>true</code> belegt.
 *
 * @author Phil Werli
 */
public class outputArray {

    public static void main(String[] args) {
        int size = 5;
        boolean[][] array = new boolean[size][size];

        System.out.println("Diagonal Array:");
        addDiagFalling(array);
        printArray(array);

        System.out.println("Cross Array:");
        addDiagRising(array);
        printArray(array);
    }

    /**
     * Verändert das gegebene zweidimensionale boolean-Array, sodass
     * eine fallende Diagonale Linie hinzugefügt wird.
     *
     * @param array ein Zweidimensionales Array, das eine fallende Diagonale bekommt.
     */
    private static void addDiagFalling(boolean[][] array) {
        for (int i = 0; i < array.length; ++i) {
            // Auf der Diagonale sind die Indices gleich
            array[i][i] = true;
        }
    }

    /**
     * Verändert das gegebene zweidimensionale boolean-Array, sodass
     * eine steigende Diagonale Linie hinzugefügt wird.
     *
     * @param array ein Zweidimensionales Array, das eine steigende Diagonale bekommt.
     */
    private static void addDiagRising(boolean[][] array) {
        for (int i = 0; i < array.length; ++i) {
            array[array.length - 1 - i][i] = true;
        }
    }

    /**
     * Gibt ein gegebenes zweidimensionales boolean Array aus.
     * <code>true</code> gibt ein 'X',
     * <code>false</code> gibt ein 'O' aus.
     *
     * @param array Das auszugebene Array.
     */
    public static void printArray(boolean[][] array) {
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
