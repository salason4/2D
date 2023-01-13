package MenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu FileMenu;
    JMenu EditMenu;
    JMenu HelpMenu;
    JMenuItem FileMenuItem;
    JMenuItem EditMenuItem;
    JMenuItem HelpMenuItem;
    ImageIcon loadicon;
    ImageIcon saveicon;
    ImageIcon existicon;
    MyFrame () {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        loadicon = new ImageIcon("C:\\Users\\HP.COM\\IdeaProjects\\How to open a new Window\\src\\JRadioButton\\hamburger.PNG");
        saveicon = new ImageIcon("C:\\Users\\HP.COM\\IdeaProjects\\How to open a new Window\\src\\JRadioButton\\hotdog.PNG");
        existicon = new ImageIcon("C:\\Users\\HP.COM\\IdeaProjects\\How to open a new Window\\src\\JRadioButton\\pizza.PNG");

        JMenuBar menuBar = new JMenuBar();

        FileMenu = new JMenu("File");
        EditMenu = new JMenu("Edit");
        HelpMenu =new JMenu("Help");

        FileMenuItem = new JMenuItem("load");
        EditMenuItem = new JMenuItem("save");
        HelpMenuItem = new JMenuItem("exist");

        FileMenu.add(FileMenuItem);
        FileMenu.add(EditMenuItem);
        FileMenu.add(HelpMenuItem);

        FileMenu.setMnemonic(KeyEvent.VK_F); // f +Alt for file
        EditMenu.setMnemonic(KeyEvent.VK_E); // e +Alt Edit
        HelpMenu.setMnemonic(KeyEvent.VK_H); // h +Alt Help
        FileMenuItem.setMnemonic(KeyEvent.VK_L); // l for load item
        EditMenuItem.setMnemonic(KeyEvent.VK_S); // s for save item
        HelpMenuItem.setMnemonic(KeyEvent.VK_E);  // e for end item

        FileMenuItem.setIcon(loadicon);
        EditMenuItem.setIcon(saveicon);
        HelpMenuItem.setIcon(existicon);


        FileMenuItem.addActionListener(this);
        EditMenuItem.addActionListener(this);
        HelpMenuItem.addActionListener(this);


        menuBar.add(FileMenu);
        menuBar.add(EditMenu);
        menuBar.add(HelpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==FileMenuItem) {
            System.out.println("'beep boop' you load a file");
        } if (e.getSource()==EditMenuItem) {
            System.out.println("'beep boop' you save a file");
        } if (e.getSource()==HelpMenuItem) {
            System.exit(0);
        }

    }
}
