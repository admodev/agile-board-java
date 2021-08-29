/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agileboard;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.TransferHandler;
import java.awt.Color;

/**
 *
 * @author adolf
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Agile Board");

        // Create panel containers
        JPanel todo = new JPanel();
        todo.setBounds(40, 80, 200, 200);
        todo.setBackground(Color.gray);

        // Components
        JLabel to_do = new JLabel("To Do");
        to_do.setBounds(50, 50, 100, 30);

        todo.add(to_do);

        // Add components to frame
        frame.add(todo);

        // Configuration for frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(1280, 720);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(180, 196, 174));
        ImageIcon icon = new ImageIcon("image/mente.png");
        frame.setIconImage(icon.getImage());
    }

}
