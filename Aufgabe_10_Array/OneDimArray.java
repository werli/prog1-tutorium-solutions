package Aufgabe_10_Array;

/**
 * (a) Schreibe ein Programm, welches ein boolean-Array der Größe 5 auf der
 * Konsole ausgibt. Der Wert <code>true</code> soll dabei als X dargestellt
 * werden, der Wert <code>false</code> als 0. Das Array kann dabei beliebig
 * hardcodiert initialisiert werden.
 * <p>
 * Beispielausgabe:
 * <code>0 X 0 X 0</code>
 *
 * @author Phil Werli
 */
public class OneDimArray {
    public static void main(String[] args) {
        // Hardcodierung des Arrays
        boolean[] array = {true, false, true, false, true};

        for (int i = 0; i < array.length; i++) {
            if (array[i]) { // identisch mit (array[i] == true)
                System.out.print('X');
            } else {
                System.out.print('O');
            }
            System.out.print(" ");
        }
        System.out.println();
    }
}
