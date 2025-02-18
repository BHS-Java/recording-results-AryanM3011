import java.io.*;
import java.util.*;

public class Game {
    private List<Player> players;
    private Player selectedPlayer;

    public Game() {
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void loadPlayers(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 3) {
                    String name = data[0];
                    int height = Integer.parseInt(data[1]);
                    int age = Integer.parseInt(data[2]);
                    Results results = new Results(); // Modify to fit your Results implementation
                    players.add(new Player(name, height, age, results));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error reading the CSV file: " + e.getMessage());
        }
    }

    public void selectPlayer(String name) {
        for (Player player : players) {
            if (player.getName().equalsIgnoreCase(name)) {
                this.selectedPlayer = player;
                System.out.println("Selected player: " + player.getName());
                return;
            }
        }
        System.out.println("Player not found.");
    }

    public Player getSelectedPlayer() {
        return selectedPlayer;
    }

    public Results getResults() {
        Results results = new Results();
        for (Player player : players) {
            results.addPlayer(player);
        }
        return results;
    }
}
