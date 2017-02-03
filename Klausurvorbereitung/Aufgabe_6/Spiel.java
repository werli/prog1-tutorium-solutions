package Klausurvorbereitung.Aufgabe_6;

/**
 * Diese Klasse modelliert ein Fußballspiel.
 * <p>
 * Ein Spiel besteht aus zwei Mannschaften und einem String, in dem das Ergebnis abgelegt ist.
 */
public class Spiel {

    private Mannschaft ersteMannschaft;
    private Mannschaft zweiteMannschaft;
    private String ergebnis;

    /**
     * Konstruiert ein neues Objekt der Klasse Spiel.
     *
     * @param ersteMannschaft die erste Mannschaft des Spiels
     * @param zweiteMannschaft die zweite Mannschaft des Spiels
     * @param ergebnis das Ergebnis des Spiels
     */
    public Spiel(Mannschaft ersteMannschaft, Mannschaft zweiteMannschaft, String ergebnis) {
        this.ersteMannschaft = ersteMannschaft;
        this.zweiteMannschaft = zweiteMannschaft;
        this.ergebnis = ergebnis;
    }

    public Mannschaft getErsteMannschaft() {
        return ersteMannschaft;
    }

    public void setErsteMannschaft(Mannschaft ersteMannschaft) {
        this.ersteMannschaft = ersteMannschaft;
    }

    public Mannschaft getZweiteMannschaft() {
        return zweiteMannschaft;
    }

    public void setZweiteMannschaft(Mannschaft zweiteMannschaft) {
        this.zweiteMannschaft = zweiteMannschaft;
    }

    public String getErgebnis() {
        return ergebnis;
    }

    public void setErgebnis(String ergebnis) {
        this.ergebnis = ergebnis;
    }
}
