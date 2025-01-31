public class PersonImpl implements Person {
    private String name;
    private int height; // in centimeters
    private int age;

    public PersonImpl(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name; // Return the name of the person
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public Results getResults() {
        // Implement logic to return results if needed
        return null; // Placeholder
    }

    // Climb method to simulate climbing stairs in a given direction
    public void climb(String dir) {
        System.out.println(name + " is climbing " + dir + " stairs:");

        // Simulate climbing stairs
        for (int i = 1; i <= 5; i++) { // Outer loop for the number of stairs
            System.out.print("Step " + i + ": ");
            for (int j = 1; j <= 3; j++) { // Inner loop for the climbing action
                System.out.print(dir + " ");
            }
            System.out.println(); // Move to the next line after each step
        }
    }
}
