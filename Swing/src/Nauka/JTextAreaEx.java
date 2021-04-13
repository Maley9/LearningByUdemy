package Nauka;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class JTextAreaEx extends JFrame {
    public static void main(String[] args) {
        JTextAreaEx frame = new JTextAreaEx();

        JTextArea t = new JTextArea(3,14);
        JScrollPane p = new JScrollPane(t);

        t.append("Tekst dodawany jest na koniec ");
        t.insert("Tekst z utaleniem pozycji ", 0);
        t.setLineWrap(true);   // USTAWIA TEKST JEZELI JEST ZA DLUGI

        t.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                System.out.println("InsertUpdate " + t.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                System.out.println("Info o usuwaniu " + t.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                System.out.println("change Update " + t.getText());
            }
        });

        frame.add(p);

        frame.setLayout(new FlowLayout());
        frame.setSize(200,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }
}
