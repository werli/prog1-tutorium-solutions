package Klausurvorbereitung.Aufgabe_6;

public class Player {

    private Position position;
    private int numberOfGoals;

    public Player(Position position, int goals) {
        this.position = position;
        this.numberOfGoals = goals;
    }

    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    public void setNumberOfGoals(int goals) {
        this.numberOfGoals = goals;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
