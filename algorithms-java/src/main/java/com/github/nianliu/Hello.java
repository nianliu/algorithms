package com.github.nianliu;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Hello {

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent component = new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                g.drawLine(20, 20, 100, 100);
                g.drawOval(50,50, 3,3 );
            }
        };

        frame.add(component);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
