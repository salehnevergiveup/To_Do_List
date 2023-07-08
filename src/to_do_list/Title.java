/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package to_do_list;

/**
 *
 * @author User
 */

import java.awt.*;
import javax.swing.*;


public class Title extends JPanel{
    
    JLabel  label  = new  JLabel("TO DO LIST");
    
    public   Title() { 
        
        this.setPreferredSize(new Dimension(400, 40));
        this.setOpaque(false);
        
        //label
        label.setFont(new java.awt.Font("Serif, SansSerif, Monospaced, Dialog", java.awt.Font.BOLD,20));
        label.setForeground(new Color(52, 52, 52));
        add(label);
        
    }
}
