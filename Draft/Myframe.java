package Draft;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Myframe extends JFrame {


    Myframe() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);

        JButton button = new JButton("text");
        button.setBounds(10, 10, 200, 10);


        this.add(button);
        this.setLayout(null);
        this.setVisible(true);
   button.addMouseMotionListener(new MouseMotionListener() {
       @Override
       public void mouseDragged(MouseEvent e) {
           PointerInfo MousCor = MouseInfo.getPointerInfo();
           Point one = MousCor.getLocation();
           int x = (int) one.getX();
           int y = (int) one.getY();
           button.setLocation(x,y);

       }

       @Override
       public void mouseMoved(MouseEvent e) {

       }
   });



    }
    }
