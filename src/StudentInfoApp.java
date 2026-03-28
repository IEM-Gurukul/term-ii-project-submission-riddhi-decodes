import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentInfoApp {

    private JFrame frame;
    private JTextField nameField;
    private JComboBox<String> courseBox;
    private JButton saveButton;
    private JButton clearButton;
    private JTextArea displayArea;

    private RegistrationSystem system = new RegistrationSystem();

    public StudentInfoApp() {
        frame = new JFrame("Student Information System");
        frame.setSize(450, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(4, 2, 10, 10));

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();

        JLabel courseLabel = new JLabel("Course:");
        courseBox = new JComboBox<>(new String[]{
                "Math", "Science", "History"
        });

        saveButton = new JButton("Save");
        clearButton = new JButton("Clear");

        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(courseLabel);
        inputPanel.add(courseBox);
        inputPanel.add(saveButton);
        inputPanel.add(clearButton);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String name = nameField.getText().trim();
                String course = (String) courseBox.getSelectedItem();

                if (name.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Name cannot be empty!");
                    return;
                }

                // Duplicate check
                for (Student s : system.getStudents()) {
                    if (s.getDetails().equals("Name: " + name + ", Course: " + course)) {
                        JOptionPane.showMessageDialog(frame, "Student already registered for this course!");
                        return;
                    }
                }

                Student student = new Student(name, course);
                system.addStudent(student);

                displayArea.setText("");
                for (Student s : system.getStudents()) {
                    displayArea.append(s.getDetails() + "\n");
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                courseBox.setSelectedIndex(0);
                displayArea.setText("");
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new StudentInfoApp();
    }
}