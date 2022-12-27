import javax.swing.*;
public class GUI1 {
    public static void main(String[] args) {
        // Create a JFrame window
        JFrame frame = new JFrame();

        // Create a widget
        JButton button = new JButton("Click Me");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add widget to frame
        frame.getContentPane().add(button);

        // Display GUI
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
