package de.uni_passau.fim.prog1.tutorium.aufgabe16.c;

/**
 * Erstelle zum Testen eine MyList vom Typ String sowie eine MyList vom Typ
 * Integer und fülle beide mit beliebigen Werten.
 *
 * @author <a href=https://github.com/werli>Phil Werli<a/>
 */
public class ListTest {
    public static void main(String[] args) {

        // Erstellung von MyList mit Typ String
        testStringList();

        System.out.println("\n");

        // Erstellung von MyList mit Typ Integer
        testIntegerList();
    }

    private static void testStringList() {
        MyList<String> strings = new MyList<>();
        strings.add("hello");
        strings.add("welt");

        // erstetzt 'welt'
        strings.add("world", 1);
        System.out.println("strings isEmpty? " + strings.isEmpty());
        System.out.println("strings size? " + strings.size());

        System.out.println(strings.get(0));
        System.out.println(strings.get(1));

        strings.print();

        strings.clear();
        System.out.println("strings cleared");
        System.out.println("strings isEmpty? " + strings.isEmpty());
        System.out.println("strings size? " + strings.size());
    }

    private static void testIntegerList() {
        MyList<Integer> ints = new MyList<>();
        ints.add(123456789);
        ints.add(23456789);

        // ersetzt '23456789'
        ints.add(987654321, 1);

        System.out.println("ints isEmpty? " + ints.isEmpty());
        System.out.println("ints size? " + ints.size());

        System.out.println(ints.get(0));
        System.out.println(ints.get(1));

        ints.print();

        System.out.println("ints remove at pos 1? " + ints.remove(1));
        System.out.println("ints size? " + ints.size());
        ints.print();
    }
}
