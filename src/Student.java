public class Student extends Person {
    private String course;

    public Student(String name, String course) {
        super(name);
        this.course = course;
    }

    @Override
    public String getDetails() {
        return "Name: " + name + ", Course: " + course;
    }
}