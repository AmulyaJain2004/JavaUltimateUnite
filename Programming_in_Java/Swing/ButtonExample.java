import javax.swing.*;
import java.awt.event.*; // for the ActionListener interface
public class ButtonExample{
    public static void main(String[] args){
        JFrame frame = new JFrame("Button Example");
        JButton button = new JButton("Click Me!");

        button.setBounds(140, 80, 120, 40);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
                // JOptionPane.showMessageDialog(frame, "Button clicked!");
            }
        });

        frame.add(button);
        frame.setSize(400, 300);
        frame.setLayout(null); // using no layout manager
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}