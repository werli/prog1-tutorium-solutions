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

    // Jedes Java-Objekt hat eine default/standardmäßige toString-Methode. Da diese aber nur die Objekt-Klasse und den
    // "hash value" des Objekts ausgibt, ist es oft sinnvoll eine eigene Methode zu implementieren. Um die default-Methode
    // zu überschreiben braucht ihr das Keyword "@Override".

    public static void main(String[] args) {
        // Deklarieren und Initialisieren eines neuen Studenten. Der Konstruktor erwartet hierfür alle Attribute die ihr
        // als Parameter übergeben müsst.
        Student2 justin = new Student2("Bieber", "Justin", 12345, "Musicology", 3);

        //System.out.println(String) nimmt als Paramter einen String und greift nun automatisch auf die
        // von euch implementierte toString-Methode zu.
        System.out.println(justin);
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
        return name + ", " + firstName + " studies " + courseOfStudy + " in his/her " + semester + " semester.";

        // alternative Lösung mit String.format(). Gleich Aufbau wie die printf() Methode aus der C/C++.
        // Wurde von Teilnehmern des Tutoriums vorgeschlagen / benutzt.
        // return String.format("%s, %s studies %s in his/her %d semester.", name, firstName, courseOfStudy, semester);
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

