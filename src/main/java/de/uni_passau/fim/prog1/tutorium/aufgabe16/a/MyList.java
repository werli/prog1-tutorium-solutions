package de.uni_passau.fim.prog1.tutorium.aufgabe16.a;

/**
 * Erstelle die Klassen MyList und MyNode. MyList repräsentiert eine einfach verket-
 * tete Liste, welche Knoten vom Typ MyNode beinhaltet. MyNode speichert Daten vom
 * Typ String.
 * <p>
 * Folgende Methoden soll MyList besitzen:
 * • public void add(String value): Fügt einen neuen Wert hinten an die Lis-
 * te an. Ist der Wert jedoch {@code null}, soll dieser nicht hinzugefügt werden.
 * • public void add(String value, int pos): Überschreibt den Wert an der
 * Position pos, solange der übergebene Wert nicht {@code null} ist. Gibt es noch kein
 * Element an der Position pos, soll der übergebene Wert hinten an die Liste
 * angefügt werden.
 * • public String get(int pos): Gibt den Wert an der Position pos zurück.
 * • public boolean isEmpty(): Gibt zurück, ob die Liste leer ist.
 * • public int size(): Gibt die Anzahl der Elemente zurück.
 * • public void print(): Gibt alle Elemente durch Kommas getrennt auf der
 * Konsole aus.
 *
 * @author <a href=https://github.com/werli>Phil Werli<a/>
 */
@SuppressWarnings("Duplicates")
public class MyList {
    private MyNode front;
    private int size;

    /**
     * Fügt einen übergebenen Wert hinten an die Liste an.
     *
     * @param value Wert, welcher hinten an die Liste hinzugefügt wird.
     */
    public void add(String value) {
        if (value == null) {
            return;
        }

        final MyNode newNode = new MyNode(value);
        if (this.front == null) {
            this.front = newNode;
        } else {
            MyNode node = this.front;

            // Knoten durchgehen bis zum Ende
            while (node.getNext() != null) {
                node = node.getNext();
            }
            node.setNext(newNode);
        }
        size++;
    }

    /**
     * Fügt einen neuen Wert an der übergebenen Position hinzu. Verschiebt das
     * Element an der Position und alle nachfolgenden Elemente nach rechts. Ist
     * die Position größer als die momentane Anzahl an Listenelementen, soll
     * eine {@link IndexOutOfBoundsException} geworfen werden.
     *
     * @param value Wert, welcher hinzugefügt wird.
     * @param pos   Position, an welche der Wert hinzugefügt wird.
     * @throws IndexOutOfBoundsException Wenn die übergebene Position {@code < 0} oder {@code > size()} ist.
     */
    public void add(String value, int pos) throws IndexOutOfBoundsException {
        if (pos < 0 || pos > size) {
            throw new IndexOutOfBoundsException("Übergebene Position außerhalb des erwarteten Raumes.");
        }

        MyNode node = front;
        for (int i = 0; i < pos - 1; i++) {
            node = node.getNext();
        }

        final MyNode nextNode = node.getNext();
        final MyNode newNode = new MyNode(value);
        node.setNext(newNode);
        newNode.setNext(nextNode);
    }

    /**
     * Gibt den Wert an der übergebenen Position zurück.
     *
     * @param pos Position, deren Wert zurückgegeben wird.
     * @return Wert an der übergebenen Position
     */
    public String get(int pos) {
        if (pos >= size) {
            return null;
        }

        MyNode node = front;
        for (int i = 0; i < pos; i++) {
            node = node.getNext();
        }
        return node.getData();
    }

    /**
     * Gibt die Anzahl der Listenelemente zurück.
     *
     * @return Anzal der Listenelemente.
     */
    public int size() {
        return size;
    }

    /**
     * Gibt zurück, ob die Liste leer oder nicht leer ist.
     *
     * @return {@code true} bei leerer Liste, {@code false}
     * bei nicht-leerer Liste.
     */
    public boolean isEmpty() {
        // erste Knoten == null? -> Liste leer
        return front == null;
    }

    /**
     * Gibt die Listenelemente mit folgender Syntax
     * auf der Konsole aus:
     * <p>
     * {@code [element_0>,<element_1>,...,<element_n-1>,<element_n>]}
     */
    public void print() {
        if (isEmpty()) {
            System.out.println("[]");
        }

        final StringBuilder builder = new StringBuilder();
        builder.append('[');

        MyNode node = front;
        while (node.getNext() != null) {
            builder.append(node.getData());
            builder.append(",");
            node = node.getNext();
        }
        builder.append(node.getData());

        builder.append(']');

        String output = builder.toString();
        System.out.println(output);
    }
}
