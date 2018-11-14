package app;

import Activity.Contains;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class AddPage {
    public JPanel panel1;
    private JTextField nameTextfield;
    private JTextField descTextField;
    private JTextField locationTextField;
    private JTextField openingTextfield;
    private JPanel resultPanel;
    private JButton addButton;
    private JTextArea textArea1;
    private JLabel picLabel;
    private JButton uploadButton;


    public AddPage() {
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //textArea1.setText("Activity Name: " + nameTextfield.getText() + "\nDescription: " + descTextField.getText() + "\nLocation: " + locationTextField.getText() + "\nOpening Hours: " +  openingTextfield.getText());
                Contains.addActivity(nameTextfield.getText(),descTextField.getText(),picLabel.getText() ,locationTextField.getText(),openingTextfield.getText());

            }
        });
        uploadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel img = new JLabel();
//                img.setBounds(100,100,450,300);
                img.setSize(100,100);

                JFileChooser chooser = new JFileChooser();
                chooser.showOpenDialog(null);
                File f = chooser.getSelectedFile();
                String filename = f.getAbsolutePath();

                ImageIcon icon = new ImageIcon(filename);
                Image image = icon.getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH);
                picLabel.setIcon(new ImageIcon(image));
                picLabel.setIcon(icon);
            }
        });
    }
}
