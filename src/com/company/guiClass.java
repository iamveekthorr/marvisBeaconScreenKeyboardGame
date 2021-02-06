package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class guiClass extends JFrame {

    public guiClass(){
        init();
    }

    String[] alphabets = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
            "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};


    JButton[] button = new JButton[alphabets.length];
    JPanel keyboard, screen, notify, keyOne, keyTwo, keyThree;
    JLabel message, word;



    public void init() {

        for (int i = 0; i < alphabets.length; i++) {
            button[i] = new JButton(alphabets[i]);
        }

        word = new JLabel();
        message = new JLabel("Guess a Country Name");
        notify = new JPanel();
        screen = new JPanel();
        screen.setBackground(Color.white);
        keyboard = new JPanel();
        keyOne = new JPanel();
        keyTwo = new JPanel();
        keyThree = new JPanel();

        keyboard.setBackground(Color.black);
        keyOne.setBackground(Color.black);
        keyTwo.setBackground(Color.black);
        keyThree.setBackground(Color.black);

        attachComponent();

        this.setTitle("Hangman Game");
        this.setVisible(true);
        this.setSize(500, 450);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    private void attachComponent(){
        GridBagConstraints constraints = new GridBagConstraints();
        notify.setLayout(new FlowLayout());
        notify.add(message);
        screen.setLayout(new GridBagLayout());
        screen.add(word, constraints);
        keyboard.setLayout(new GridBagLayout());
        //KeyOne Layout
        keyOne.setLayout(new FlowLayout());
        keyOne.add(button[16]);
        keyOne.add(button[22]);
        keyOne.add(button[4]);
        keyOne.add(button[17]);
        keyOne.add(button[19]);
        keyOne.add(button[20]);
        keyOne.add(button[19]);
        keyOne.add(button[24]);
        keyOne.add(button[21]);
        keyOne.add(button[13]);
        constraints.gridx = 0;
        constraints.gridy= 0;

        keyTwo.setLayout(new FlowLayout());
        keyTwo.add(button[0]);
        keyTwo.add(button[2]);
        keyTwo.add(button[5]);
        constraints.gridx = 1;
        constraints.gridy= 0;
        keyboard.add(keyOne,constraints);
        keyboard.add(keyTwo,constraints);
        keyboard.add(keyThree,constraints);
        setLayout(new BorderLayout());
        this.add(notify, BorderLayout.NORTH);
        this.add(notify, BorderLayout.CENTER);
        this.add(keyboard, BorderLayout.SOUTH);

    }
}
