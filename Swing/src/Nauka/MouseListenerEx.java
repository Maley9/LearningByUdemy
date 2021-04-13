package Nauka;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseListenerEx extends JFrame implements MouseListener {
    public static void main(String[] args) {
        MouseListenerEx frame = new MouseListenerEx();

        frame.addMouseListener(frame);

        frame.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("Mouse drag");
            }

            @Override
            public void mouseMoved(MouseEvent e) {

                //   System.out.println("Mouse moved " + e.getX());
            }
        });

        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Click count " + e.getClickCount());

        String str = "Button clicked ";
        switch (e.getButton()) {
            case MouseEvent.BUTTON1:
                str = " button1";
                break;

            case MouseEvent.BUTTON2:
                str = " button2";
                break;

            case MouseEvent.BUTTON3:
                str = " button3";
                break;
        }

        System.out.println(str);
    }

    @Override
    public void mousePressed(MouseEvent e) {
       // System.out.println("Mouse pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       // System.out.println("Mouse released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered app");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exit from app");
    }
}
