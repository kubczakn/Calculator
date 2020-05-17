import javax.swing.*;

public class CalculatorGUI extends JFrame
{
    private JPanel mainPanel;
    private JTextPane textPane1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button10;
    private JButton button11;
    private JButton button17;
    private JButton button18;

    public CalculatorGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
    }

    public static void main(String[] args) {
        JFrame frame = new CalculatorGUI("Simple Java Calculator");
        frame.setVisible(true);
    }

}
