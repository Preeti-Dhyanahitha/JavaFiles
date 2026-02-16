import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

public class StudentManagementGUI {

    public static void main(String[] args) {

        // Frame
        JFrame frame = new JFrame("Student Management System");

        // Labels
        JLabel lblId = new JLabel("Student ID:");
        JLabel lblName = new JLabel("Name:");
        JLabel lblCourse = new JLabel("Course:");

        // Text fields
        JTextField txtId = new JTextField();
        JTextField txtName = new JTextField();
        JTextField txtCourse = new JTextField();

        // Buttons
        JButton btnAdd = new JButton("Add");
        JButton btnClear = new JButton("Clear");

        // Table
        String[] columns = {"Student ID", "Name", "Course"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);

        // Set positions
        lblId.setBounds(30, 30, 100, 25);
        txtId.setBounds(140, 30, 150, 25);

        lblName.setBounds(30, 70, 100, 25);
        txtName.setBounds(140, 70, 150, 25);

        lblCourse.setBounds(30, 110, 100, 25);
        txtCourse.setBounds(140, 110, 150, 25);

        btnAdd.setBounds(50, 160, 100, 30);
        btnClear.setBounds(170, 160, 100, 30);

        sp.setBounds(320, 30, 350, 200);

        // Add button action
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String id = txtId.getText();
                String name = txtName.getText();
                String course = txtCourse.getText();

                if (id.isEmpty() || name.isEmpty() || course.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "All fields are required");
                } else {
                    model.addRow(new Object[]{id, name, course});
                    JOptionPane.showMessageDialog(frame, "Student Added Successfully");

                    // Clear fields
                    txtId.setText("");
                    txtName.setText("");
                    txtCourse.setText("");
                }
            }
        });

        // Clear button action
        btnClear.addActionListener(e -> {
            txtId.setText("");
            txtName.setText("");
            txtCourse.setText("");
        });

        // Add components
        frame.add(lblId);
        frame.add(txtId);
        frame.add(lblName);
        frame.add(txtName);
        frame.add(lblCourse);
        frame.add(txtCourse);
        frame.add(btnAdd);
        frame.add(btnClear);
        frame.add(sp);

        // Frame settings
        frame.setSize(720, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
