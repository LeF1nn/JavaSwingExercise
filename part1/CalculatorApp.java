package part1;

import part1.app.ButtonPanel;
import part1.app.DisplayPanel;

import javax.swing.*;
import java.awt.*;

public class CalculatorApp extends JFrame {
    public CalculatorApp() {

        setTitle("Graphical Calculator");


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);


        DisplayPanel display = new DisplayPanel();
        ButtonPanel buttons = new ButtonPanel(display);


        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);
        add(buttons, BorderLayout.CENTER);

        setVisible(true);
    }
}
