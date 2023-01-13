package JRadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JRadioButton pizzabutton;
    JRadioButton hamburgerbutton;
    JRadioButton hotdogbutton;

    ImageIcon pizzaicon;
    ImageIcon hamburgericon;
    ImageIcon hotdogicon;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setFocusable(false);

        pizzaicon = new ImageIcon("C:\\Users\\HP.COM\\IdeaProjects\\How to open a new Window\\src\\JRadioButton\\pizza.PNG");
        hamburgericon = new ImageIcon("C:\\Users\\HP.COM\\IdeaProjects\\How to open a new Window\\src\\JRadioButton\\hamburger.PNG");
        hotdogicon = new ImageIcon("C:\\Users\\HP.COM\\IdeaProjects\\How to open a new Window\\src\\JRadioButton\\hotdog.PNG");

        pizzabutton = new JRadioButton("pizzabutton");
        hamburgerbutton = new JRadioButton("hamburgerbutton");
        hotdogbutton = new JRadioButton("hotdogbutton");

        ButtonGroup group = new ButtonGroup();
        group.add(pizzabutton);
        group.add(hamburgerbutton);
        group.add(hotdogbutton);

        pizzabutton.addActionListener(this);
        hamburgerbutton.addActionListener(this);
        hotdogbutton.addActionListener(this);

        pizzabutton.setIcon(pizzaicon);
        hamburgerbutton.setIcon(hamburgericon);
        hotdogbutton.setIcon(hotdogicon);

        this.add(pizzabutton);
        this.add(hamburgerbutton);
        this.add(hotdogbutton);
        this.pack();
        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzabutton) {
            System.out.println("you ordered pizza");

        } else if (e.getSource() == hamburgerbutton) {
            System.out.println("you ordered hamburger");
        }
        else if (e.getSource() == hotdogbutton) {
            System.out.println("you ordered hotdog");

        }
    }
}
