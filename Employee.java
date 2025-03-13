import java.awt.*;
import java.awt.event.*;

public class Employee {

    public static void main(String args[]) {

        Frame frame = new Frame("Employee Information Form");

        Label nameLabel = new Label("Name: ");
        Label idLabel = new Label("Employee ID: ");
        Label deptLabel = new Label("Department: ");

        TextField nameField = new TextField(20);
        TextField idField = new TextField(20);
        TextField deptField = new TextField(20);

        Button submitButton = new Button("Submit");

        TextArea displayArea = new TextArea(5, 20);
        displayArea.setEditable(false);

        frame.setLayout(new GridLayout(5, 2));

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(idLabel);
        frame.add(idField);
        frame.add(deptLabel);
        frame.add(deptField);
        frame.add(submitButton);
        frame.add(displayArea);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String id = idField.getText();
                String dept = deptField.getText();

                displayArea.setText("Name: " + name + "\nEmployee ID: " + id + "\nDepartment: " + dept);
            }
        });

        frame.setSize(1000, 500);
        frame.setVisible(true);
    }
}
