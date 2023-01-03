import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LunchPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton MyButton = new JButton("New Window");
    LunchPage (){

        MyButton.setBounds(100, 160,200, 40);
        MyButton.setFocusable(false);
        MyButton.addActionListener(this);

        frame.add(MyButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame .setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==MyButton){
            frame.dispose();
            NewWindow newwindow = new NewWindow();
        }

    }
}
