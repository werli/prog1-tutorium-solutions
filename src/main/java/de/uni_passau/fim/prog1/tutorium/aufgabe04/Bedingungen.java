package de.uni_passau.fim.prog1.tutorium.aufgabe04;

import java.util.Random;

/**
 * Erstelle ein Programm, welches für eine int-Variable <code>number</code> ausgibt, ob diese durch 3,
 * durch 5 oder durch keine/beide der beiden Zahlen teilbar ist. Der Wert der Varibale <code>number</code>
 * soll dabei mit folgendem Programmcode zufällig bestimmt werden:
 * <code>int number = new Random().nextInt(100);</code>
 * <p>
 * Tipp: Verwende die Modulo-Operation.
 *
 * @author <a href="http://github.com/werli">Phil Werli</a>
 */
public class Bedingungen {
    public static void main(String[] args) {

        // Random().nextInt(n) generiert eine zufällige Zahl zwischen 0 und n.
        int number = new Random().nextInt(100);

        if ((number % 3 == 0) && (number % 5 == 0)) {
            System.out.println(("Die Zahl " + number + " ist durch 3 und durch 5 teilbar."));
        } else if (number % 3 == 0) {
            // Überprüfung ob Zahl durch 3 teilbar ist.
            System.out.println("Die Zahl " + number + " ist durch 3 teilbar.");
        } else if (number % 5 == 0) {
            // Überprüfung ob die Zahl durch 5 teilbar ist.
            System.out.println("Die Zahl " + number + " ist durch 5 teilbar.");
        } else {
            // Wird ausgeführt, wenn keine if Bedingung zutrifft.
            System.out.println("Die Zahl ist weder durch 3 noch durch 5 teilbar.");
        }
    }
}
