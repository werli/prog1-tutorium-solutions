package Aufgabe_08_countdown;

/**
 * Schreibe ein Programm, welches eine Methode countdown(int n) hat. Diese Methode
 * soll rekursiv von n bis 1 herunterzählen und dabei jede Zahl ausgeben.
 * Hinweis: Eine <i>rekursive</i> Funktion ruft sich selbst auf. Fehlt eine Abbruchbedingung, läuft
 * sie ewig weiter.
 * <p>
 * <code>
 * Beispielausgabe:
 * n
 * n-1
 * .
 * .
 * .
 * 3
 * 2
 * 1
 * </code>
 * <p>
 * <p>
 * Definition Rekursion via <a href="https://de.wikipedia.org/wiki/Rekursion">Wikipedia</a>:
 * Als Rekursion (lateinisch recurrere ‚zurücklaufen‘) bezeichnet man in einem allgemeinen
 * Sinn die Eigenschaft von Regeln, dass sie auf ein Produkt, das sie erzeugen, von neuem
 * angewandt werden können, wodurch potenziell unendliche Schleifen entstehen.
 *
 * @author Phil Werli
 */
public class Countdown {

    public static void main(String[] args) {
        // Methodenaufruf mit Parameter n = 10
        countdown(10);
    }

    /**
     * Gibt eine gegebene Zahl n auf der Konsole aus und ruft sich selbst
     * mit Paramter (n-1) wieder auf, wenn n eine natürliche Zahl ist.
     *
     * @param n Eine ganzzahlige Zahl, die ausgegeben wird.
     */
    private static void countdown(int n) {

        // wird nur ausgeführt für n echt größer 0
        if (n > 0) {
            System.out.println(n);
            // rekursiver Aufruf der Methode mit neuem Parameter
            countdown(n - 1);
        }
    }
}
