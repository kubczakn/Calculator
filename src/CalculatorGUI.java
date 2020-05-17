import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;
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
    private JButton minusButton;

    public CalculatorGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        final String[] labelText = { " " };
        textLabel.setText(labelText[0]);
        textLabel.setBackground(Color.white);
        textLabel.setBorder(new EmptyBorder(0, 0, 0, 5));
        zeroButton.addActionListener(new ActionListener()
        {
            @Override public void actionPerformed(ActionEvent e)
            {
                // insert a 0 into the text label
                labelText[0] = labelText[0].concat("0");
                textLabel.setText(labelText[0]);
            }
        });
        sevenButton.addActionListener(new ActionListener()
        {
            @Override public void actionPerformed(ActionEvent e)
            {
                // insert a 7 into the text label
                labelText[0] = labelText[0].concat("7");
                textLabel.setText(labelText[0]);
            }
        });
        eightButton.addActionListener(new ActionListener()
        {
            @Override public void actionPerformed(ActionEvent e)
            {
                // insert an 8 into the text label
                labelText[0] = labelText[0].concat("8");
                textLabel.setText(labelText[0]);
            }
        });
        nineButton.addActionListener(new ActionListener()
        {
            @Override public void actionPerformed(ActionEvent e)
            {
                // insert a 9 into the text label
                labelText[0] = labelText[0].concat("9");
                textLabel.setText(labelText[0]);
            }
        });
        fourButton.addActionListener(new ActionListener()
        {
            @Override public void actionPerformed(ActionEvent e)
            {
                // insert a 4 into the text label
                labelText[0] = labelText[0].concat("4");
                textLabel.setText(labelText[0]);
            }
        });
        fiveButton.addActionListener(new ActionListener()
        {
            @Override public void actionPerformed(ActionEvent e)
            {
                // insert a 5 into the text label
                labelText[0] = labelText[0].concat("5");
                textLabel.setText(labelText[0]);
            }
        });
        sixButton.addActionListener(new ActionListener()
        {
            @Override public void actionPerformed(ActionEvent e)
            {
                // insert a 6 into the text label
                labelText[0] = labelText[0].concat("6");
                textLabel.setText(labelText[0]);
            }
        });
        oneButton.addActionListener(new ActionListener()
        {
            @Override public void actionPerformed(ActionEvent e)
            {
                // insert a 1 into the text label
                labelText[0] = labelText[0].concat("1");
                textLabel.setText(labelText[0]);
            }
        });
        twoButton.addActionListener(new ActionListener()
        {
            @Override public void actionPerformed(ActionEvent e)
            {
                // insert a 2 into the text label
                labelText[0] = labelText[0].concat("2");
                textLabel.setText(labelText[0]);
            }
        });
        threeButton.addActionListener(new ActionListener()
        {
            @Override public void actionPerformed(ActionEvent e)
            {
                // insert a 3 into the text label
                labelText[0] = labelText[0].concat("3");
                textLabel.setText(labelText[0]);
            }
        });
        divideButton.addActionListener(new ActionListener()
        {
            @Override public void actionPerformed(ActionEvent e)
            {
                // divides what's in text label
                labelText[0] = labelText[0].concat(" / ");
                textLabel.setText(labelText[0]);
            }
        });
        multiplyButton.addActionListener(new ActionListener()
        {
            @Override public void actionPerformed(ActionEvent e)
            {
                // multiplies what's in text label
                labelText[0] = labelText[0].concat(" * ");
                textLabel.setText(labelText[0]);
            }
        });
        addButton.addActionListener(new ActionListener()
        {
            @Override public void actionPerformed(ActionEvent e)
            {
                // adds what's in text label
                labelText[0] = labelText[0].concat(" + ");
                textLabel.setText(labelText[0]);
            }
        });
        minusButton.addActionListener(new ActionListener()
        {
            @Override public void actionPerformed(ActionEvent e)
            {
                // subtracts what's in text label
                labelText[0] = labelText[0].concat(" - ");
                textLabel.setText(labelText[0]);
            }
        });
        clearButton.addActionListener(new ActionListener()
        {
            @Override public void actionPerformed(ActionEvent e)
            {
                // clears what's in text label
                labelText[0] = " ";
                textLabel.setText(labelText[0]);
            }
        });
        decimalButton.addActionListener(new ActionListener()
        {
            @Override public void actionPerformed(ActionEvent e)
            {
                // inserts a decimal point
                labelText[0] = labelText[0].concat(".");
                textLabel.setText(labelText[0]);
            }
        });
        negativeButton.addActionListener(new ActionListener()
        {
            @Override public void actionPerformed(ActionEvent e)
            {
                // inserts a negative in the text label
                labelText[0] = labelText[0].concat("-");
                textLabel.setText(labelText[0]);
            }
        });
        equalButton.addActionListener(new ActionListener()
        {
            @Override public void actionPerformed(ActionEvent e)
            {
                // performs calculation
            }
        });
        backButton.addActionListener(new ActionListener()
        {
            @Override public void actionPerformed(ActionEvent e)
            {
                // goes back a space in the text label
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new CalculatorGUI("Java Calculator");

        frame.setVisible(true);
    }

}
