package JoptionPane;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //JOptionPane.showMessageDialog(null, "this is some usefull info", "Title", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "this is some usefull info", "Title", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "really ?", "Title", JOptionPane.QUESTION_MESSAGE);
       //JOptionPane.showMessageDialog(null, "Your Computer has a virus!!!", "Title", JOptionPane.WARNING_MESSAGE);
       // JOptionPane.showMessageDialog(null, "Call tech Support now", "Title", JOptionPane.ERROR_MESSAGE);

        //System.out.println(JOptionPane.showConfirmDialog(null, "this is some usefull info", "Title", JOptionPane.YES_NO_CANCEL_OPTION));
        //String name = JOptionPane.showInputDialog("what is your name");
        //System.out.println(" Hello " + name );

        String [] response = {"no, you'er awesome", "thank you", "blush"};
        ImageIcon icon = new ImageIcon("C:\\Users\\HP.COM\\IdeaProjects\\Engr_horshy\\src\\File\\download.jpeg");
        JOptionPane.showOptionDialog(null, "you'er Beautiful", "secret message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, response, 0);

    }
}
