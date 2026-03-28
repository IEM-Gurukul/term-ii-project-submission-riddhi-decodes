public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getDetails() {
        return "Name: " + name;
    }
}