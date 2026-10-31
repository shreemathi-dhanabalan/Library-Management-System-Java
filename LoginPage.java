import javax.swing.*;
import java.awt.*;

public class LoginPage {

    JFrame frame;
    JLabel lblTitle;
    JLabel lblUsername;
    JLabel lblPassword;

    JTextField txtUsername;
    JPasswordField txtPassword;

    JButton btnLogin;

    LoginPage() {

        // Create Window
        frame = new JFrame("Library Management System");

        // Window Size
        frame.setSize(500, 350);

        // Close Program
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // No Layout Manager
        frame.setLayout(null);

        // Background Color
        frame.getContentPane().setBackground(Color.WHITE);

        // ---------------- TITLE ----------------

        lblTitle = new JLabel("LIBRARY MANAGEMENT SYSTEM");
        lblTitle.setBounds(100, 20, 300, 30);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(lblTitle);

        // ---------------- USERNAME ----------------

        lblUsername = new JLabel("Username");
        lblUsername.setBounds(50, 80, 100, 30);
        frame.add(lblUsername);

        txtUsername = new JTextField();
        txtUsername.setBounds(170, 80, 220, 30);
        frame.add(txtUsername);

        // ---------------- PASSWORD ----------------

        lblPassword = new JLabel("Password");
        lblPassword.setBounds(50, 130, 100, 30);
        frame.add(lblPassword);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(170, 130, 220, 30);
        frame.add(txtPassword);

        // ---------------- LOGIN BUTTON ----------------

        btnLogin = new JButton("Login");
        btnLogin.setBounds(170, 200, 100, 35);
        frame.add(btnLogin);

        // ---------------- BUTTON ACTION ----------------

        btnLogin.addActionListener(e -> {

            String username = txtUsername.getText();
            String password = new String(txtPassword.getPassword());

            if (username.equals("admin") && password.equals("1234")) {

    JOptionPane.showMessageDialog(frame,
            "Login Successful");

    frame.dispose();

    new Dashboard();

} else {

    JOptionPane.showMessageDialog(frame,
            "Invalid Username or Password");

}

        });

        // Show Window
        frame.setVisible(true);

    }

}