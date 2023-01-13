package JCheckbox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JCheckBox checkBox;
    ImageIcon xicon;
    ImageIcon checkicon;
    MyFrame (){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        xicon = new ImageIcon("C:\\Users\\HP.COM\\IdeaProjects\\How to open a new Window\\src\\JCheckbox\\Redcheck Box.PNG");
        checkicon = new ImageIcon("C:\\Users\\HP.COM\\IdeaProjects\\How to open a new Window\\src\\JCheckbox\\greencheck Box.PNG");

        button = new JButton();
        button.setText(" submit");
        button.addActionListener(this);

         checkBox = new JCheckBox();
        checkBox.setText("i'm not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("new comic", Font.BOLD, 35));
        checkBox.setIcon(xicon);
        checkBox.setSelectedIcon(checkicon);


        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== button){
            System.out.println(checkBox.isSelected());
        }

    }
}
