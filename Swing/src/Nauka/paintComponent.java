package Nauka;
import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class paintComponent extends JFrame implements WindowListener {
    public static void main(String[] args) {
        paintComponent frame = new paintComponent();

        TestJComponent test = new TestJComponent();
        frame.add(test);



        frame.setSize(200,200); //Wielkosc okienka
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Zamykanie okienka
        frame.setVisible(true); // pokazuje okienko!
        frame.setLocationRelativeTo(null); // wycentrowanie

    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Okno otwarte");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Okno zamykane");
        this.dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Okno zamkniete");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Okno zminimalizowane");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Okno powrocone");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Okno aktywowane");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Okno deaktywowane");
    }
}
