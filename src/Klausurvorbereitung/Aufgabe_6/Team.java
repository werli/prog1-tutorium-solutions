package Klausurvorbereitung.Aufgabe_6;

public class Team {

    private Player[] players = new Player[7];

    public Team(Player[] players) {
        this.players = players;
    }

    private Player getTopScorer() {
        Player topScorer = null;
        int mostGoals = 0;
        for (int i = 0; i < players.length; i++) {
            if (players[i].getNumberOfGoals() > mostGoals) {
                mostGoals = players[i].getNumberOfGoals();
                topScorer = players[i];
            }
        }
        return topScorer;
    }

}
