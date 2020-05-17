import javax.swing.*;

public class CalculatorGUI extends JFrame
{
    private JPanel mainPanel;
    private JTextPane textPane;
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

    private CalculatorGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
    }

    public static void main(String[] args) {
        JFrame frame = new CalculatorGUI("Java Calculator");
        frame.setVisible(true);
    }

}
