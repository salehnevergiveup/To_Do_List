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
import javax.swing.border.EmptyBorder;
public class Footer extends JPanel {
    
    JButton close = new  JButton("Close"); 
    
    public Footer() { 
        
        this.setPreferredSize(new Dimension(400, 35));
        this.add(close);
        this.setBackground(new Color(185, 210, 210));
        
        //Close Button
        close.setForeground(Color.white);
        close.setFocusable(false);
        close.setPreferredSize(new Dimension(100, 25));
        close.setBackground(new Color(52, 52, 52));
        close.setBorder(new EmptyBorder(0,0,0,0));
        close.setFont(new Font("Serif, SansSerif, Monospaced, Dialog", java.awt.Font.BOLD,15));

    }
    
    public JButton getCloseButton() { 
        return close;
    }
}
