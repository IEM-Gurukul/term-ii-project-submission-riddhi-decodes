import javax.swing.*;
import java.awt.*;

public class StudentInfoApp {

    private JFrame frame;
    private JTextField nameField;
    private JComboBox<String> courseBox;
    private JButton saveButton;

    public StudentInfoApp() {
        frame = new JFrame("Student Information System");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Better layout
        frame.setLayout(new GridLayout(3, 2, 10, 10));

        // Components
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();

        JLabel courseLabel = new JLabel("Course:");
        courseBox = new JComboBox<>(new String[]{
                "Math", "Science", "History"
        });

        saveButton = new JButton("Save");

        // Add to frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(courseLabel);
        frame.add(courseBox);
        frame.add(new JLabel()); // empty space
        frame.add(saveButton);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new StudentInfoApp();
    }
}