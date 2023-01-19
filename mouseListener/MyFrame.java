package mouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {
    JLabel label;

    MyFrame (){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        this.addMouseListener(this);


        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("you clicked the mouse ");
        label.setBackground(Color.yellow);

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("you pressed the mouse ");
        label.setBackground(Color.yellow);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("you mouse released the mouse ");
        label.setBackground(Color.green);


    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("you mouse entered the component ");
        label.setBackground(Color.blue);


    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("you mouse exited the component ");
        label.setBackground(Color.red);

    }
}
