/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agileboard;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
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

        // Configuration por frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(1280, 720);
        frame.setResizable(false);

        // Frame background color
        frame.getContentPane().setBackground(new Color(180, 196, 174));

        // Frame icon
        ImageIcon icon = new ImageIcon("image/mente.png");
        frame.setIconImage(icon.getImage());
    }

}
