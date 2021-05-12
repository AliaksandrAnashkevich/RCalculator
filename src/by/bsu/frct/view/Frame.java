package by.bsu.frct.view;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame() {
        setSize(800, 250);
        Toolkit kit = Toolkit.getDefaultToolkit();
        setLocation((kit.getScreenSize().width - 300 / 2),
                (kit.getScreenSize().height - 300));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Panel panel=new Panel(Frame.this);
        getContentPane().add(panel);
        setVisible(true);
    }

}
