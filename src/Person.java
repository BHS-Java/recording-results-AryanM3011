public interface Person {
    void setName(String name);
    String getName(); // This should be an instance method, not static
    int getHeight();
    int getAge();
    Results getResults(); 
    void climb(String location); // Add the climb method


}
