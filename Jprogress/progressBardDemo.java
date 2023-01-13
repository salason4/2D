package Jprogress;

import javax.swing.*;

import java.awt.*;

import static java.lang.Thread.*;

public class progressBardDemo {
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0, 100);
    progressBardDemo (){
        bar.setValue(0);
        bar.setBounds(0,0, 420,50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Bovi", Font.BOLD, 25));
        bar.setForeground(Color.red);


        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill ();



    }
    public void fill () {
        int counter = 0;
        while (counter <= 100) {
            bar.setValue(counter);
            try {
                sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } counter +=1;
        } bar.setString("Done : ");
    }
}
