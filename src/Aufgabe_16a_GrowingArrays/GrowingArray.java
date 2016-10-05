package Aufgabe_16a_GrowingArrays;

/**
 * * Erstelle eine Klasse GrowingArray, in welcher eine Reihe von int-Werten gespeichert werden kann.
 * Verwende ein Array mit 10 Elementen, um die Werte abzulegen.
 * Sobald das Array zu klein wird, um weitere Werte aufzunehmen, sollen alle Werte in ein neues Array doppelter Größe
 * kopiert werden. Folgende Methoden soll GrowingArray besitzen:
 * • public void add(int value): Fügt einen neuen Wert “hinten” an.
 * Wenn das darunterliegende Array zu klein ist, um einen neuen Wert aufzunehmen,
 * dann sollen alle Werte in ein neues Array, welches doppelt so groß ist, kopiert werden.
 * <p>
 * <p>
 * <blockquote><pre>
 * • public int get(int pos): Gibt den Wert an der Position pos zurück, be-ginnend bei 0.
 * • public boolean isEmpty(): Gibt zurück, ob die Liste leer ist. D.h., ob die Anzahl der Elemente null ist.
 * • public int size(): Gibt die Anzahl der Elemente zurück.
 * • public void print(): Gibt alle Elemente durch Kommas getrennt auf der Konsole aus.
 * </pre></blockquote>
 * <p>
 * Hinweis: Verwende eine Variable private int curPos, die die aktuelle Position in der Liste speichert.
 * Beim Hinzufügen eines neuen Wertes wird dieser an der Stelle curPos im Array gespeichert, anschließend wird curPos um 1 hochgezählt.
 *
 * @author Phil Werli
 */
public class GrowingArray {

    private int[] array;
    // Wir speichern das aktuelle Listenende, um die Listenfunktionen simpler implementieren zu können.
    private int curPos;

    /**
     * Konstruktor für Growing-Array-Objekt.
     */
    public GrowingArray() {
        array = new int[10];
        curPos = 0;
    }

    /**
     * Konstruktor, der schon eine initiale Größe des Arrays festlegt.
     *
     * @param n Größe des Arrays.
     */
    public GrowingArray(int n) {
        array = new int[n];
        curPos = 0;
    }

    public static void main(String[] args) {
        // Test
        GrowingArray growingArray = new GrowingArray();
        System.out.println("Ist das Array leer? " + growingArray.isEmpty());
        growingArray.add(1);
        growingArray.add(2);
        growingArray.add(3);
        growingArray.add(4);
        growingArray.add(5);
        growingArray.add(100);
        growingArray.add(1000);
        System.out.println("Die Größe des Arrays ist " + growingArray.size());
        System.out.println("Ist das Array leer? " + growingArray.isEmpty());
        System.out.println("Wert an der Stelle 5: " + growingArray.get(5));
        System.out.println("Komplettes Array:");
        growingArray.print();
    }

    /**
     * Fügt einen neuen Wert “hinten” an. Wenn das darunterliegende Array zu klein ist, um einen neuen Wert aufzunehmen,
     * dann sollen alle Werte in ein neues, doppelt so großes Array kopiert werden.
     *
     * @param value Der neue Wert, der hinzugefügt werden soll.
     */
    public void add(int value) {
        // Überprüfe, ob im Array noch Platz ist.
        if (curPos > array.length - 1) {
            // Falls nicht, erstelle ein neues, doppelt so großes Array.
            int[] newArray = new int[array.length * 2];
            // Kopiere alle Werte aus dem alten in das neue Array
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            // Damit unser GrowingArray-Objekt in Zukunft das neue Array übernimmt, setzen wir array = newArray.
            array = newArray;
        }
        // Schließlich muss nur noch die cursor position geupdated und hochgezählt werden.
        array[curPos] = value;
        curPos++;
    }

    /**
     * Gibt den Wert an der Position pos zurück, beginnend bei 0.
     *
     * @param pos Die Position deren Wert gefunden werden soll.
     * @return Der Wert an der gegebenen Position.
     */
    public int get(int pos) {
        if (pos > curPos) {
            // Falls es an der spezifizierten Stelle keinen Wert gibt, wird der
            // kleinstmögliche Wert zurückgegeben.
            System.out.println("Das Array ist nicht groß genug, um diese Position auszugeben.");
            return Integer.MIN_VALUE;
        } else {
            return array[pos];
        }
    }

    /**
     * Gibt zurück, ob die Liste leer ist. D.h., ob die Anzahl der Elemente null ist.
     *
     * @return true, wenn die Liste leer ist, false wenn nicht.
     */
    private boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Gibt die Anzahl der Elemente zurück.
     *
     * @return Anzahl der Elemente.
     */
    public int size() {
        // Da curPos immer gleich der aktuellen Größe ist, können wir es
        // einfach als Größe zurückgeben.
        return curPos;
    }

    /**
     * Gibt alle Elemente durch Kommas getrennt auf der Konsole aus.
     */
    private void print() {
        for (int i = 0; i < curPos; i++) {
            // Um der Schleife die Anweisung zu geben, nach der letzten Stelle im Array kein "," mehr auzugeben
            // benutzen wir diesen Trick.
            if (i == 0) {
                System.out.print("{" + array[i] + "}");
            } else {
                System.out.print(", {" + array[i] + "}");
            }
        }
        System.out.println();
    }
}
