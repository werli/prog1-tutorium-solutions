package de.uni_passau.fim.prog1.tutorium.aufgabe23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import de.uni_passau.fim.prog1.tutorium.aufgabe22.MergeSortedIntegerLists;

/**
 * Erweitere die Methode aus {@link MergeSortedIntegerLists} um Generics. Die Listenelemente sollen das Interface
 * {@link Comparable} implementieren. Schaue auf der
 * <a href="https://docs.oracle.com/javase/10/docs/api/java/lang/Comparable.html">Dokumentationseite</a>, wie dir die
 * Methoden des Interfaces bei der Sortierung helfen können.
 *
 * @author <a href="https://github.com/werli">Phil Werli<a/>
 */
public class MergeSortedGenericLists {

    public static void main(String[] args) {
        final List<Integer> first = Arrays.asList(1, 3, 5, 7);
        final List<Integer> second = Arrays.asList(2, 4, 6, 8, 9, 10);
        System.out.println("first = " + first);
        System.out.println("second = " + second);
        System.out.println("mergeSortedIntegerLists(first, second) = " + mergeSortedGenericLists(first, second));

        final List<String> firstStr = Arrays.asList("b", "c", "d", "f", "j");
        final List<String> secondStr = Arrays.asList("a", "e", "g", "h", "i");
        System.out.println("firstStr = " + firstStr);
        System.out.println("secondStr = " + secondStr);
        System.out.println("mergeSortedGenericLists(firstStr, secondStr) = " + mergeSortedGenericLists(firstStr, secondStr));
    }

    /**
     * Fügt zwei übergebene sortierte Listen zu einer sortierten Liste zusammen und gibt diese zurück.
     *
     * @param first  die erste Liste.
     * @param second die zweite Liste.
     * @param <T>    Der Typ der zu sortierenden Listenelemente. Muss {@link Comparable} implementieren.
     * @return eine sortierte Liste, die aus den Elementen der beiden übergebenen Listen besteht.
     */
    @SuppressWarnings("Duplicates")
    private static <T extends Comparable<T>> List<T> mergeSortedGenericLists(final List<T> first, final List<T> second) {
        if (first.isEmpty()) {
            return second;
        }
        if (second.isEmpty()) {
            return first;
        }

        final List<T> resultingList = new ArrayList<>();

        int firstIndex = 0;
        int secondIndex = 0;

        while (firstIndex < first.size() && secondIndex < second.size()) {
            final T a = first.get(firstIndex);
            final T b = second.get(secondIndex);

            if (a.compareTo(b) < 0) {
                resultingList.add(a);
                firstIndex++;
            } else {
                resultingList.add(b);
                secondIndex++;
            }
        }
        while (firstIndex < first.size()) {
            resultingList.add(first.get(firstIndex));
            firstIndex++;
        }
        while (secondIndex < second.size()) {
            resultingList.add(second.get(secondIndex));
            secondIndex++;
        }

        return resultingList;
    }
}
