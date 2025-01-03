package wuliu_stn.util;

import javax.swing.*;
import java.awt.*;

public record ScrollArea(JTextArea textArea, JScrollPane scrollPane) {
    public ScrollArea {
        if (textArea == null && scrollPane == null) {
            Font font = new Font("sanserif", Font.BOLD, 20);
            textArea = new JTextArea(10, 26);
            textArea.setFont(font);
            scrollPane = new JScrollPane(textArea);
        }
    }
    public ScrollArea() {
        this(null, null);
    }
}
