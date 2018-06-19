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
        MyList<String> stringList = new MyList<>();
        stringList.add("hello1");
        stringList.add("everyone");

        // fügt "world" an Index 1 ein, zwischen "hello1" und "everyone"
        stringList.add("world", 1);
        // fügt "hello" vorne an die Liste an
        stringList.add("hello0", 0);

        System.out.println("strings isEmpty? " + stringList.isEmpty());
        System.out.println("strings size? " + stringList.size());

        stringList.print();

        stringList.clear();
        System.out.println("strings cleared");
        System.out.println("strings isEmpty? " + stringList.isEmpty());
        System.out.println("strings size? " + stringList.size());
    }

    private static void testIntegerList() {
        MyList<Integer> integerList = new MyList<>();
        integerList.add(12);
        integerList.add(34);
        integerList.add(56);
        integerList.add(90);

        // fügt "78" an Index 3 ein, zwischen "56" und "90"
        integerList.add(78, 3);
        // fügt "8" vorne an die Liste an
        integerList.add(8, 0);

        System.out.println("ints isEmpty? " + integerList.isEmpty());
        System.out.println("ints size? " + integerList.size());

        integerList.print();

        System.out.println("ints remove at pos 1? " + integerList.remove(1));
        System.out.println("ints size? " + integerList.size());

        integerList.print();

        System.out.println("ints remove at pos 0? " + integerList.remove(0));
        System.out.println("ints size? " + integerList.size());

        integerList.print();
    }
}
