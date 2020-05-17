import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.text.*;

public class CalculatorGUI extends JFrame
{
    private JPanel mainPanel;
    private JButton decimalButton;
    private JButton zeroButton;
    private JButton negativeButton;
    private JButton equalButton;
    private JButton addButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JButton backButton;
    private JButton threeButton;
    private JButton twoButton;
    private JButton oneButton;
    private JButton fourButton;
    private JButton fiveButton;
    private JButton sixButton;
    private JButton nineButton;
    private JButton eightButton;
    private JButton sevenButton;
    private JButton clearButton;
    private JPanel textPanel;
    private JPanel buttonPanel;
    private JLabel textLabel;

    public CalculatorGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        final String[] labelText = { " " };
        textLabel.setText(labelText[0]);
        textLabel.setBackground(Color.white);
        zeroButton.addActionListener(new ActionListener()
        {
            @Override public void actionPerformed(ActionEvent e)
            { // insert a 0 into the text pane
                labelText[0] = labelText[0].concat("0");
                textLabel.setText(labelText[0]);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new CalculatorGUI("Java Calculator");

        frame.setVisible(true);
    }

}
