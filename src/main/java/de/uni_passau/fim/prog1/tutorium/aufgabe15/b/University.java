package de.uni_passau.fim.prog1.tutorium.aufgabe15.b;

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
     * Konstruktor zum Erstellen eines neuen University-Objects. Hier ist es sinnvoll, eine neue Universität direkt
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
        /*
         * Schleifenbedingung: Solange der Benutzer Input eingeben möchte
         * und gleichzeitig die Uni noch Platz hat, läuft die Schleife weiter.
         */
        while (!quit && counter < arrayOfStudents.length) {
            try {
                System.out.println("Vorname:");
                String firstName = reader.readLine();
                System.out.println("Nachname:");
                String name = reader.readLine();
                System.out.println("Matrikelnummer:");
                int matrNr = Integer.parseInt(reader.readLine());
                System.out.println("Studiengang:");
                String studyCourse = reader.readLine();
                System.out.println("Fachsemester:");
                int semester = Integer.parseInt(reader.readLine());

                arrayOfStudents[counter] = new Student(name, firstName, matrNr,
                        studyCourse, semester);

                if (counter < arrayOfStudents.length - 1) {
                    /* Do not display this line the very last time. */
                    System.out.println("Weiter? weiter/fertig");

                    if (!(reader.readLine().equals("weiter"))) {
                        quit = true;
                    }
                }
                counter++;
            } catch (IOException error) {
                System.out.println("Fehler beim Einlesen.");
            }
        }
    }

    /**
     * Diese Methode gibt alle Studierende auf der Konsole aus.
     */
    private void printStudents() {
        System.out.println("Liste an Studierenden:");
        // Durchgehen und Ausgeben aller Studierenden
        for (int i = 0; i < arrayOfStudents.length && arrayOfStudents[i] != null; i++) {
            System.out.println(arrayOfStudents[i].toString());
        }
    }
}
