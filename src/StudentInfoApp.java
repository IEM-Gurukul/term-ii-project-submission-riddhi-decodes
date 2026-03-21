import javax.swing.*;
import java.awt.*;

public class StudentInfoApp {

    private JFrame frame;
    private JTextField nameField;
    private JComboBox<String> courseBox;

    public StudentInfoApp() {
        frame = new JFrame("Student Information System");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Name input
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(15);

        // Course dropdown
        JLabel courseLabel = new JLabel("Course:");
        courseBox = new JComboBox<>(new String[]{
                "Math", "Science", "History"
        });

        // Add to frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(courseLabel);
        frame.add(courseBox);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new StudentInfoApp();
    }
}