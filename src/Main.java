import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        new GameUI();
    }
}
class GameUI extends JFrame implements ActionListener {

    JTextField  textField = new JTextField();
    int num1 ;
    String sign;
    boolean divisionByZero = false;


    public GameUI() {
        setTitle("Calculator");
        setSize(500, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initElements();
        setVisible(true);
    }

    private void initElements() {

        textField.setBounds(100, 150, 300, 50);
        textField.setEditable(false);
        add(textField);

        JButton button = new JButton("7");
        button.setBounds(101, 200, 100, 50);
        add(button);

        JButton button1 = new JButton("8");
        button1.setBounds(200, 200, 100, 50);
        add(button1);

        JButton button2 = new JButton("9");
        button2.setBounds(300, 200, 100, 50);
        add(button2);

        JButton button5 = new JButton("4");
        button5.setBounds(101, 250, 100, 50);
        add(button5);

        JButton button6 = new JButton("5");
        button6.setBounds(200, 250, 100, 50);
        add(button6);

        JButton button7 = new JButton("6");
        button7.setBounds(300, 250, 100, 50);
        add(button7);

        JButton button8 = new JButton("1");
        button8.setBounds(101, 300, 100, 50);
        add(button8);

        JButton button9 = new JButton("2");
        button9.setBounds(200, 300, 100, 50);
        add(button9);

        JButton button10 = new JButton("3");
        button10.setBounds(300, 300, 100, 50);
        add(button10);

        JButton button11 = new JButton("0");
        button11.setBounds(200, 350, 100, 50);
        add(button11);

        JButton button3 = new JButton("+");
        button3.setBounds(300, 350, 100, 50);
        add(button3);

        JButton button12 = new JButton("-");
        button12.setBounds(101, 350, 100, 50);
        add(button12);

        JButton button13 = new JButton("C");
        button13.setBounds(200, 400, 100, 50);
        add(button13);

        JButton button14 = new JButton("*");
        button14.setBounds(300, 400, 100, 50);
        add(button14);

        JButton button15 = new JButton("/");
        button15.setBounds(101, 400, 100, 50);
        add(button15);

        JButton button4 = new JButton("=");
        button4.setBounds(200, 450, 100, 50);
        add(button4);

        button.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button10.addActionListener(this);
        button11.addActionListener(this);
        button12.addActionListener(this);
        button13.addActionListener(this);
        button14.addActionListener(this);
        button15.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "1":
                textField.setText(textField.getText() + "1");
                break;
            case "2":
                textField.setText(textField.getText() + "2");
                break;
            case "3":
                textField.setText(textField.getText() + "3");
                break;
            case "4":
                textField.setText(textField.getText() + "4");
                break;
            case "5":
                textField.setText(textField.getText() + "5");
                break;
            case "6":
                textField.setText(textField.getText() + "6");
                break;
            case "7":
                textField.setText(textField.getText() + "7");
                break;
            case "8":
                textField.setText(textField.getText() + "8");
                break;
            case "9":
                textField.setText(textField.getText() + "9");
                break;
            case "0":
                textField.setText(textField.getText() + "0");
                break;
            case "+":

                sign = "+";
                num1 = Integer.parseInt(textField.getText());
                textField.setText("");
                break;

            case "-":
                sign = "-";
                num1 = Integer.parseInt(textField.getText());
                textField.setText("");
                break;
            case "*":
                sign = "*";
                num1 = Integer.parseInt(textField.getText());
                textField.setText("");
                break;

            case "/":
                sign = "/";
                num1 = Integer.parseInt(textField.getText());
                textField.setText("");
                break;

            case "C":
                sign = "";
                num1 = 0;
                textField.setText("");
                divisionByZero = false;
                break;

            case "=":
                int num2 = Integer.parseInt(textField.getText());
                switch (sign) {
                    case "+":
                        textField.setText(String.valueOf(num1 + num2));
                        break;
                    case "-":
                        textField.setText(String.valueOf(num1 - num2));
                        break;
                    case "*":
                        textField.setText(String.valueOf(num1 * num2));
                        break;
                    case "/":
                        if (num2 != 0) {
                            textField.setText(String.valueOf(num1 / num2));
                        } else {
                            textField.setText("Division by zero");
                            divisionByZero = true;
                        }
                        break;
                    default:
                        System.out.println("Unknown operation");
                        break;
                }
                break;
            default:
                System.out.println("some btn");
        }

    }


}