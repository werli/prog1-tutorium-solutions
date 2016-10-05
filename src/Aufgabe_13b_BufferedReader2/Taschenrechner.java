package Aufgabe_13b_BufferedReader2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Schreibe ein Programm, welches zunächst eine Zahl (ganzzahlig), dann eine Rechenoperation (+,−,∗,/)
 * und dann erneut eine Zahl einliest.
 * Dabei soll jede Eingabe in einer eigenen Zeile eingelesen werden.
 * Das Programm soll dann das Ergebnis der Rechenoperation ausgeben.
 * <p>
 *
 * @author Phil Werli
 */
public class Taschenrechner {

    public static void main(String[] args) {
        /*
        Initialisierung des "reader", mit dem ihr Konsoleneingaben einlesen könnt.
        Der InputStreamReader dekodiert die Bytes, die ihr in der Konsole eingebt, in Characters.
        Der BufferedReader bietet einen Buffer, der es ermöglicht, den input effizienter einzulesen.
        */
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                System.in));

        /*
        Lesevorgang und Speichern der Eingaben in drei Strings. Der Lesevorgang könnte eine I/O-Exception zur
        Folge haben, weshalb ihr diese in einem try-catch-Block behandeln müsst.
        */
        try {
            String numberOne = reader.readLine();
            String operator = reader.readLine();
            String numberTwo = reader.readLine();

            /*
            Der InputStreamReader liest einen String ein, den ihr erst in int bzw. Integer umwandeln (sog. parsen)
            müsst, um mit ihnen rechnen zu können. Dafür verwendet man die parseInt(String input) der Integer Klasse.
            */
            int firstNumber = Integer.parseInt(numberOne);
            int secondNumber = Integer.parseInt(numberTwo);

            /**
             * Wichtig: Strings müssen mit der {@link Object#equals(Object)} Methode der {@link Object} Klasse
             * verglichen werden. Der Operator '==' vergleich die Referenzen, nicht ob der Inhalt der Objekte gleich ist.
             *
             */
            // WICHTIG: Strings werden mit "equals" verglichen, nicht mit == oder !=. "Equals" vergleicht den tatsächlichen
            // Inhalt der Strings, "==" nur die Objektreferenzen.
            if (operator.equals("+")) {
                System.out.println(firstNumber + " " + operator + " "
                        + secondNumber + " = " + (firstNumber + secondNumber));
            } else if (operator.equals("-")) {
                System.out.println(firstNumber + " " + operator + " "
                        + secondNumber + " = " + (firstNumber - secondNumber));
            } else if (operator.equals("*")) {
                System.out.println(firstNumber + " " + operator + " "
                        + secondNumber + " = " + (firstNumber * secondNumber));
            } else if (operator.equals("/")) {
                // Sonderfall: Division durch 0.
                if (secondNumber != 0) {
                    System.out.println(firstNumber + " " + operator + " "
                            + secondNumber + " = "
                            + (firstNumber / secondNumber));
                }
            }

        } catch (IOException e) {
            System.out.println("Error while reading input.");

        } finally {
            // Nach dem Lesevorgang solltet ihr den BufferedReader schließen, um unerwünschte side effects zu vermeiden.
            // Um sicherzustellen, dass der BufferedReader auf jeden Fall geschlossen wird, schließen wir den reader in
            // einem finally-Block. Dieser wird selbst dann ausgeführt, wenn im try-Block eine Exception geworfen wurde.
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ex) {
                    System.out.println("Error while realising ");
                }
            }
        }
    }
}


