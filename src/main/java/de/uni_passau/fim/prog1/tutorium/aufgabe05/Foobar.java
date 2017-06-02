package de.uni_passau.fim.prog1.tutorium.aufgabe05;

/**
 * Erstelle ein Programm, welches die Zahlen 1 bis 100 zeilenweise auf der Konsole ausgibt.
 * Wenn die Zahl durch 3 teilbar ist, soll statt der Zahl selbst der String <code>foo</code> ausgegeben werden.
 * Wenn die Zahl durch 5 teilbar ist, soll statt der Zahl selbst der String <code>bar</code> ausgegeben werden.
 * Wenn die Zahl sowohl durch 3 als auch durch 5 teilbar ist, soll <code>foobar</code> ausgegeben werden.
 *
 * @author <a href="http://github.com/werli">Phil Werli</a>
 */
public class Foobar {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // Überprüfung ob i durch 3 UND 5 teilbar ist.
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("foobar");
            }
            // Überprüfung ob i durch 3 ist.
            else if (i % 3 == 0) {
                System.out.println("foo");
            }
            // Überprüfung ob i durch 5 ist.
            else if (i % 5 == 0) {
                System.out.println("bar");
            }
            // Nachdem die Zahl weder durch 3 noch durch 5 teilbar ist, muss das nicht mehr überprüft werden.
            else {
                System.out.println(i);
            }
        }
    }
}
