package com.miu.fpp.midtermprem.nq1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String[] args) {


        calculator();
    }

    static JButton zero, one, two, three, four, five, six, seven, eight, nine, times, plus, minus, divide, equals;
    static JTextField jTextField;


    public static void calculator() {

        JFrame cFrame = new JFrame("Calculator");
        cFrame.setSize(400, 500);
//        cFrame.setResizable(true);
        cFrame.setLayout(null);
        cFrame.setVisible(true);


        jTextField = new JTextField("");
        jTextField.setBounds(40, 60, 280, 40);
        cFrame.add(jTextField);


        zero = new JButton("0");

        zero.setBounds(40, 110, 40, 40);
        cFrame.add(zero);
        zero.addActionListener(Calculator::actionPerformed);


        one = new JButton("1");

        one.setBounds(80, 110, 40, 40);
        cFrame.add(one);
        one.addActionListener(Calculator::actionPerformed);


        two = new JButton("2");
        two.setBounds(120, 110, 40, 40);
        cFrame.add(two);
        two.addActionListener(Calculator::actionPerformed);

        three = new JButton("3");
        three.setBounds(160, 110, 40, 40);
        cFrame.add(three);
        three.addActionListener(Calculator::actionPerformed);


        four = new JButton("4");
        four.setBounds(40, 150, 40, 40);
        cFrame.add(four);
        four.addActionListener(Calculator::actionPerformed);


        five = new JButton("5");
        five.setBounds(80, 150, 40, 40);
        cFrame.add(five);
        five.addActionListener(Calculator::actionPerformed);


        six = new JButton("6");
        six.setBounds(120, 150, 40, 40);
        cFrame.add(six);
        six.addActionListener(Calculator::actionPerformed);


        seven = new JButton("7");
        seven.setBounds(160, 150, 40, 40);
        cFrame.add(seven);
        seven.addActionListener(Calculator::actionPerformed);



        eight = new JButton("8");
        eight.setBounds(40, 190, 40, 40);
        cFrame.add(eight);
        eight.addActionListener(Calculator::actionPerformed);


        nine = new JButton("9");
        nine.setBounds(80, 190, 40, 40);
        cFrame.add(nine);
        nine.addActionListener(Calculator::actionPerformed);


        equals = new JButton("=");
        equals.setBounds(120, 190, 80, 40);
        cFrame.add(equals);
        equals.addActionListener(Calculator::actionPerformed);

//        seven = new JButton("7");
//        seven.setBounds(160,150,40,40);
//        cFrame.add(seven);

        plus = new JButton("+");
        plus.setBounds(200, 110, 60, 60);
        cFrame.add(plus);
        plus.addActionListener(Calculator::actionPerformed);


        minus = new JButton("-");
        minus.setBounds(260, 110, 60, 60);
        cFrame.add(minus);
        minus.addActionListener(Calculator::actionPerformed);


        times = new JButton("X");
        times.setBounds(200, 170, 60, 60);
        cFrame.add(times);
        times.addActionListener(Calculator::actionPerformed);

        divide = new JButton("/");
        divide.setBounds(260, 170, 60, 60);
        cFrame.add(divide);
        divide.addActionListener(Calculator::actionPerformed);
    }


    public static void actionPerformed(ActionEvent e) {

        if (zero.equals(e.getSource())) {
            setText("0");
        }
        if (one.equals(e.getSource())) {
            setText("1");
        }
        if (two.equals(e.getSource())) {
            setText("2");
        }
        if (three.equals(e.getSource())) {
            setText("3");
        }
        if (four.equals(e.getSource())) {
            setText("4");
        }
        if (five.equals(e.getSource())) {
            setText("5");
        }

        if (six.equals(e.getSource())) {
            setText("6");
        }

        if (seven.equals(e.getSource())) {
            setText("7");
        }

        if (eight.equals(e.getSource())) {
            setText("8");
        }
        if (nine.equals(e.getSource())) {
            setText("9");
        }
        if (minus.equals(e.getSource())) {
            setText("-");
        }
        if (times.equals(e.getSource())) {
            setText("*");
        }
        if (plus.equals(e.getSource())) {
            setText("+");
        }
        if (divide.equals(e.getSource())) {
            setText("/");
        }

        if (equals.equals(e.getSource())) {
            String val = jTextField.getText();
            if (val.contains("+")) {
                String[] splitVal = val.split("\\+");
                int res = Integer.parseInt(splitVal[0]) + Integer.parseInt(splitVal[1]);
                jTextField.setText(Integer.toString(res));

            }
        }

    }

    public static void setText(String val) {
        jTextField.setText(jTextField.getText() + val);
    }
}
