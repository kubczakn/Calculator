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
                labelText[0] = labelText[0].concat("(-)");
                textLabel.setText(labelText[0]);
            }
        });
        equalButton.addActionListener(new ActionListener()
        {
            @Override public void actionPerformed(ActionEvent e)
            {
                // performs calculation
                double left_negative = 1;
                double right_negative = 1;
                double result = 0;
                double converted_left = 0;
                double converted_right = 0;
                char current_operator = ' ';
                StringBuilder right = new StringBuilder();
                StringBuilder left = new StringBuilder();

                for (int i = 0; i < labelText[0].length(); ++i) {
                    char c = labelText[0].charAt(i);
                    if (c == '+') {
                        if (converted_left == 0) {
                            converted_left = Double.parseDouble(String.valueOf(left));
                        }
                        current_operator = '+';
                    }

                    else if (c == '/') {
                        if (converted_left == 0) {
                            converted_left = Double.parseDouble(String.valueOf(left));
                        }
                        current_operator = '/';
                    }
                    else if (c == '-' && labelText[0].charAt(0) != '-') {
                        if (converted_left == 0) {
                            converted_left = Double.parseDouble(String.valueOf(left));
                        }
                        current_operator = '-';
                    }
                    else if (c == '*') {
                        if (converted_left == 0) {
                            converted_left = Double.parseDouble(String.valueOf(left));
                        }
                        current_operator = '*';
                    }
                    else if (c == '(') {
                        i += 2;
                        if (converted_left == 0) {
                            if (left_negative == 1) {
                                left_negative = -1;
                            }
                            else {
                                left_negative = 1;
                            }
                        }
                        else {
                            if (right_negative == 1) {
                                right_negative = -1;
                            }
                            else {
                                right_negative = 1;
                            }
                        }

                    }
                    else if (c != ' ') {
                        if (converted_left == 0) {
                            left.append(c);
                        }
                        else {
                            right.append(c);
                        }

                    }

                    else if (right.length() != 0) {
                        converted_right = Double.parseDouble(String.valueOf(right));
                        if (current_operator == '+') {
                            converted_left *= left_negative;
                            converted_right *= right_negative;
                            result = converted_left + converted_right;
                            converted_left = result;
                            converted_right = 0;
                            right =  new StringBuilder();
                        }
                        else if (current_operator == '/') {
                            converted_left *= left_negative;
                            converted_right *= right_negative;
                            result = converted_left / converted_right;
                            converted_left = result;
                            converted_right = 0;
                            right =  new StringBuilder();
                        }
                        else if (current_operator == '-') {
                            converted_left *= left_negative;
                            converted_right *= right_negative;
                            result = converted_left - converted_right;
                            converted_left = result;
                            converted_right = 0;
                            right =  new StringBuilder();
                        }
                        else if (current_operator == '*') {
                            converted_left *= left_negative;
                            converted_right *= right_negative;
                            result = converted_left * converted_right;
                            converted_left = result;
                            converted_right = 0;
                            right =  new StringBuilder();
                        }

                    }
                }
                if (right.length() != 0) {
                    converted_right = Double.parseDouble(String.valueOf(right));
                }
                if (current_operator == '+') {
                    converted_left *= left_negative;
                    converted_right *= right_negative;
                    result = converted_left + converted_right;
                }
                else if (current_operator == '/') {
                    converted_left *= left_negative;
                    converted_right *= right_negative;
                    result = converted_left / converted_right;
                }
                else if (current_operator == '-') {
                    converted_left *= left_negative;
                    converted_right *= right_negative;
                    result = converted_left - converted_right;
                }
                else if (current_operator == '*') {
                    converted_left *= left_negative;
                    converted_right *= right_negative;
                    result = converted_left * converted_right;
                }
                else {
                    result = Double.parseDouble(String.valueOf(left));
                    result *= left_negative;
                }
                labelText[0] = " ";
                labelText[0] = String.valueOf(result);
                textLabel.setText(labelText[0]);
            }
        });
        backButton.addActionListener(new ActionListener()
        {
            @Override public void actionPerformed(ActionEvent e)
            {
                // removes last character in text label
                String end_of_text = labelText[0].substring(labelText[0].length() - 1);
                if (end_of_text.equals(" ")) {
                    for (int i = 0; i < 3; ++i) {
                        labelText[0] = labelText[0].substring(0 , labelText[0].length() - 1);
                    }
                }
                else {
                    labelText[0] = labelText[0].substring(0, labelText[0].length() - 1);
                }
                textLabel.setText(labelText[0]);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new CalculatorGUI("Java Calculator");
        frame.setSize(new Dimension(290, 290));
        frame.setResizable(false);
        frame.setVisible(true);
    }

}
