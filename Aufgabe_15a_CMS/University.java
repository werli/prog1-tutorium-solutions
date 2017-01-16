package Aufgabe_15a_CMS;

/**
 * Erstelle eine Klasse University und eine Klasse Student (äquivalent Aufgabe 14(b)).
 * Die Klasse University soll eine Variable numberOfStudents und ein Array von Student Objekten haben.
 * Füge mindestens 3 Student-Objekte zum Array hinzu und schreibe eine Methode printStudents,
 * die alle Studierenden auf der Konsole ausgibt.
 * <p>
 *
 * @author Phil Werli
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
    }

    public static void main(String[] args) {
        University uniPassau = new University(3);
        uniPassau.arrayOfStudents[0] = new Student("Werli", "Phil", 54321, "Internet Computing BA", 6);
        uniPassau.arrayOfStudents[1] = new Student("Bieber", "Justin", 12345, "Musicology", 3);
        uniPassau.arrayOfStudents[2] = new Student("Manuel", "Neuer", 11111, "Goalkeeping Master", 10);
        uniPassau.printStudents();
    }

    /**
     * Methode zum Ausgeben der Studierenden auf der Konsole.
     */
    private void printStudents() {
        System.out.println("List of students:");
        for (int i = 0; i < arrayOfStudents.length; i++) {
            // Um die Studierenden auszugeben, wird für alle Studierenden, also für jedes Array-Element,
            // die toString-Methode der Student-Klasse genutzt.
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
