import javax.swing.*;
import java.awt.*;

public class StudentInfoApp {

    private JFrame frame;
    private JTextField nameField;
    private JComboBox<String> courseBox;
    private JButton saveButton;
    private JTextArea displayArea;

    public StudentInfoApp() {
        frame = new JFrame("Student Information System");
        frame.setSize(450, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout());

        // Top panel (inputs)
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10));

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();

        JLabel courseLabel = new JLabel("Course:");
        courseBox = new JComboBox<>(new String[]{
                "Math", "Science", "History"
        });

        saveButton = new JButton("Save");

        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(courseLabel);
        inputPanel.add(courseBox);
        inputPanel.add(new JLabel());
        inputPanel.add(saveButton);

        // Text area (output)
        displayArea = new JTextArea();
        displayArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(displayArea);

        // Add to frame
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new StudentInfoApp();
    }
}