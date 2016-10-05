package Klausurvorbereitung.Aufgabe_1;

/**
 * Erstelle eine Methode crossSum, die für eine übergebene natürliche Zahl deren Quersum-
 * me berechnet und auf der Konsole ausgibt.
 * <blockquote><pre>
 * Beispiel: Quersumme von 232 : 2 + 3 + 2 = 7
 * </pre></blockquote>
 *
 * @author Phil Werli
 */

public class CrossSum {

    /**
     * Berechnet für eine gegebene Zahl die Quersumme aus und gibt diese zurück.
     *
     * @param number Die gebene Zahl, deren Quersumme berechnet wird.
     * @return die Quersumme der gegebenen Zahl.
     */
    private static int crossSum(int number) {

        // Summen Variable, auf die summiert wird
        int sum = 0;
        while (number > 0) {
            sum = sum + (number % 10); // hole letzte Stelle mit der modulo-Operation: 232 % 10 = 2
            number = number / 10;      // vewirf letzte Stelle: 232 / 10 = 23
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Ziffernsumme von 232: " + crossSum(232));
    }
}
