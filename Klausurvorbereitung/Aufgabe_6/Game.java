package Klausurvorbereitung.Aufgabe_6;

public class Game {

    private Team firstTeam;
    private Team secondTeam;
    private String result;

    public Game(Team firstTeam, Team secondTeam, String result) {
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        this.result = result;
    }

    public Team getFirstTeam() {
        return firstTeam;
    }

    public void setFirstTeam(Team firstTeam) {
        this.firstTeam = firstTeam;
    }

    public Team getSecondTeam() {
        return secondTeam;
    }

    public void setSecondTeam(Team secondTeam) {
        this.secondTeam = secondTeam;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
