package Nauka;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

class TestJComponent extends JComponent {

    Image img;

    public TestJComponent() {
        super();
        img = new ImageIcon("files\\obraz.jpg").getImage();
    }

    public void paintComponent(Graphics g) {

        g.setColor(Color.BLACK);  //Kolor tekstu
        g.setFont(new Font("Arial", Font.BOLD, 30)); //Ustawienie czcionki

        g.drawString("Tekst", 5, 25); // gdzie tekst ma sie pojawic

        //OBRAZEK
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(img, 100, 100, 100, 80, this);

        //FIGURY GEOMETRYCZNE
        g2d.setColor(Color.BLUE);
        g2d.draw(new Line2D.Float(0.0f, 10.0f, 220.0f, 200.0f));
        g2d.draw(new Ellipse2D.Float(1.0f, 1.0f, 30.0f, 50.0f));
        g.setColor(Color.CYAN);
        g.fill3DRect(10, 50, 100, 100, true);

        GradientPaint gp = new GradientPaint(5, 5, Color.BLUE, 20, 25, Color.GREEN, true);
        g2d.setPaint(gp);
        g2d.fillOval(30, 30, 50, 40);
    }
}
