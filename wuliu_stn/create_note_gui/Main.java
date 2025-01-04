package wuliu_stn.create_note_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import wuliu_stn.util.MyUtil;
import wuliu_stn.util.ScrollArea;

public class Main implements Runnable {
    private ScrollArea scrollArea;

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

        scrollArea = new ScrollArea();
        mainPanel.add(scrollArea.scrollPane());

        JLabel spacer = new JLabel(" ".repeat(150));
        mainPanel.add(spacer);
        JButton okButton = new JButton("OK");
        okButton.addActionListener(new OkButtonListener());
        mainPanel.add(okButton);

        frame.add(BorderLayout.CENTER, mainPanel);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null); // 窗口居中
        frame.setVisible(true);
    }

    class OkButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String text = scrollArea.textArea().getText().trim();
            try {
                MyUtil.createNoteToday(text);
            } catch (IOException ex) {
                System.err.println("ERROR! ERROR!");
                throw new RuntimeException(ex);
            }
            System.exit(0);
        }
    }
}
