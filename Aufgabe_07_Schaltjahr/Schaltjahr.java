package Aufgabe_07_Schaltjahr;

import java.util.Random;

/**
 * Im Jahr 1582 wurde der Gregorianische Kalender eingeführt. Seit diesem Jahr gibt es zu
 * Korrekturzwecken Schaltjahre, in denen der Februar 29 statt 28 Tage hat. Für Schaltjahre
 * gilt folgende Regel: ist die Jahreszahl durch 4 teilbar, ist sie ein Schaltjahr, außer die
 * Jahreszahl ist auch durch 100 teilbar. Ist die Jahreszahl darüber hinaus aber auch durch
 * 400 teilbar, ist sie doch ein Schaltjahr.
 * <p>
 * Beispiele für Schaltjahre: 2016 (da da durch 4 teilbar), 2000 (zwar durch 100 teilbar, aber gleichzeitig durch 400).
 * <p>
 * Beispeilse für keine Schaltjahr: 1580 (da vor 1582), 2015 (da nicht durch 4 teilbar), 1900 (da durch 100 aber nicht durch 400 teilbar).
 * <p>
 * <p>
 * Erstelle ein Programm, welches für ein gegebenes Jahr year berechnet, ob es sich dabei
 * um ein Schaltjahr handelt. year soll dabei mit folgendem Programmcode zufällig
 * bestimmt werden:
 * <code>int year = new Random().nextInt(5000);</code>
 *
 * @author Phil Werli
 */
public class Schaltjahr {
    public static void main(String[] args) {
        int year = new Random().nextInt(5000);

        //Einführung des Schaltjahres mit dem Gregorianischen Kalender im Jahr 1582.
        if (year < 1582) {
            System.out.println("Das Jahr " + year + " ist kein Schaltjahr,"
                    + " da der Gregorianische Kalender erst ab 1582 gilt.");
        } else {
            boolean istSchaltjahr;
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        istSchaltjahr = true; //Flussdiagramm: Ja, Ja, Ja
                    } else {
                        istSchaltjahr = false; //Flussdiagramm: Ja, Ja, Nein
                    }
                } else {
                    istSchaltjahr = true; //Flussdiagramm: Ja, Nein
                }
            } else {
                istSchaltjahr = false; //Flussdiagramm: Nein
            }

            if (istSchaltjahr) { // gleichbedeutend mit if(istSchaltjahr == true) {...
                System.out.println("Das Jahr " + year + " ist ein Schaltjahr.");
            } else {
                System.out.println("Das Jahr " + year + " ist kein Schaltjahr.");
            }
        }
    }

    /**
     * Alternativer Lösungsansatz in einer Methode.
     * Überprüft nur die Fälle, in denen das Jahr ein Schaltjahr sein kann.
     * 1.) Schaltjahr ist durch 400 teilbar (z.B. 2000).
     * 2.) Das Schaltjahr ist durch 4 teilbar, aber gleichzeitig nicht durch 100 (z.B. 2016).
     *
     * @param year Das zu überprüfende Jahr.
     * @return Ob das gegebene Jahr ein Schaltjahr ist.
     */
    private boolean istSchaltjahr(int year) {
        if (year >= 1582) {
            if (year % 400 == 0 || (year % 4 == 0 && (year % 100 != 0))) {
                return true;
            }
        }
        return false;
    }

    /**
     * Sehr kurzer aber komplexerer Lösungsansatz.
     * Überprüft auf diesselbe Weise wie {@link #istSchaltjahr(int)}.
     * <p>
     * Beachte die Klammerung!
     * Es wird zuerst überprüft, ob das gegebene Jahr größer ist als 1582.
     * Ist das der Fall, wird überprüft, ob das Jahr ein Schaltjahr sein kann.
     * Ist das Jahr durch 400 teilbar, ist das Jahr ein Schaltjahr und der weitere Teil
     * <code>(year % 4 == 0) && (year % 100 != 0)</code> wird nicht mehr überprüft.
     * Ist das Jahr nicht durch 400 teilbar, wird noch überprüft, ob es durch 4 und gleichzeitig nicht
     * durch 100 teilbar ist.
     *
     * @param year Das zu überprüfende Jahr.
     * @return Ob das gegebene Jahr ein Schaltjahr ist.
     */
    private boolean istSchaltjahrVerkuerzt(int year) {
        return year >= 1582 && (year % 400 == 0 || (year % 4 == 0) && (year % 100 != 0));
    }
}
