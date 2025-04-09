
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PassFailExamDemo {

    private JTextField questionsField;
    private JTextField missedField;
    private JTextField minPassingField;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exam Results");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 500);
        frame.setLocationRelativeTo(null);

        PassFailExamDemo student = new PassFailExamDemo();

        JLabel questionsLabel = new JLabel("How many questions are on the exam?");
        JLabel missedLabel = new JLabel("How many questions did the student miss?");
        JLabel minPassingLabel = new JLabel("What is the minimum passing score?");

        student.questionsField = new JTextField(20);
        student.missedField = new JTextField(20);
        student.minPassingField = new JTextField(20);

        JButton submitButton = new JButton("Submit");

        frame.setLayout(new GridLayout(4, 2, 10, 10));

        frame.add(questionsLabel);
        frame.add(student.questionsField);
        frame.add(missedLabel);
        frame.add(student.missedField);
        frame.add(minPassingLabel);
        frame.add(student.minPassingField);
        frame.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                student.submitInfo(frame);
            }
        });

        frame.setVisible(true);
    }

    public void submitInfo(JFrame parentFrame) {
        String questions = questionsField.getText().trim();
        String missed = missedField.getText().trim();
        String minPassing = minPassingField.getText().trim();

        String resultsMsg = String.format("""
                                          There were %s questions on the exam.\n
                                          The student missed %s questions.\n
                                          The minimum passing score was %s.""", questions, missed, minPassing);

        JOptionPane.showMessageDialog(parentFrame, resultsMsg, "Results", JOptionPane.INFORMATION_MESSAGE);
    }
}
