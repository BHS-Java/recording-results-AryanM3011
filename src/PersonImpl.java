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

    @Override
    public Results getResults() {
        // Implement logic to return results if needed
        return null; // Placeholder
    }
}
