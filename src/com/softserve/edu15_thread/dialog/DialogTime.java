package com.softserve.edu15_thread.dialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogTime extends JFrame {
    private static final long serialVersionUID = 1L;
    //
    private JLabel tLabel = new JLabel("     Time:");
    private JTextField tOutput = new JTextField("", 15);
    private JButton buttonTime = new JButton("GetTime");
    private JButton buttonExit = new JButton("Exit");
    private JPanel centerPanel = new JPanel(new GridLayout(2, 2, 5, 5));

    public DialogTime() {
        super("Clock");
        this.setBounds(100, 100, 250, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //
        centerPanel.add(tLabel);
        centerPanel.add(tOutput);
        centerPanel.add(buttonTime);
        centerPanel.add(buttonExit);
        Container container = this.getContentPane();
        container.add(centerPanel, BorderLayout.CENTER);
        //
        buttonTime.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                long ms = System.currentTimeMillis();
                while (System.currentTimeMillis() - ms < 5000) {
                    tOutput.setText(new Long(System.currentTimeMillis()).toString());
                    // System.out.println("Thread ID = " + Thread.currentThread().getId()
                    // + " Time = " + String.valueOf(System.currentTimeMillis()));
                    System.out.println(tOutput.getText());
                }
                tOutput.setText(new Long(System.currentTimeMillis()).toString());
                System.out.println(tOutput.getText());
                System.out.println("buttonTime: Thread ID = " + Thread.currentThread().getId());
            }
        });

        buttonExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                System.exit(0);
            }
        });
    }
}