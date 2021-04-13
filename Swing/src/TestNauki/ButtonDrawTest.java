package TestNauki;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDrawTest extends JFrame implements ActionListener {
    JButton button;

    public void paint(Graphics g){
        button = new JButton("Przycisk");
        button.addActionListener(this);
        this.add(button);
        button.setFont(new Font("Arial", Font.BOLD, 30));
        g.setColor(Color.BLUE);
        g.drawRect(39,45,49,40);
    }





    public static void main(String[] args) {
        ButtonDrawTest frame = new ButtonDrawTest();

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(button.equals(e.getSource())){

            System.out.println("TEKST");
        }
    }
}
