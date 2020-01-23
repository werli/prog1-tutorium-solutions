package de.uni_passau.fim.prog1.tutorium.aufgabe13.c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Erweitere den Taschenrechner, sodass ungültige Eingaben (z.B. ein Buchstabe
 * statt einer Zahl oder Division durch 0) abgefangen werden.
 * <p>
 *
 * @author <a href="http://github.com/werli">Phil Werli</a>
 */
public class Validierung {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /* Um zu ermöglichen, dass der Reader das Programm nach einer fehlerhaten Eingabe nicht beendet, sondern
         * weiteren Input annimmt, müssen die Lesevorgänge in einer while-Schleife untergebracht werden, die erst
         * verlassen wird, sobald korrekter Input eingelesen wurde.
         */
        try {
            int num1 = 0;
            String operator = "";
            int num2 = 0;

            // künstliche Schleifenbedingung
            boolean success = false;

            while (!success) { // gleichbedeutend mit while(success == false)
                try {
                    String input = reader.readLine();
                    num1 = Integer.parseInt(input);
                    success = true;
                } catch (NumberFormatException error) {
                    System.out.println("Bitte eine Zahl eingeben!");
                }
            }

            success = false;
            while (!success) {
                operator = reader.readLine();

                /*
                 * Alternative mit Regular Expressions.
                 * if (operator.matches("\\+|-|\\*|/")) {...}
                 */
                if (operator.equals("+")
                        || operator.equals("-")
                        || operator.equals("*")
                        || operator.equals("/")) {
                    success = true;
                } else {
                    System.out.println("Bitte einen validen Operator eingeben!");
                }
            }

            success = false;
            while (!success) {
                try {
                    String input = reader.readLine();
                    num2 = Integer.parseInt(input);
                    if (operator.equals("/") && num2 == 0) {
                        System.out.println("Division durch 0 ist nicht zulässig. Bitte eine andere Zahl eingeben.");
                        continue;
                    }
                    success = true;
                } catch (NumberFormatException error) {
                    System.out.println("Bitte eine Zahl eingeben!");
                }
            }

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
                    // Division durch 0 wurde schon behandelt.
                    result = num1 / num2;
                    break;
            }
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        } catch (IOException e) {
            System.out.println("Error while reading input.");
        }
    }
}
