package Nauka;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondButtonEx extends JFrame {
    public static void main(String[] args) {
        SecondButtonEx frame = new SecondButtonEx();

        JButton button = new JButton("Przycisk1");
        frame.add(button);

        button.setBounds(10,10,100,50);
        button.setFont(new Font("Arial", Font.BOLD, 14));

        button.addActionListener(new ActionListener() {

            //ANONIMOWA KLASA
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("NACISNELES MNIE !");
            }
        });

        /* ========PRZYCIK Z OBRAZKIEM======= */

        JButton button1 = new JButton();
        button1.setBounds(90,90,100,50);
        button1.setIcon(new ImageIcon("files\\obraz.jpg"));
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setEnabled(false);  //BLOKUJE PRZYCISK PO KLIKNIECIU
            }

        });

        frame.add(button1);



        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
