package Aufgabe_15c_CMS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Aufgabe_15a_CMS.Student;

/**
 * Erweitere das Programm, sodass im Konstruktor der Klasse University die Daten von (beliebig vielen) Studierenden
 * von der Konsole eingelesen werden. Verwende die Eingabe fertig bzw. weiter um nach einer vollständigen Eingabe das
 * Einlesen zu beenden bzw. weitere Studierende hinzuzufügen.
 * Nach dem Einlesen sollen alle Studierende auf der Konsole ausgegeben werden.
 * <p>
 * Hier benutzen wir der Einfachheit halber die {@link Student}-Klasse von auf Aufgabe 15a.
 *
 * @author Phil Werli
 */
public class University {

    // Attribute der University
    private int numberOfStudents;
    private Student[] arrayOfStudents;

    /**
     * Konstruktor zum erstellen eines neuen University-Objects. Hier ist es sinnvoll, eine neue Universität direkt
     * mit der Gesamtzahl der Studierenden anzulegen, da diese für die Größe des Arrays verwendet werden kann.
     * Die Studierenden selbst werden erst später "immatrikuliert"
     *
     * @param numberOfStudents Anzahl der Studierenden.
     */
    public University(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
        this.arrayOfStudents = new Student[numberOfStudents];

        //Aufruf der addStudents-Methode im University-Konstruktor
        addStudents();
    }

    public static void main(String[] args) {
        University uniPassau = new University(5);
        uniPassau.printStudents();
    }

    /**
     * Methode zum Hinzufügen neuer Studierenden über die Konsole.
     */
    private void addStudents() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean quit = false;
        int counter = 0;

        // Schleifenbedingung: So lange User Input eingeben möchte und solange die Uni Plätze (array.size) hat, läuft
        // die Schleife weiter.
        while (!quit && counter < arrayOfStudents.length) {
            try {
                System.out.println("Vorname:");
                String firstName = reader.readLine();

                System.out.println("Nachname:");
                String name = reader.readLine();

                System.out.println("Matrikelnummer:");
                int matrNr = readInteger(reader);

                System.out.println("Studiengang:");
                String studyCourse = reader.readLine();

                System.out.println("Fachsemester:");
                int semester = readInteger(reader);

                arrayOfStudents[counter] = new Student(name, firstName, matrNr,
                        studyCourse, semester);

                quit = validateContinue(reader, counter);

                counter++;
            } catch (IOException error) {
                System.out.println("Error while reading input.");
            }
        }

    }

    /**
     * Liest einen String ein und wandelt ihn in einen Integer um ("parsen").
     *
     * @return Eine Zahl, die eingelesen wurde.
     * @throws IOException Wirft eine IOException, wenn der Input fehlschlägt.
     */
    private int readInteger(BufferedReader reader) throws IOException {
        int number = 0;
        boolean success = false;
        while (!success) {
            try {
                String input = reader.readLine();
                number = Integer.parseInt(input);
                success = true;
            } catch (NumberFormatException error) {
                System.out.println("Bitte eine Zahl eingeben!");
            }
        }
        return number;
    }

    /**
     * Validiert, ob das Programm weiter laufen soll.
     * Wenn 'weiter' als Input kommt, ist das Ergebnis true.
     * Ansonsten ist das Ergebnis false.
     *
     * @return Ob das Programm weiter läuft.
     * @throws IOException Wirft eine IOException, wenn der Input fehlschlägt.
     */
    private boolean validateContinue(BufferedReader reader, int counter) throws IOException {
        boolean quit = false;
        if (counter < arrayOfStudents.length - 1) {
                    /* Do not display this line the very last time. */
            System.out.println("Weiter? weiter/fertig");

            String input = reader.readLine();
            quit = !(input.equals("weiter"));
        }
        return quit;
    }

    /**
     * Methode zum Ausgeben der Studierenden auf der Konsole.
     */
    private void printStudents() {
        System.out.println("List of students:");

        // Um die Studierenden auszugeben, wird für alle Studierenden, also für jedes Array-Element,
        // die toString-Methode der Student-Klasse genutzt.
        // Da wir nicht wissen, wie viele Studierende eingegeben wurden, müssen wir unsere Schleifenabbruchbedingung
        // entsprechend erweitern.
        for (int i = 0; i < arrayOfStudents.length && arrayOfStudents[i] != null; i++) {
            System.out.println(arrayOfStudents[i]);
        }
    }
}
