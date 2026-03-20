import javax.swing.*;

public class StudentInfoApp {

    private JFrame frame;

    public StudentInfoApp() {
        frame = new JFrame("Student Information System");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new StudentInfoApp();
    }
}