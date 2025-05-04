import javax.swing.*;
import java.awt.event.*;

public class SimpleLoginForm {
    public static void main(String[] args){
        JFrame frame = new JFrame("Login Form");

        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");

        JTextField userText = new JTextField(20);
        JPasswordField passText = new JPasswordField(20);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String username = userText.getText();
                String password = new String(passText.getPassword());
                if(username.equals("admin") && password.equals("1234")){
                    JOptionPane.showMessageDialog(frame, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Credentials!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } 
        });

        userLabel.setBounds(50, 50, 100, 30);   userText.setBounds(150, 50, 150, 30);
        passLabel.setBounds(50, 100, 100, 30);   passText.setBounds(150, 100, 150, 30);
        loginButton.setBounds(150, 150, 100, 30); 

        frame.add(userLabel); frame.add(userText);
        frame.add(passLabel); frame.add(passText);
        frame.add(loginButton);
        frame.setSize(400, 300);
        frame.setLayout(null); // using no layout manager
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
