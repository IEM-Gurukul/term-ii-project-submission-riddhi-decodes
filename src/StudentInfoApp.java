import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentInfoApp {

    private JFrame frame;
    private JTextField nameField;
    private JComboBox<String> courseBox;
    private JButton saveButton;
    private JTextArea displayArea;

    private RegistrationSystem system = new RegistrationSystem();

    public StudentInfoApp() {
        frame = new JFrame("Student Information System");
        frame.setSize(450, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Input panel
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

        // Display area
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Button action
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String course = (String) courseBox.getSelectedItem();

                Student student = new Student(name, course);
                system.addStudent(student);

                displayArea.setText("");
                for (Student s : system.getStudents()) {
                    displayArea.append(s.getDetails() + "\n");
                }
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new StudentInfoApp();
    }
}