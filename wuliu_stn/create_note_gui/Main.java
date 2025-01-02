package wuliu_stn.create_note_gui;

import javax.swing.*;
import java.awt.*;

public class Main implements Runnable {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Main());
    }

    public void run() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("I'm a label");
        frame.add(BorderLayout.CENTER, label);

        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}