package Nauka;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;

public class WindowListenerEx extends JFrame implements WindowListener {
    public static void main(String[] args) {
        WindowListenerEx frame = new WindowListenerEx();

        frame.addWindowListener(frame);

        frame.addWindowFocusListener(new WindowFocusListener() {

            //MOZNA IMPLEMENTOWAC W KLASIE, LUB STWORZYC PUSTA KLASE!!

            @Override
            public void windowGainedFocus(WindowEvent e) {
                System.out.println("Window gained focus");
            }

            @Override
            public void windowLostFocus(WindowEvent e) {
                System.out.println("Window lost focus");
            }
        });

        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);



    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window going to close");
        this.dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window minimalized");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window returned");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window deactivated");
    }
}
