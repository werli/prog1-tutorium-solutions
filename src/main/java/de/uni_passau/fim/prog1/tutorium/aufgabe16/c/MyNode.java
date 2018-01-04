package de.uni_passau.fim.prog1.tutorium.aufgabe16.c;

/**
 * Modifiziere MyList und MyNode, sodass statt Strings der Typ
 * generisch festgelegt werden kann.
 *
 * @author <a href=https://github.com/werli>Phil Werli<a/>
 */
class MyNode<E> {
    private MyNode<E> next;
    private E data;

    MyNode(E data) {
        next = null;
        this.data = data;
    }

    public MyNode<E> getNext() {
        return next;
    }

    public void setNext(MyNode<E> next) {
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
