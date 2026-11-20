
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizBattleGUI extends JFrame implements ActionListener {

    JLabel lblQuestion;
    JLabel lblResult;
    JButton btnOption1;
    JButton btnOption2;

    Questions question;

    public QuizBattleGUI() {

        question = new Questions(
            "Which keyword creates an object?",
            "new",
            "class",
            "new"
        );

        setTitle("Programming Quiz Battle");
        setSize(400, 250);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblQuestion = new JLabel(question.getQuestion());
        lblResult = new JLabel("Answer the question!");

        btnOption1 = new JButton("new");
        btnOption2 = new JButton("class");

        btnOption1.addActionListener(this);
        btnOption2.addActionListener(this);

        add(lblQuestion);
        add(btnOption1);
        add(btnOption2);
        add(lblResult);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton button = (JButton) e.getSource();

        if (question.isCorrect(button.getText())) {
            lblResult.setText("Correct! You defeated the Code Boss!");
        } else {
            lblResult.setText("Wrong! Try Again!");
        }
    }

    public static void main(String[] args) {
        new QuizBattleGUI();
    }
}
