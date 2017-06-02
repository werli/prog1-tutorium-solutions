package de.uni_passau.fim.prog1.tutorium.aufgabe03;

/**
 * Erstelle ein Programm, das deinen linken und rechten Sitznachbarn bzw. deine linke
 * und rechte Sitznachbarin in einem Array speichert und dann jeweils mit “Hallo, XYZ”
 * begrüßt.
 *
 * @author <a href="http://github.com/werli">Phil Werli</a>
 */
public class GreetArray {
    public static void main(String[] args) {

        //names Array deklarieren und initialisieren
        String[] names = {"Fabian", "Christoph", "Phil"};

        // Ausgabe des names Array
        for (int i = 0; i < names.length; i++) {
            System.out.println("Hallo " + names[i] + "!");
        }
    }
}
