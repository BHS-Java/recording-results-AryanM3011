import java.util.Scanner;

public class Main implements Spec {
    public static final Scanner USER = new Scanner(System.in);
    private Game game;

    public Main() {
        game = new Game();
    }

    public static void main(String[] args) {
        Main me = new Main();
        me.run();
    }

    public void run() {
        String name = askString("Who are you? ");
        int height = askNumber("What is your height in cm? ");
        int age = askNumber("How old are you? ");

        // Create a Person object using the provided information
        Person person = new PersonImpl(name, height, age);
        game.addPlayer(person);
        

        // Display the created person's information
        System.out.println("Person created: ");
        System.out.println("Name: " + Person.getName());
        System.out.println("Height: " + person.getHeight() + " cm");
        System.out.println("Age: " + person.getAge() + " years");

        // Get results from the game
        ResultsImpl results = getResults(game);
        System.out.println("Players in the game:");
        for (Person p : results.getPlayers()) {
            System.out.println("Name: " + Person.getName() + ", Height: " + p.getHeight() + ", Age: " + p.getAge());
        }
    }

    @Override
    public String askString(String question) {
        System.out.print(question);
        return USER.nextLine();
    }

    @Override
    public int askNumber(String question) {
        System.out.print(question);
        return USER.nextInt();
    }


    public ResultsImpl getResults(Game guessingOrBetter) {
        return guessingOrBetter.getResults();
    }

    @Override
    public Person makePerson(String name) {
        // This method is not used in this implementation
        return null; // Placeholder
    }

    @Override
    public void addResults(Person player) {
        // This method can be used to add results if needed
    }
}
