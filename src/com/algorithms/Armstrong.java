package com.algorithms;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Armstrong implements KeyListener, ActionListener {
    Frame f;
    Button five;
    Label one, two;
    TextField four, three;
    String s1 = "";
    int i = 0, t = 0, k = 0, l = 0, m = 0;

    public Armstrong() {
        f = new Frame("Armstrong-Hange");
        five = new Button("Click here to see Result");
        one = new Label("Enter the number to be checked  :");
        two = new Label(" Result  ");
        three = new TextField(5);
        four = new TextField(10);
        f.setLayout(null);
        f.add(one);
        f.add(two);
        f.add(three);
        f.add(four);
        f.add(five);
        f.setVisible(true);
        f.setSize(400, 400);
        one.setBounds(20, 20, 220, 40);
        two.setBounds(150, 230, 120, 40);
        three.setBounds(250, 35, 80, 40);
        four.setBounds(150, 280, 80, 40);
        five.setBounds(100, 100, 200, 60);
        three.addKeyListener(this);
        five.addActionListener(this);
    }

    public void keyPressed(KeyEvent k) {
        System.out.print("");
    }

    public void keyTyped(KeyEvent k) {
        s1 = s1 + k.getKeyChar();
    }

    public void keyReleased(KeyEvent k) {
        System.out.print("");
    }

    public void actionPerformed(ActionEvent ae) {
        k = Integer.parseInt(s1);
        t = k;
        while (k != 0) {
            l = k % 10;
            k = k / 10;
            m = m + (l * l * l);
        }
        System.out.print(t + " " + m + "      ");
        if (t == m)
            four.setText("true");
        else
            four.setText("false");
    }


    public static void main(String args[]) {
        new Armstrong();
    }

}