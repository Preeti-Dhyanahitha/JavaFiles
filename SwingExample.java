import javax.swing.*;
import java.awt.event.*;

public class SwingExample {
    public static void main(String[] args) {

        // 1. Create a frame (window)
        JFrame frame = new JFrame("Swing Example");

        // 2. Create a button
        JButton button = new JButton("Click Me");

        // 3. Set button position and size
        button.setBounds(100, 100, 120, 40);

        // 4. Add action listener to button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Hello, Welcome to Java Swing!");
            }
        });

        // 5. Add button to frame
        frame.add(button);

        // 6. Set frame size
        frame.setSize(300, 300);

        // 7. Set layout (null means manual positioning)
        frame.setLayout(null);

        // 8. Make frame visible
        frame.setVisible(true);

        // 9. Close application when frame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
