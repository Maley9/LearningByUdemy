package Nauka.CheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyIcon implements Icon {

    Color color;
    String text;

    public MyIcon(Color color, String text) {
        this.color = color;
        this.text = text;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.setColor(color);
        g.drawString(text,10,10);
    }

    @Override
    public int getIconWidth() {
        return 32;
    }

    @Override
    public int getIconHeight() {
        return 32;
    }
}

public class CheckBoxEx extends JFrame {


    public static void main(String[] args) {
        CheckBoxEx frame = new CheckBoxEx();

        JCheckBox box = new JCheckBox("Opcja 1");

        box.setSelected(true);
        box.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                switch (e.getStateChange()){
                    case ItemEvent.SELECTED:
                        System.out.println("check1 selected ");
                        break;
                    case ItemEvent.DESELECTED:
                        System.out.println("check1 deselected");
                        break;
                }
            }
        });

        box.setBounds(10,10,100,50);
        frame.add(box);

        //MYICON //

        MyIcon normal = new MyIcon(Color.BLACK,"normal");
        MyIcon rollover = new MyIcon(Color.RED, "rollover");
        MyIcon selected = new MyIcon(Color.GREEN, "selected");
        JCheckBox boxIcon = new JCheckBox(normal);

        boxIcon.setRolloverIcon(rollover);
        boxIcon.setSelectedIcon(selected);


        boxIcon.setBounds(50,50,60,100);
        frame.add(boxIcon);




        frame.setLayout(null);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
