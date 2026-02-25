package org.calculator;

import javax.swing.*;

public class CalculatorUI {
    private static JTextField result;
    public static void main(String ... args) {

        JFrame calculator = new JFrame("Calculator");
        result = new JTextField();
        result.setBounds(0, 0, 150, 50);
        result.setEditable(false);

        JButton cancel = new JButton("C");
        cancel.setBounds(150, 0, 50, 50);
        cancel.addActionListener(e -> result.setText(""));

        JButton one = getButton("1", 0, 50);

        JButton two = getButton("2", 50, 50);

        JButton three = getButton("3", 100, 50);

        JButton plus = new JButton("+");
        plus.setBounds(150, 50, 50, 50);

        JButton four = getButton("4", 0, 100);

        JButton five = getButton("5", 50, 100);

        JButton six = getButton("6", 100, 100);

        JButton minus  = new JButton("-");
        minus.setBounds(150, 100, 50, 50);

        JButton seven = getButton("7", 0, 150);

        JButton eight = getButton("8", 50, 150);

        JButton nine = getButton("9", 100, 150);

        JButton multiply = new JButton("*");
        multiply.setBounds(150, 150, 50, 50);


        JButton point = getButton(".", 0, 200);

        JButton zero = getButton("0", 50, 200);

        JButton equal = new JButton("=");
        equal.setBounds(100, 200 , 50, 50);

        JButton division = new JButton("/");
        division.setBounds(150, 200, 50, 50);


        calculator.add(result);
        calculator.add(cancel);
        calculator.add(one);
        calculator.add(two);
        calculator.add(three);
        calculator.add(four);
        calculator.add(five);
        calculator.add(six);
        calculator.add(seven);
        calculator.add(eight);
        calculator.add(nine);
        calculator.add(plus);
        calculator.add(minus);
        calculator.add(point);
        calculator.add(multiply);
        calculator.add(zero);
        calculator.add(equal);
        calculator.add(division);



        calculator.setSize(600, 600);
        calculator.setLayout(null);
        calculator.setVisible(true);


    }

    private static JButton getButton(String label, int xPosition, int yPosition) {
        JButton point = new JButton(label);
        point.setBounds(xPosition, yPosition, 50, 50);
        point.addActionListener(event -> result.setText(result.getText() + point.getText()));
        return point;
    }


}

