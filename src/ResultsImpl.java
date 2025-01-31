import java.util.ArrayList;
import java.util.List;

public class ResultsImpl extends Results {
    private List<Person> players;

    public ResultsImpl() {
        players = new ArrayList<>();
    }

    public void addPlayer(Person player) {
        players.add(player);
    }

    
    public List<Person> getPlayers() {
        return players;
    }
}
