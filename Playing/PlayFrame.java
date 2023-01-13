package Playing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayFrame extends JFrame implements ActionListener {
    JRadioButton GoodToheeb;
    JRadioButton BadToheeb;
    JRadioButton NoneToheeb;
    PlayFrame (){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());




        GoodToheeb = new JRadioButton("Good");
        BadToheeb = new JRadioButton("Bad");
        NoneToheeb = new JRadioButton("None");

        ButtonGroup group = new ButtonGroup();
        group.add(GoodToheeb);
        group.add(BadToheeb);
        group.add(NoneToheeb);

        JButton button = new JButton("Toheeb");
        button.add(GoodToheeb);
        button.add(BadToheeb);
        button.add(NoneToheeb);



        GoodToheeb.addActionListener(this);
        BadToheeb.addActionListener(this);
        NoneToheeb.addActionListener(this);
        group.add(GoodToheeb);
        group.add(BadToheeb);
        group.add(NoneToheeb);





        this.add(GoodToheeb);
        this.add(BadToheeb);
        this.add(NoneToheeb);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== GoodToheeb){
            System.out.println("Toheeb is a good boy");
        }
        if(e.getSource()== BadToheeb){
            System.out.println("Toheeb is a bad boy");
        }
        if(e.getSource()== NoneToheeb){
            System.out.println("i can't say who the guy is");
        }



    }
}
