package part2;

import part2.app.ControlPanel;
import part2.app.ShowPanel;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private ShowPanel showPanel;
    private ControlPanel controlPanel;

    public MainFrame() {
        setTitle("Image scaler");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        showPanel = new ShowPanel();
        controlPanel = new ControlPanel();

        add(showPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}
