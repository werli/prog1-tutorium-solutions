package Aufgabe_15a_CMS;

/**
 * Erstelle eine Klasse Student mit den Attributen Name, Vorname, Matrikelnummer, Studiengang und Fachsemester.
 * Erstelle anschließend ein Objekt der Klasse Student, mit den Eigenschaften, die auf dich selbst zutreffen.
 *
 * @author Phil Werli
 */
public class Student {

    // Attribute eines Studierenden
    private String name;
    private String firstName;
    private int studentID;
    private String courseOfStudy;
    private int semester;

    /**
     * Konstruktor für ein Student-Object.
     */
    public Student(String name, String firstName, int studentID, String courseOfStudy, int semester) {
        this.name = name;
        this.firstName = firstName;
        this.studentID = studentID;
        this.courseOfStudy = courseOfStudy;
        this.semester = semester;
    }

    /**
     * toString-Methode der Student-Klasse
     *
     * @return String-Repräsentation des Student-Objekts.
     */
    @Override
    public String toString() {
        return name + ", " + firstName + " studies " + courseOfStudy + " in his/her " + semester + " semester.";
    }

    // Getter und Setter-Methoden, da die Variablen private sind.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getCourseOfStudy() {
        return courseOfStudy;
    }

    public void setCourseOfStudy(String courseOfStudy) {
        this.courseOfStudy = courseOfStudy;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}

