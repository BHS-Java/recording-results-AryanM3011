public abstract class Player implements Person {
    private String name;
    private int height; // in centimeters
    private int age; // in years

    public Player(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getAge() {
        return age;
    }
}