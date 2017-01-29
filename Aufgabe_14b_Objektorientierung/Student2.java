package Aufgabe_14b_Objektorientierung;

/**
 * Erweitere die Klasse Student aus (a) um eine Methode public String toString(), welche die Attribute des Objekts
 * als String zurückgibt. Gib anschließend das Objekt mithilfe der Methode toString() aus.
 * <p>
 *
 * @author Phil Werli
 */
public class Student2 {

    // Attribute eines Studierenden
    private String name;
    private String firstName;
    private int studentID;
    private String courseOfStudy;
    private int semester;

    /**
     * Konstruktor für ein Student-Object.
     */
    public Student2(String name, String firstName, int studentID, String courseOfStudy, int semester) {
        this.name = name;
        this.firstName = firstName;
        this.studentID = studentID;
        this.courseOfStudy = courseOfStudy;
        this.semester = semester;
    }

    /*
     * Jede Klasse in Java erbt von der Object Klasse. Das bedeutet auch, dass alle Attribute und Methoden vererbt
     * werden.
     * Implementiert man eine eigene Klasse, kann man diese Methoden überschreiben. Das spezifiziert man durch das
     * Übernehmen des Methodenkopfes (hier 'public String toString()') und durch die Annotation '@Override'.
     */
    public static void main(String[] args) {
        // Erstellung eines Student Objekts durch Aufruf dessen Konstruktors mit den spezifizierten Parametern.
        Student2 manuelneuer = new Student2("Neuer", "Manuel", 11111, "Goalkeeping Master", 3);

        // ruft die unten implementierte Methode auf
        System.out.println(manuelneuer.toString());
    }

    /**
     * toString()-Methode der Student-Klasse.
     * Überschreibt die toString()-Methode der Object Klasse.
     *
     * @return String-Repräsentation des Student-Objekts.
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return name + ", " + firstName + " studiert " + courseOfStudy + " im " + semester + ". Semester.";

        /* alternative Lösung mit String.format(). Gleich Aufbau wie die printf() Methode aus C/C++.
         * Wurde von Teilnehmern des Tutoriums vorgeschlagen:
         * return String.format("%s, %s studiert %s im %d. Semester.", name, firstName, courseOfStudy, semester);
         */
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

