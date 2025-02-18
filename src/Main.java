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
        System.out.println("Name: " + person.getName());
        System.out.println("Height: " + person.getHeight() + " cm");
        System.out.println("Age: " + person.getAge() + " years");

        // Ask the user for the direction to climb
        String direction = askString("Which direction do you want to climb (up/down)? ");
        person.climb(direction); // Call the climb method
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

    @Override
    public Results getResults(Game guessingOrBetter) {
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
