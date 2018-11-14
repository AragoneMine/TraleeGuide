package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage {
    private JButton addbutton;
    private JButton findButton;
    private JPanel PanelMain;


    public static void main(String[] args){
        JFrame frame = new JFrame("Global view");
        frame.setContentPane(new MainPage().PanelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600,300);
    }

    public MainPage(){
        addbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame addact = new JFrame("Add an Activity");
                addact.setContentPane(new AddPage().panel1);
                addact.pack();
                addact.setVisible(true);
                addact.setSize(900,600);
            }
        });

        findButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame findact = new JFrame("Find an Activity");
                findact.setContentPane(new FindPage().PanelFind);
                findact.pack();
                findact.setVisible(true);
                findact.setSize(300,150);
            }
        });
    }

    /*
    public static void main(String[] args) {
        Contains contains = new Contains();
        JFrame frame = new JFrame("Add an Activity");
        frame.setContentPane(new AddPage().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(900,600);
    }*/
}
