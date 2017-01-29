package Aufgabe_16b_GrowingArrays;

import Aufgabe_15a_CMS.Student;
import Aufgabe_16a_GrowingArrays.GrowingArray;

/**
 * Modifiziere die Klasse GrowingArray, sodass nicht int-Werte, sondern Objekte jeder
 * Art darin gespeichert werden können.
 *
 * @author Phil Werli
 */
public class GrowingArrayObject {

    private Object[] array;
    // Wir speichern das aktuelle Listenende, um die Listenfunktionen simpler implementieren zu können.
    private int curPos;

    /**
     * Konstruktor für Growing-Array-Objekt.
     */
    public GrowingArrayObject(int size) {
        array = new Object[size];
        curPos = 0;
    }

    public static void main(String[] args) {
        // Test
        GrowingArrayObject array = new GrowingArrayObject(10);
        System.out.println("Ist das Array leer? " + array.isEmpty());

        // Nachdem jede Klasse von Object erbt, kann man ALLES in diesem Array speichern.
        array.add(1);      // Integer?
        array.add(2.1);    // Floats?
        array.add('c');    // Character? Kein Problem.
        array.add(100);    // Noch einen Integer,
        array.add("hallo");// oder einen String? Kein Problem.
        array.add(new int[]{9, 4, 0, 3, 2}); // Ein Array von Integern? Man kann ja wirklich alles speichern....
        array.add(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}); // mehr als eine Dimension? Kein Thema.
        array.add(new Student("Bieber", "Justin", 12345, "Musicology", 3)); // Unsere Studentenklasse? Wow. Was kommt denn als nächstes.
        array.add(new GrowingArray(100)); // Ich habe keine Witze gemacht als ich meinte, dass man alles da drinnen speichern kann...

        System.out.println("Die Größe des Arrays ist " + array.size());
        System.out.println("Ist das Array leer? " + array.isEmpty());
        System.out.println("Objekt an der Stelle 5: " + array.get(5));
        System.out.println("Objekt an der Stelle 5: " + array.get(8));
        System.out.println("Komplettes Array:");
        array.print();
    }

    /**
     * Fügt einen neuen Wert “hinten” an. Wenn das darunterliegende Array zu klein ist, um einen neuen Wert aufzunehmen,
     * dann sollen alle Werte in ein neues doppelt so großes Array kopiert werden.
     *
     * @param value Das Objekt, der hinzugefügt werden soll.
     */
    public void add(Object value) {
        // Überprüfe, ob im Array noch Platz ist.
        if (curPos > array.length - 1) {
            // Falls nicht, erstelle ein neues, doppelt so großes Array.
            Object[] newArray = new Object[array.length * 2];
            // Kopiere alle Werte aus dem alten in das neue Array
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }

            // Die oben implementiert Funktionalität gibt es schon in der statischen Methode Arrays.copyOf(int[], int)
            // array = Arrays.copyOf(array, array.length * 2);

            // Damit unser GrowingArrayObject-Objekt in Zukunft das neue Array übernimmt, setzen wir array = newArray.
            array = newArray;
        }
        // Schließlich muss nur noch die Cursor Position geupdated und hochgezählt werden.
        array[curPos] = value;
        curPos++;
    }

    /**
     * Gibt den Wert an der Position pos zurück.
     *
     * @param pos Die Position deren Wert gefunden werden soll.
     * @return Der Wert an der gegebenen Position.
     * @throws IllegalArgumentException wenn die übergebene Position nicht im Array ist.
     */
    public Object get(int pos) throws IllegalArgumentException {
        if (pos > curPos || pos < 0) {
            throw new IllegalArgumentException("Das Array ist nicht groß genug, um diese Position auszugeben.");
        } else {
            return array[pos];
        }
    }

    /**
     * Gibt zurück, ob die Liste leer ist. D.h., ob die Anzahl der Elemente null ist.
     *
     * @return true, wenn die Liste leer ist, false wenn nicht.
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Gibt die Anzahl der Elemente zurück.
     *
     * @return Anzahl der Elemente.
     */
    public int size() {
        /*
         * Da curPos immer gleich der aktuellen Größe ist, können wir es
         * einfach als Größe zurückgeben.
         */
        return curPos;
    }

    /**
     * Gibt alle Elemente durch Kommas getrennt auf der Konsole aus.
     */
    private void print() {
        for (int i = 0; i < curPos; i++) {
            if (i == 0) {
                System.out.print("{" + array[i] + "}");
            } else {
                System.out.print(", {" + array[i] + "}");
            }
        }
        System.out.println();
    }
}
