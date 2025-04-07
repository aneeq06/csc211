import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Registration {

    private JTextField nameField;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;

    public static void main(String[] args) {
        JFrame frame = new JFrame("User Registration");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        Registration registration = new Registration();

        JLabel nameLabel = new JLabel("Name: ");
        JLabel emailLabel = new JLabel("Email: ");
        JLabel passwordLabel = new JLabel("Password: ");
        JLabel confirmPasswordLabel = new JLabel("Confirm Password: ");

        registration.nameField = new JTextField(20);
        registration.emailField = new JTextField(20);
        registration.passwordField = new JPasswordField(20);
        registration.confirmPasswordField = new JPasswordField(20);

        JButton submitButton = new JButton("Submit");
        JButton clearButton = new JButton("Clear");

        frame.setLayout(new GridLayout(5, 2, 10, 10));

        frame.add(nameLabel);
        frame.add(registration.nameField);
        frame.add(emailLabel);
        frame.add(registration.emailField);
        frame.add(passwordLabel);
        frame.add(registration.passwordField);
        frame.add(confirmPasswordLabel);
        frame.add(registration.confirmPasswordField);
        frame.add(submitButton);
        frame.add(clearButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registration.submitForm(frame);
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registration.clearForm();
            }
        });

        frame.setVisible(true);
    }

    private void submitForm(JFrame registrationFrame) {
        String name = nameField.getText().trim();
        String email = emailField.getText().trim();
        String password = new String(passwordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword());

        if (name.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(registrationFrame, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String successMsg = String.format("Resgistration Successful!\n\nName: %s\nEmail: %s\nPassword: %s",
                name, email, password);

        if (password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(registrationFrame, successMsg, "Registration Complete", JOptionPane.INFORMATION_MESSAGE);
            return;
        } else {
            JOptionPane.showMessageDialog(registrationFrame, "Passwords don't match.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    private void clearForm() {
        nameField.setText("");
        emailField.setText("");
        passwordField.setText("");
        confirmPasswordField.setText("");
    }
}
