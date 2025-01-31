import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Person> players;

    public Game() {
        players = new ArrayList<>();
    }

    public void addPlayer(Person player) {
        players.add(player);
    }

    public ResultsImpl getResults() {
        ResultsImpl results = new ResultsImpl();
        for (Person player : players) {
            results.addPlayer(player);
        }
        return results;
    }
}
