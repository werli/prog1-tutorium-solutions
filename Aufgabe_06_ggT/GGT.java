package Aufgabe_06_ggT;

import java.util.Random;

/**
 * Erstelle ein Programm, welches den größten gemeinsamen Teiler (ggT) zweier Zahlen a und b
 * mithilfe des Euklidischen Algorithmus berechnet. Die Zahlen a und b sollen dabei mit
 * folgendem Programmcode zufällig bestimmt werden:
 * <code>int a = new Random().nextInt(100);</code>
 * <code>int b = new Random().nextInt(100);</code>
 * <p>
 * <p>
 * >Pseudocode des Euklidischen Algorithmus:
 * <code>
 * solange b != 0
 *    wenn a > b dann
 *      a = a − b
 *   sonst
 *      b = b − a
 * return a
 * </code>
 *
 * @author Phil Werli
 */
public class GGT {
    public static void main(String[] args) {
        int a = new Random().nextInt(100);
        int b = new Random().nextInt(100);

        // Lösung in eigener Methode
        int ggT = ggT(a, b);
        System.out.println("Der größte gemeinsame Teiler von "
                + a + " und " + b + " ist " + ggT + ".");

        // Lösung in der main-Methode erfordert Zwischenspeichern von a und b.
        int outputA = a;
        int outputB = b;

        // keine Division durch 0
        if (a != 0 && b != 0) {
            // "solange b nicht 0 ist"
            while (b != 0) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            System.out.println("Der größte gemeinsame Teiler von "
                    + outputA + " und " + outputB + " ist " + a + ".");
        }
    }

    /**
     * Gibt den größten gemeinsamen Teiler zweier Zahlen a und b zurück.
     *
     * @return den größten gemeinsamen Teiler zweier Zahlen.
     */
    private static int ggT(int a, int b) {
        // "solange b nicht 0 ist"
        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}