package de.uni_passau.fim.prog1.tutorium.aufgabe16.c;

/**
 * Modifiziere MyList und MyNode, sodass statt Strings der Typ
 * generisch festgelegt werden kann.
 *
 * @author <a href=https://github.com/werli>Phil Werli<a/>
 */
@SuppressWarnings("Duplicates")
public class MyList<E> {
    private MyNode<E> front;
    private int size;

    /**
     * Fügt einen übergebenen Wert hinten an die Liste an.
     *
     * @param value Wert, welcher hinten an die Liste hinzugefügt wird.
     */
    public void add(E value) {
        if (value == null) {
            return;
        }

        final MyNode<E> newNode = new MyNode<>(value);
        if (front == null) {
            front = newNode;
        } else {
            MyNode<E> node = front;

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
    public void add(E value, int pos) throws IndexOutOfBoundsException {
        if (pos < 0 || pos > size) {
            throw new IndexOutOfBoundsException("Übergebene Position außerhalb des erwarteten Raumes.");
        } else if (pos == 0) {
            final MyNode<E> newFront = new MyNode<>(value);
            newFront.setNext(front);
            front = newFront;
        } else {
            MyNode<E> node = front;
            for (int i = 0; i < pos - 1; i++) {
                node = node.getNext();
            }

            final MyNode<E> nextNode = node.getNext();
            final MyNode<E> newNode = new MyNode<>(value);
            node.setNext(newNode);
            newNode.setNext(nextNode);
        }
        size++;
    }

    /**
     * Gibt den Wert an der übergebenen Position zurück.
     *
     * @param pos Position, deren Wert zurückgegeben wird.
     * @return Wert an der übergebenen Position
     */
    public E get(int pos) {
        if (pos >= size) {
            return null;
        }

        MyNode<E> node = front;
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
            builder.append(", ");
            node = node.getNext();
        }
        builder.append(node.getData());

        builder.append(']');

        String output = builder.toString();
        System.out.println(output);
    }

    /**
     * Entfernt den Knoten an der übergebenen Position.
     *
     * @param pos Position des zu löschenden Knotens.
     * @return {@code true} bei erfolgreichem Löschen,
     * {@code false} bei erfolglosem Löschen.
     */
    public boolean remove(int pos) {
        if (pos < 0 || pos >= size) {
            return false;
        }
        if (pos == 0) {
            front = front.getNext();
        } else {
            MyNode<E> node = front;
            for (int i = 0; i < (pos - 1); i++) {
                node = node.getNext();
            }

            MyNode<E> removeNode = node.getNext();
            MyNode<E> next = removeNode.getNext();

            node.setNext(next);
        }

        size--;
        return true;
    }

    /**
     * Entfernt alle Elemente aus der Liste.
     */
    public void clear() {
        /*
        * Abkoppeln des ersten Listenknotens ist genug, da die restlichen Listenelemente
        * ohne den ersten Knoten nicht mehr "gefunden" werden können. Sie werden vom
        * Garbage Collector zur Laufzeit entfernt.
        */
        front = null;
        size = 0;
    }
}
