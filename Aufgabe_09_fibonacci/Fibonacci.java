package Aufgabe_09_fibonacci;

/**
 * Leonardo Fibonacci hat im Jahr 1202 die Fibonacci-Folge entwickelt, um das Wachstum
 * einer Kaninchenpopulation zu beschreiben. Die Folge sieht wie folgt aus:
 * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, . . .
 * Dabei ist jede Zahl die Summe der beiden vorangehenden Zahlen. Die formale Definition
 * lautet:
 * <code>
 * fib(0) = 1
 * fib(1) = 1
 * fib(n) = fib(n−1) + fib(n−2)
 * </code>
 * <p>
 * (a) Schreibe ein Programm, welches die Fibonacci-Folge bis zu fib(30) rekursiv berechnet und
 * dabei jede Fibonacci-Zahl in einer Zeile ausgibt.
 * (b) Schreibe eine weitere Methode, welche die erste Fibonacci-Zahl ≥ 1000 findet und ausgibt.
 *
 * @author Phil Werli
 */
public class Fibonacci {
    public static void main(String[] args) {
        // (a)
        System.out.println("Teilaufgabe (a):");
        for (int i = 0; i <= 30; i++) {
            System.out.println("Die Fibonacci-Zahl von " + i + " lautet " + fib(i) + ".");
        }

        // (b)
        System.out.println("Teilaufgabe (b):");
        int i = 0;
        int maximum = 1000;
        while (fib(i) < maximum) {
            i++;
        }
        System.out.println("Die erste Fibonacci-Zahl über " + maximum +
                " ist die Fibonacci-Zahl von " + i + " und lautet " + fib(i) + ".");
    }

    /**
     * Berechnet rekursiv die Fibonacci-Zahl für die gegebene Zahl n.
     *
     * @param n Ganzzahlige Zahl, deren Fibonacci-Zahl zurückgegeben wird.
     * @return Fibonaccizahl der gegebenen Zahl n.
     */
    private static int fib(int n) {

        // Deckt fib(0) = 1 und fib(1) = 1 ab.
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // doppelter rekursiver Aufruf deckt fib(n) = fib(n-1) + fib(n-2) ab.
            return fib(n - 1) + fib(n - 2);
        }
    }
}
