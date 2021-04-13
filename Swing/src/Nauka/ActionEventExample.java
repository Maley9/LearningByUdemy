package Nauka;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventExample extends JFrame implements ActionListener {

    JButton button1;
    JButton button2;
    JButton button3;

    public void initUI(){

        this.setLayout(new GridLayout());

        button1 = new JButton("Click me");
        button1.addActionListener(this);
        this.add(button1);


        button2 = new JButton("Click me 2");
        button2.addActionListener(this);
        this.add(button2);

        button3 = new JButton("Click me 3");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 3");
            }
        });
        this.add(button3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(button1.equals(e.getSource())){
            System.out.println("First button");
        }else if(button2.equals(e.getSource())){
            System.out.println("Second button");
        }
    }

    public static void main(String[] args) {

        ActionEventExample frame = new ActionEventExample();

        frame.initUI();

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
