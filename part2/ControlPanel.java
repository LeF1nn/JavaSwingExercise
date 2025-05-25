package part2;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlPanel extends JPanel {
    private JTextField widthField, heightField; // Input fields for width and height
    private JButton scaleButton; // Button to trigger the scaling action
    private ShowPanel showPanel; // Reference to the ShowPanel

    public ControlPanel(ShowPanel showPanel) {
        this.showPanel = showPanel; // Set the reference to the ShowPanel
        setLayout(new FlowLayout()); // Use FlowLayout for arranging components
        setBackground(new Color(240, 240, 240)); // Set background color for the panel
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Add padding around the panel


        widthField = new JTextField(5);
        heightField = new JTextField(5);
        scaleButton = new JButton("Scale Image");

        // Add components to the panel
        add(new JLabel("Width:"));
        add(widthField);
        add(new JLabel("Height:"));
        add(heightField);
        add(scaleButton);

        scaleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int width = Integer.parseInt(widthField.getText());
                    int height = Integer.parseInt(heightField.getText());

                    int maxWidth = showPanel.getWidth();
                    int maxHeight = showPanel.getHeight();

                    if (width > maxWidth || height > maxHeight) {
                        JOptionPane.showMessageDialog(null, "Entered size cannot be larger than the panel size!");
                    } else {
                        showPanel.loadImage();
                        showPanel.scaleImage(width, height);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter valid numbers for width and height"); // Show error message
                }
            }
        });
    }
}