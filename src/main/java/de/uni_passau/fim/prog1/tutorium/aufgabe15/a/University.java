package de.uni_passau.fim.prog1.tutorium.aufgabe15.a;

/**
 * Erstelle eine Klasse University und eine Klasse Student (äquivalent Aufgabe 14(b)).
 * Die Klasse University soll eine Variable numberOfStudents und ein Array von Student Objekten haben.
 * Füge mindestens 3 Student-Objekte zum Array hinzu und schreibe eine Methode printStudents,
 * die alle Studierenden auf der Konsole ausgibt.
 * <p>
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
     * @param maxNumberOfStudents Anzahl der Studierenden.
     */
    public University(int maxNumberOfStudents) {
        this.numberOfStudents = 0;
        this.arrayOfStudents = new Student[maxNumberOfStudents];
    }

    public static void main(String[] args) {
        University uniPassau = new University(3);
        uniPassau.arrayOfStudents[0] = new Student("Hans", "Peter", 54321, "Internet Computing BA", 6);
        uniPassau.arrayOfStudents[1] = new Student("Bieber", "Justin", 12345, "Musicology", 3);
        uniPassau.arrayOfStudents[2] = new Student("Manuel", "Neuer", 11111, "Goalkeeping Master", 10);

        uniPassau.setNumberOfStudents(3);

        uniPassau.printStudents();
    }

    /**
     * Methode zum Ausgeben der Studierenden auf der Konsole.
     */
    private void printStudents() {
        System.out.println("List of students:");
        for (int i = 0; i < numberOfStudents; i++) {
            // Ausgabe des Ergebnisses der toString() Methode von Studierenden
            System.out.println(arrayOfStudents[i]);
        }

    }

    // Getter und Setter-Methoden, da die Variablen private sind.
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Student[] getArrayOfStudents() {
        return arrayOfStudents;
    }

    public void setArrayOfStudents(Student[] arrayOfStudents) {
        this.arrayOfStudents = arrayOfStudents;
    }
}
