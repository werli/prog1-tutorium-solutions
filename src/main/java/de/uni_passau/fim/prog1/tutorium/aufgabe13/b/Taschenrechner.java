package de.uni_passau.fim.prog1.tutorium.aufgabe13.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Schreibe ein Programm, welches zunächst eine Zahl (ganzzahlig), dann eine Rechenoperation (+,−,∗,/)
 * und dann erneut eine Zahl einliest.
 * Dabei soll jede Eingabe in einer eigenen Zeile eingelesen werden.
 * Das Programm soll dann das Ergebnis der Rechenoperation ausgeben.
 * <p>
 * <p>
 * In dieser Lösung ist die Umsetzung mit einen {@link BufferedReader} in der {@link #main(String[])}-Methode
 * und mit einem {@link Scanner} in der {@link #calcWithScanner()}-Methode.
 *
 * @author <a href="http://github.com/werli">Phil Werli</a>
 */
public class Taschenrechner {

    public static void main(String[] args) {
        Taschenrechner calc = new Taschenrechner();
        System.out.println("Calculator using the BufferedReader:");
        calc.calcWithBufferedReader();
    }

    private void calcWithBufferedReader() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /*
         * Lesevorgang und Speichern der Eingaben in drei Strings. Der Lesevorgang könnte eine IOException zur
         * Folge haben, der diesmal in einem try / catch Block behandelt wird.
         */
        try {
            String input1 = reader.readLine();
            String operator = reader.readLine();
            String input2 = reader.readLine();

            /*
             * Der BufferedReader liest einen String ein, den ihr erst in eine Zahl umwandeln ("parsen") müsst, um
             * mit ihr rechnen zu können. Dafür verwendet man beispielsweise Integer.parseInt(String input).
             */
            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);

            /*
             * Wichtig: Strings müssen mit der {@link String#equals(Object)} Methode verglichen werden. Der
             * Operator '==' vergleicht die Objekt-Referenzwerte, nicht den tatsächlichen Inhalt der Objekte.
             */
            String output = "";
            if (operator.equals("+")) {
                output = num1 + " " + operator + " " + num2 + " = " + (num1 + num2);

            } else if (operator.equals("-")) {
                output = num1 + " " + operator + " " + num2 + " = " + (num1 - num2);

            } else if (operator.equals("*")) {
                output = num1 + " " + operator + " " + num2 + " = " + (num1 * num2);
            } else if (operator.equals("/")) {// Sonderfall: Division durch 0.
                if (num2 != 0) {
                    output = num1 + " " + operator + " " + num2 + " = " + (num1 / num2);
                }
            }
            System.out.println(output);

        } catch (IOException e) {
            System.err.println("Error while reading input.");
        } finally {
            /*
             *  Nach dem Lesevorgang solltet ihr den BufferedReader schließen, um unerwünschte Seiteneffekte zu vermeiden.
             *  Um sicherzustellen, dass der BufferedReader auf jeden Fall geschlossen wird, schließen wir den reader in
             *  einem finally-Block. Dieser wird selbst dann ausgeführt, wenn im try-Block eine Exception geworfen wurde.
             */
            try {
                reader.close();
            } catch (IOException ex) {
                System.err.println("Error closing reader.");
            }
        }
    }

    /**
     * Alternative Lösung mit Scanner.
     * Statt eine eingelesene Zahl manuel von String in eine Zahl umzuwandeln, kann man
     * die Methode {@link Scanner#nextInt()} nutzen, die das für einen übernimmt und direkt einen int-Wert zurückgibt.
     * <p>
     * Zusätzlich wird in dieser Lösung ein switch Statement für die Überprüfung des Operators verwendet.
     */
    private void calcWithScanner() {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        int num1 = 0;
        String operator = "";
        int num2 = 0;

        /*
         * Scanner.hasNext() gibt zurück, ob der Scanner überhaupt eine Eingabe erhalten hat.
         * Wenn das nicht der Fall ist, 'wartet' der Scanner auf den nächsten Input.
         */
        if (scanner.hasNext()) {
            num1 = scanner.nextInt();
        }
        if (scanner.hasNext()) {
            operator = scanner.next();
        }
        if (scanner.hasNext()) {
            num2 = scanner.nextInt();
        }

        /*
         * Switch Statement überprüft bei Strings den 'Inhalt' und nicht die Objektreferenz.
         *
         * Aus der Java-Dokumentation (https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html):
         * The String in the switch expression is compared with the expressions associated with each case
         * label as if the String.equals method were being used.
         */
        int result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                // Sonderfall: Division durch 0.
                if (num2 != 0) {
                    result = num1 / num2;
                }
                break;
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

        scanner.close();
    }
}


