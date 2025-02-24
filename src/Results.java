import java.util.ArrayList;
import java.util.List;

public class Results {
    private List<Person> players;

    public Results() {
        players = new ArrayList<>();
    }

    // Method to add a player to the results
    public void addPlayer(Person player) {
        players.add(player);
    }

    // Method to get the list of players
    public List<Person> getPlayers() {
        return players;
    }
}
