package Aufgabe_13c_Validierung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Erweitere den Taschenrechner, sodass ungültige Eingaben (z.B. ein Buchstabe statt einer Zahl) abgefangen werden.
 * <p>
 *
 * @author Phil Werli
 */
public class Validierung {

    public static void main(String[] args) {

        // Initialisierung des "reader", mit dem ihr Konsoleneingaben einlesen könnt.
        // Der InputStreamReader dekodiert die Bytes, die ihr in der Konsole eingebt, in Characters.
        // Der BufferedReader bietet einen Buffer, der es ermöglicht, den Input effizienter einzulesen.
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                System.in));

        // Um zu ermöglichen, dass der Reader das Programm nach einer fehlerhaften Eingabe nicht beendet, sondern
        // weiteren Input annimmt, müsst ihr die Lesevorgänge in eine while-Schleife packen, die erst verlassen wird,
        // wenn der korrekte Input eingelesen wurde.
        try {
            try {
                int firstNumber = 0;
                String operator = "";
                int secondNumber = 0;

                // kuenstliche Schleifenbedingung
                boolean success = false;

                while (!success) { // gleichbedeutend mit <<code>while(success == false)</code>
                    try {
                        String number1 = reader.readLine();
                        firstNumber = Integer.parseInt(number1);
                        success = true;
                    } catch (NumberFormatException error) {
                        System.out.println("Bitte eine Zahl eingeben!");
                    }
                }

                success = false;
                while (!success) {
                    operator = reader.readLine();

                    if (operator.equals("+") || operator.equals("-")
                            || operator.equals("*") || operator.equals("/")) {
                        success = true;
                    } else {
                        System.out.println("Bitte einen Operator eingeben!");
                    }
                }

                success = false;
                while (!success) {
                    try {
                        String input = reader.readLine();
                        secondNumber = Integer.parseInt(input);
                        success = true;
                    } catch (NumberFormatException error) {
                        System.out.println("Bitte eine Zahl eingeben!");
                    }
                }

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
            }
            // Nach dem Lesevorgang solltet ihr den BufferedReader schließen, um unerwünschte side effects zu vermeiden.
            // Dies erledigt ihr im finally-Block um sicherzugehen, dass er in jedem Fall geschlossen wird.
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }

    }
}


