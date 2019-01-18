package de.uni_passau.fim.prog1.tutorium.klausurvorbereitung.aufgabe1;

/**
 * Erstelle eine Methode crossSum, die für eine übergebene natürliche Zahl deren Quersumme
 * berechnet und auf der Konsole ausgibt.
 * <blockquote><pre>
 * Beispiel: Quersumme von 232 : 2 + 3 + 2 = 7
 * </pre></blockquote>
 *
 * @author <a href="http://github.com/werli">Phil Werli</a>
 */

public class CrossSum {

    public static void main(String[] args) {
        System.out.println("Ziffernsumme von 232: " + crossSum(232));

        System.out.println("Ziffernsumme von 777777: " + crossSumWithChars(777777));
    }

    /**
     * Berechnet für eine gegebene Zahl die Quersumme aus und gibt diese zurück.
     *
     * @param number Die gegebene Zahl, deren Quersumme berechnet wird.
     * @return die Quersumme der gegebenen Zahl.
     */
    private static int crossSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum = sum + (number % 10); // hole letzte Stelle mit der modulo-Operation: 232 % 10 = 2
            number = number / 10;      // verwirf letzte Stelle: 232 / 10 = 23
        }
        return sum;
    }

    /**
     * Berechnet für eine gegebene Zahl die Quersumme, indem die Zahl in ein Array von Charactern aufgeteilt und diese
     * Werte dann nacheinander wieder in Strings und dann in Zahlen umgewandelt und zur Summe hinzuaddiert werden.
     *
     * @param number Die gegebene Zahl, deren Quersumme berechnet wird.
     * @return die Quersumme der gegebenen Zahl.
     */
    private static int crossSumWithChars(int number) {
        int sum = 0;
        char[] chars = String.valueOf(number).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            sum += Character.getNumericValue(chars[i]);

            // Stattdessen funkioniert auch Folgendes
            // sum += Integer.valueOf(String.valueOf(chars[i]));
        }
        return sum;
    }
}
