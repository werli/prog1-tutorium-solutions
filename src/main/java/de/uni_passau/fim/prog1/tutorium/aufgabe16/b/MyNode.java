package de.uni_passau.fim.prog1.tutorium.aufgabe16.b;

/**
 * Diese Klasse repräsentiert Knoten, welche Daten von Typ
 * {@link String} speichern können.
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
