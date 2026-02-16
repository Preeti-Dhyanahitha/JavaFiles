import javax.swing.*;
import java.awt.event.*;

public class LoginForm {

    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("Login Form");

        // Create Labels
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");

        // Create Text Fields
        JTextField userText = new JTextField();
        JPasswordField passText = new JPasswordField();

        // Create Button
        JButton loginButton = new JButton("Login");

        // Set positions
        userLabel.setBounds(50, 50, 100, 30);
        userText.setBounds(150, 50, 150, 30);

        passLabel.setBounds(50, 100, 100, 30);
        passText.setBounds(150, 100, 150, 30);

        loginButton.setBounds(150, 150, 100, 30);

        // Button Click Event
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String username = userText.getText();
                String password = new String(passText.getPassword());

                if (username.equals("admin") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(frame, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Username or Password");
                }
            }
        });

        // Add components to frame
        frame.add(userLabel);
        frame.add(userText);
        frame.add(passLabel);
        frame.add(passText);
        frame.add(loginButton);

        // Frame settings
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
