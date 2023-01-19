package DragandDrop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {
    ImageIcon image = new ImageIcon("C:\\Users\\HP.COM\\IdeaProjects\\How to open a new Window\\src\\DragandDrop\\Dizzy Emoji.PNG");
    final  int WIDTH = image.getIconWidth();
    final int HEIGHT = image.getIconHeight();
    Point imagecorner;
     Point prevpt;
    DragPanel() {
        imagecorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);


    }
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        image.paintIcon(this, g, (int)imagecorner.getX(),(int)imagecorner.getY());

    }
    private  class ClickListener extends MouseAdapter {
        public void MousePressed (MouseEvent e){
            prevpt = e.getPoint();
        }

    }
    private class DragListener extends MouseMotionAdapter {
        public void mouseDragged (MouseEvent e){
            Point currentpt = e.getPoint();
            imagecorner.translate( (int) (currentpt.getX() - prevpt.getX()),
                    (int) (currentpt.getY() - prevpt.getY()));
            prevpt = currentpt;
            repaint();

        }

    }
}
