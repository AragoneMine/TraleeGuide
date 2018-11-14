package app;

import Activity.Contains;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FindPage {
    public JPanel PanelFind;
    private JTextField textField1;
    private JButton Okbutton;

    public FindPage(){
        Okbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //textArea1.setText("Activity Name: " + nameTextfield.getText() + "\nDescription: " + descTextField.getText() + "\nLocation: " + locationTextField.getText() + "\nOpening Hours: " +  openingTextfield.getText());
                Contains.findActivity(textField1.getText());
                Contains.showAllActivity();
                //System.out.println(Contains);
            }
        });
    }
}
