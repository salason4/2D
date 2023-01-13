package SelectClour;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    MyFrame(){


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Select a colour");
        button.addActionListener(this);

        label = new JLabel();
        label.setText("this some text D: ");
        label.setBackground(Color.white);
        label.setOpaque(true);
        label.setFont(new Font("MV Boli", Font.BOLD,75));



        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JColorChooser jColorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null, "Pick a color i guess", Color.BLACK);

            //label.setForeground(color);
            label.setBackground(color);
        }

    }
}
