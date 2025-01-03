package wuliu_stn.create_note_gui;

import javax.swing.*;
import java.awt.*;

import wuliu_stn.util.MyUtil;
import wuliu_stn.util.ScrollArea;

public class Main implements Runnable {

    public static void main(String[] args) {
        check();
        SwingUtilities.invokeLater(new Main());
    }

    static void check() {
        MyUtil.checkProjectExists();
    }

    public void run() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        JLabel labelTitle = new JLabel("Wuliu Simple Text Note");
        mainPanel.add(labelTitle);

        ScrollArea scrollArea = new ScrollArea();
        mainPanel.add(scrollArea.scrollPane());

//        JLabel labelNorth = new JLabel("  Wuliu Simple Text Note");
//        frame.add(BorderLayout.NORTH, labelNorth);
//        JLabel labelWest = new JLabel("  ");
//        frame.add(BorderLayout.WEST, labelWest);
//        JLabel labelEast = new JLabel("  ");
//        frame.add(BorderLayout.EAST, labelEast);

        JLabel spacer = new JLabel(" ".repeat(150));
        mainPanel.add(spacer);
        JButton okButton = new JButton("ENTER");
        mainPanel.add(okButton);

        frame.add(BorderLayout.CENTER, mainPanel);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
