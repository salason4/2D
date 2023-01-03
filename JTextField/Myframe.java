package JTextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myframe extends JFrame implements ActionListener {

           JButton button;
    JTextField textField;
    Myframe (){                                                     // Constructor
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("submit it");
        button.addActionListener(this);

        textField = new JFormattedTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("consolas", Font.BOLD, 20));
        textField.setForeground(Color.GREEN);
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.white);
        textField.setText("Username ");

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== button){
            System.out.println("welcome " + textField.getText());
            button.setEnabled(false);
            textField.setEditable(false);
        }

    }
}
