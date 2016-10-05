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
        for (int i = 0; i <= 30; i++) {
            System.out.println(fib(i));
        }

        // (b)
        int i = 0;
        while (fib(i) < 1000) {
            i++;
        }
        System.out.println(fib(i));
    }

    /**
     * Berechnet rekursiv die Fibonacci-Zahl für die gegebene Zahl n.
     *
     * @param n Ganzzahlige Zahl, deren Fibonacci-Zahl zurückgegeben wird.
     * @return Fibonaccizahl der gegebenen Zahl n.
     */
    private static int fib(int n) {
        // if ((n == 0) || (n == 1)) {
        if (n < 2) {
            return 1;
        } else {
            // doppelter rekursiver Aufruf
            return fib(n - 1) + fib(n - 2);
        }
    }
}
