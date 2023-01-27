package Animation2D;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image image;
    Image Backgroundimage;
    Timer timer;
    int xVelocity = 2;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    MyPanel() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.BLACK);
        image = new ImageIcon("C:\\Users\\HP.COM\\IdeaProjects\\How to open a new Window\\src\\Animation2D\\Animie.PNG").getImage();

        Backgroundimage = new ImageIcon("C:\\Users\\HP.COM\\IdeaProjects\\How to open a new Window\\src\\Animation2D\\Background.jfif").getImage();
        timer = new Timer(1, this);
        timer.start();
    }
    public  void paint(Graphics g){
        super.paint(g); // background
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(Backgroundimage, 0, 0, null);
        g2d.drawImage(image, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (x >= PANEL_WIDTH-image.getWidth(null) || x<0 ) {
            xVelocity = xVelocity * -1;
        }
        x = x+xVelocity;
        if (y >= PANEL_HEIGHT-image.getHeight(null) || x<0 ) {
            yVelocity = yVelocity * -1;
        }
        y = y+yVelocity;
        repaint();


    }
}
