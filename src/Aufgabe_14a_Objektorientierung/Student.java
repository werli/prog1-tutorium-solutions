package Aufgabe_14a_Objektorientierung;

/**
 * Erstelle eine Klasse Student mit den Attributen Name, Vorname, Matrikelnummer, Studiengang und Fachsemester.
 * Erstelle anschließend ein Objekt der Klasse Student, mit den Eigenschaften, die auf dich selbst zutreffen.
 *
 * @author Phil Werli
 */
public class Student {

    // Attribute eines Studierenden
    private String firstName;
    private String name;
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

    public static void main(String[] args) {
        // Deklarieren und Initialisieren eines neuen Studenten. Der Konstruktor erwartet hierfür alle Attribute die man
        // als Parameter übergeben muss.
        Student justin = new Student("Bieber", "Justin", 12345, "Musicology", 3);
    }

    // Getter und Setter-Methoden, da die Variablen private sind.

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

