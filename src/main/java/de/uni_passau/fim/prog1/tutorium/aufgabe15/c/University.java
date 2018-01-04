package de.uni_passau.fim.prog1.tutorium.aufgabe15.c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import de.uni_passau.fim.prog1.tutorium.aufgabe15.a.Student;

/**
 * Erweitere das Programm, sodass im Konstruktor der Klasse University die Daten von (beliebig vielen) Studierenden
 * von der Konsole eingelesen werden. Verwende die Eingabe fertig bzw. weiter um nach einer vollständigen Eingabe das
 * Einlesen zu beenden bzw. weitere Studierende hinzuzufügen.
 * Nach dem Einlesen sollen alle Studierende auf der Konsole ausgegeben werden.
 * <p>
 * Hier benutzen wir der Einfachheit halber die {@link Student}-Klasse von auf Aufgabe 15a.
 *
 * @author <a href="http://github.com/werli">Phil Werli</a>
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
     * @param maxNumberOfStudents Anzahl der Studierenden.
     */
    public University(int maxNumberOfStudents) {
        this.numberOfStudents = 0;
        this.arrayOfStudents = new Student[maxNumberOfStudents];
    }

    public static void main(String[] args) {
        University uniPassau = new University(5);
        uniPassau.addStudents();
        uniPassau.printStudents();
    }

    /**
     * Methode zum Hinzufügen neuer Studierenden über die Konsole.
     */
    private void addStudents() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean quit = false;

        /*
         * Schleifenbedingung: Solange der Benutzer Input eingeben möchte
         * und gleichzeitig die Uni noch Platz hat, läuft die Schleife weiter.
         */
        while (!quit && numberOfStudents < arrayOfStudents.length) {
            try {
                System.out.print("Vorname: ");
                String firstName = reader.readLine();

                System.out.print("Nachname: ");
                String name = reader.readLine();

                System.out.print("Matrikelnummer: ");
                int matrNr = readInteger(reader);

                System.out.print("Studiengang: ");
                String studyCourse = reader.readLine();

                System.out.print("Fachsemester: ");
                int semester = readInteger(reader);

                arrayOfStudents[numberOfStudents] = new Student(name, firstName, matrNr,
                        studyCourse, semester);
                numberOfStudents++;

                quit = validateContinue(reader, numberOfStudents);
            } catch (IOException error) {
                System.out.println("Fehler beim Einlesen.");
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
                number = Integer.parseInt(reader.readLine());
                if (0 >= number) {
                    throw new IllegalArgumentException();
                }
                success = true;
            } catch (NumberFormatException error) {
                System.out.println("Bitte eine Zahl eingeben!");
            } catch (IllegalArgumentException error) {
                System.out.println("Es muss eine positive Zahl eingegeben werden!");
            }
        }
        return number;
    }

    /**
     * Validiert, ob das Programm weiter laufen soll.
     * Wenn 'weiter' als Input kommt, ist das Ergebnis true.
     * Ansonsten ist das Ergebnis false.
     *
     * @return ob das Programm weiter läuft.
     * @throws IOException Wirft eine IOException, wenn der Input fehlschlägt.
     */
    private boolean validateContinue(BufferedReader reader, int counter) throws IOException {
        boolean quit = false;
        boolean success = false;
        if (counter < arrayOfStudents.length) {
            // Do not display this line the very last time.
            System.out.print("Weiter? (weiter/fertig): ");
            while (!success) {
                String input = reader.readLine();
                if (input.equals("weiter")) {
                    success = true;
                } else if (input.equals("fertig")) {
                    success = true;
                    quit = true;
                } else {
                    System.out.println("Bitte entweder 'weiter' oder 'fertig' eingeben.");
                }
            }
        }
        return quit;
    }

    /**
     * Methode zum Ausgeben der Studierenden auf der Konsole.
     */
    private void printStudents() {
        System.out.println("Liste an Studierenden:");
        // Durchgehen und Ausgeben aller Studierenden
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(arrayOfStudents[i]);
        }
    }
}
