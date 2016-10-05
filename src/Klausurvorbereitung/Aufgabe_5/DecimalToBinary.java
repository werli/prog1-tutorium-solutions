package Klausurvorbereitung.Aufgabe_5;

/**
 * Schreibe eine Methode decimalToBinay, die eine übergebene natürliche Zahl iterativ in
 * eine Binärzahl (als String) konvertiert und zurückgibt. Der Zahlenbereich für die überge-
 * bene Zahl umfasst alle positiven Zahlen, die durch den Datentyp int dargestellt werden
 * können.
 * Hinweis: Du kannst das folgende Stück Code verwenden, um die Potenz c = a b zu berechnen:
 * int c = Math.pow ( a , b ) ;
 * Beispiel: Math.pow(2, 5) entspricht 2 5 und liefert 32 zurück.
 * Beispiel: Der Aufruf decimalToBinay(42) liefert den String "101010" zurück.
 * <p>
 * WICHTIG: für diese Aufgabe gibt es viel Lösungsvarianten!
 *
 * @author Phil Werli
 */
public class DecimalToBinary {

    public static void main(String[] args) {
        System.out.println("Dec: 8 == Bin: " + decimalToBinary(8));
        System.out.println("Dec: 7 == Bin: " + decimalToBinary(7));
        System.out.println("Dec: 8 == Bin: " + decimalToBinaryWithPow(8));
        System.out.println("Dec: 7 == Bin: " + decimalToBinaryWithPow(7));

    }

    /**
     * Gibt die Binärdarstellung einer gegebenen Zahl in Form eines String zurück.
     *
     * @param number die gegebene Zahl, deren Binärdarstellung zurückgegeben wird.
     * @return die Binärdarstellung einer gegebenen Zahl.
     */
    private static String decimalToBinary(int number) {
        String output = "";

        // Vorgehenweise: Vergleiche Ziffernsumme
        while (number > 0) {
            // number % 2 liefert entweder 0 oder 1. Das wird dann links konkateniert, da hier zuerst die kleinen
            // Potenzen und danach dann die größeren überprüft werden.
            output = (number % 2) + output;
            number = number / 2;
        }

        return output;
    }

    /**
     * Gibt die Binärdarstellung einer gegebenen Zahl in Form eines String zurück.
     *
     * @param number die gegebene Zahl, deren Binärdarstellung zurückgegeben wird.
     * @return die Binärdarstellung einer gegebenen Zahl.
     */
    private static String decimalToBinaryWithPow(int number) {
        String output = "";

        // Variable started verhindert führende Nullen. Wird auf true gesetzt, sobald die erste 1 geschrieben wird.
        boolean started = false;
        for (int i = 31; i >= 0; i--) {
            if (Math.pow(2, i) <= number) {
                number -= Math.pow(2, i);

                // Konkatenieren rechts des outputs, da die großen Zahlen vor den kleinen überprüft werden sollen
                output = output + 1;
                started = true;
            } else if (started) {
                output = output + 0;
            }
        }
        return output;
    }

    /**
     * Gibt die Binärdarstellung einer gegebenen Zahl in Form eines String zurück.
     *
     * @param number die gegebene Zahl, deren Binärdarstellung zurückgegeben wird.
     * @return die Binärdarstellung einer gegebenen Zahl.
     */
    private static String decimalToBinaryWithGivenMethod(int number) {
        // ruft die statische Methode toBinaryString(int i) in der Klasse long auf
        return Long.toBinaryString(number);
    }
}
