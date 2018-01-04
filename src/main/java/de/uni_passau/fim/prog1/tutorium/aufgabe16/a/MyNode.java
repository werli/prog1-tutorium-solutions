package de.uni_passau.fim.prog1.tutorium.aufgabe16.a;

/**
 * Erstelle die Klassen MyList und MyNode. MyList repräsentiert eine einfach verket-
 * tete Liste, welche Knoten vom Typ MyNode beinhaltet. MyNode speichert Daten vom
 * Typ String.
 * <p>
 * Folgende Methoden soll MyNode besitzen:
 * • String getData(): Gibt den Wert des Knotens zurück.
 * • void setData(String data): Setzt den Wert des Knotens auf den übergebenen Wert,
 * solange dieser nicht {@code null} ist.
 *
 * @author <a href=https://github.com/werli>Phil Werli<a/>
 */
class MyNode {
    private MyNode next;
    private String data;

    MyNode(String data) {
        next = null;
        this.data = data;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
