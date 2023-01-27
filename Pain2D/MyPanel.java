package Pain2D;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    Image image;
    MyPanel(){
        image = new ImageIcon("C:\\Users\\HP.COM\\IdeaProjects\\How to open a new Window\\src\\Pain2D\\WIN_20230117_11_08_33_Pro.jpg").getImage();
        this.setPreferredSize(new Dimension(500, 500));

    }
    public void paint(Graphics g){

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image,0,0,null);

        g2d.setPaint(Color.BLUE);
        //g2d.setStroke(new BasicStroke(5));
       // g2d.drawLine(0,0,500,500);

        //g2d.setPaint(Color.red);
        //g2d.drawRect(0,0,100,200);
       // g2d.fillRect(0,0,100,200);

        //g2d.drawOval(0,0,100,100);
       // g2d.setPaint(Color.YELLOW);
        //g2d.fillOval(0,0,100,100);  // circle

        g2d.setPaint(Color.red);
       g2d.drawArc(0,0,100,100,0,180);
        g2d.fillArc(0,0,100,100,0,180);
        g2d.setPaint(Color.white);
        g2d.fillArc(0,0,100,100,180,180); //Arc

        g2d.setPaint(Color.orange);
        int[] xpoints = {150,250,350};
        int[] ypoints = {300, 150, 300};
        //g2d.drawPolygon(xpoints, ypoints, 3); // triangle
        g2d.fillPolygon(xpoints, ypoints, 3);

        //g2d.setPaint(Color.magenta);
        //g2d.setFont(new Font("ink free", Font.BOLD,50));
        //g2d.drawString("You are a winner", 100, 100);

    }

}
