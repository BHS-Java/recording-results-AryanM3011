public class Player implements Person {
    private String name;
    private int height;
    private int age;
    private Results results;

    public Player(String name, int height, int age, Results results) {
        this.name = name;
        this.height = height;
        this.age = age;
        this.results = results;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
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
        return results;
    }

    @Override
    public void climb(String direction, int steps) {
        switch (direction.toLowerCase()) {
            case "up_right":
                drawUpRight(steps);
                break;
            case "down_left":
                drawDownLeft(steps);
                break;
            case "upside_down_right":
                drawUpsideDownRight(steps);
                break;
            case "upside_down_left":
                drawUpsideDownLeft(steps);
                break;
            default:
                System.out.println("Invalid direction. Use: up_right, down_left, upside_down_right, or upside_down_left.");
        }
    }

    private void drawUpRight(int steps) {
        for (int i = 0; i < steps; i++) {
            System.out.println(" ".repeat(i) + "__");
        }
    }

    private void drawDownLeft(int steps) {
        for (int i = steps - 1; i >= 0; i--) {
            System.out.println(" ".repeat(i) + "__");
        }
    }

    private void drawUpsideDownRight(int steps) {
        for (int i = steps - 1; i >= 0; i--) {
            System.out.println(" ".repeat(i) + "‾‾");
        }
    }

    private void drawUpsideDownLeft(int steps) {
        for (int i = 0; i < steps; i++) {
            System.out.println(" ".repeat(i) + "‾‾");
        }
    }
}
