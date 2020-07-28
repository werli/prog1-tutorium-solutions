package de.uni_passau.fim.prog1.tutorium.aufgabe23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Erstelle eine Methode {@link #mergeSortedIntegerLists(List, List) mergeSortedIntegerLists(List<Integer>, List<Integer>)}
 * welche zwei sortierte Listen als Parameter nimmt und eine
 * zusammengefügte sortierte Liste zurückgibt. Ist eine der beiden übergebenen Listen leer,
 * wird die andere ausgegeben. Bedenke, dass die Listen unterschiedliche Länge haben kön-
 * nen. Beispiel: ([1,3,5,7,8],[2,4,6,9,10]) => [1,2,3,4,5,6,7,8,9,10]
 *
 * @author <a href="https://github.com/werli">Phil Werli<a/>
 */
public class MergeSortedIntegerLists {
    public static void main(String[] args) {
        final List<Integer> first = Arrays.asList(1, 3, 5, 7, 8);
        final List<Integer> second = Arrays.asList(2, 4, 6, 9, 10);
        System.out.println("first = " + first);
        System.out.println("second = " + second);
        System.out.println("mergeSortedIntegerLists(first, second) = " + mergeSortedIntegerLists(first, second));
    }

    /**
     * Fügt zwei übergebene sortierte Listen zu einer sortierten Liste zusammen und gibt diese zurück.
     *
     * @param first die erste Liste.
     * @param second die zweite Liste.
     * @return eine sortierte Liste, die aus den Elementen der beiden übergebenen Listen besteht.
     */
    @SuppressWarnings("Duplicates")
    private static List<Integer> mergeSortedIntegerLists(final List<Integer> first, final List<Integer> second) {
        if (first.isEmpty()) {
            return second;
        }
        if (second.isEmpty()) {
            return first;
        }

        final List<Integer> resultingList = new ArrayList<>();

        int firstIndex = 0;
        int secondIndex = 0;

        while (firstIndex < first.size() && secondIndex < second.size()) {
            final Integer a = first.get(firstIndex);
            final Integer b = second.get(secondIndex);

            if (a < b) {
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
