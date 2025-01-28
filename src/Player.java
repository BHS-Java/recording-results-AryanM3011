import java.util.Scanner;

public class Player {
    //PROPERTIES
    
    String name;
    int ageinmonths;
    String heightmm;

    //CONSTRUCTORS
    String gettName = Person.getName();

    public String gettName(){
        Scanner Height = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter height in mm");
        String height = Height.nextLine();  // Read user input
        System.out.println("Height is: " + height);  // Output user input
        return height;
    }

    //METHODS
}
