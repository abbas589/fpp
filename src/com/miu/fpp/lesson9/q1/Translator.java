package com.miu.fpp.lesson9.q1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class Translator {

    public static void main(String[] args) {

//         WindowMethod();


        JFrame jFrame = new JFrame("Translator APP");
        JTextField jTextField = new JTextField();
        jTextField.setBounds(40, 40, 200, 40);

        jFrame.add(jTextField);

        JLabel jLabel = new JLabel("");
        jLabel.setBounds(40,90,200,20);
        jLabel.setVisible(true);
        jFrame.add(jLabel);

        JButton jButton = new JButton("Translate");
        jButton.setBounds(40, 140, 50, 40);
        jFrame.add(jButton);

        jFrame.setVisible(true);
        jFrame.setSize(400,500);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

                ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));


                if(!vowels.contains(jTextField.getText().charAt(0))){
                    String val = jTextField.getText();
                    String actualVal = val.substring(1);
                    String mainVal = actualVal + val.charAt(0) + "ay";

//                    JOptionPane.showMessageDialog(jFrame,mainVal);

                    jLabel.setText(mainVal);
                } else {

                }
            }
        });
    }

    static void WindowMethod() {
        JFrame f = new JFrame();//creating instance of JFrame

        JButton b = new JButton("click me");//creating instance of JButton
        b.setBounds(130, 100, 100, 40);//x axis, y axis, width, height

        f.add(b);//adding button in JFrame

        f.setSize(400, 500);//400 width and 500 height
//        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
    }
}
