package Nauka;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JLabelEx extends JFrame {
    public static void main(String[] args) {
        JLabelEx frame = new JLabelEx();

        JLabel jLabel = new JLabel();
        jLabel.setText("<html><u>TEKST</u></html>");
        jLabel.setBounds(10,10,40,40);
        jLabel.setForeground(Color.WHITE); // KOLOR TEKSTU
        jLabel.setBackground(Color.DARK_GRAY);  //KOLOR TLA
        jLabel.setOpaque(true); // KONIECZNE JEZELI CHCEMY ZMIENIAC KOLORY
        jLabel.setHorizontalAlignment(JLabel.CENTER);

        Border border = BorderFactory.createLineBorder(Color.BLUE,3);
        jLabel.setBorder(border);

        frame.add(jLabel);

        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setLayout(null);

    }
}
