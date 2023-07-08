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
import javax.swing.border.*; 

public class panelButtonField extends JPanel{
    
    JTextField textField = new JTextField(); 
    JButton add = new  JButton("Add");
    JButton clear = new  JButton("Clear");
    JRadioButton  high  = new  JRadioButton("High");
    JRadioButton  mid  = new  JRadioButton("Mid");
    JRadioButton  low  = new  JRadioButton("Low", true);
    ButtonGroup   group = new  ButtonGroup();
    
    public panelButtonField() { 
        
        this.setPreferredSize(new Dimension(400, 110));
        this.setBackground(new Color(5, 94, 104));
        
        //TextField 
        textField.setPreferredSize(new Dimension(350 , 30));
        textField.setBorder(new EmptyBorder(0,0,0,0));
        textField.setFont(new Font("Serif, SansSerif, Monospaced, Dialog", java.awt.Font.BOLD,15));
        add(textField, BorderLayout.NORTH);
        
        //Buttons + Buttons Panel
        add.setPreferredSize(new Dimension(100, 25));
        add.setFont(new Font("Serif, SansSerif, Monospaced, Dialog", java.awt.Font.BOLD,15));
        add.setFocusable(false);
        add.setBackground(new Color(52, 52, 52));
        add.setBorder(new EmptyBorder(0,0,0,0));
        add.setForeground(Color.white);
        
        clear.setPreferredSize(new Dimension(100, 25));
        clear.setFont(new Font("Serif, SansSerif, Monospaced, Dialog", java.awt.Font.BOLD,15));
        clear.setFocusable(false); 
        clear.setBackground(new Color(52, 52, 52));
        clear.setBorder(new EmptyBorder(0,0,0,0));
        clear.setForeground(Color.white);
        
        JPanel  ButtonCon = new  JPanel(); 
        ButtonCon.setBackground(new java.awt.Color(5, 94, 104));
        ButtonCon.setPreferredSize(new Dimension(400, 30));
         
        ButtonCon.add(add);
        ButtonCon.add(clear);
        add(ButtonCon);
      
        //Radio buttons
        high.setFocusable(false);
        mid.setFocusable(false);
        low.setFocusable(false);
        high.setBackground(new Color(5, 94, 104));
        mid.setBackground(new Color(5, 94, 104));
        low.setBackground(new Color(5, 94, 104));
        high.setForeground(Color.white);
        mid.setForeground(Color.white);
        low.setForeground(Color.white);
        group.add(high);
        group.add(mid);
        group.add(low);
        add(high);
        add(mid);
        add(low);
      
    }
    
    public JButton getAdd() { 
        return add; 
    }
    
    public JButton getClear(){ 
        return clear;
    }
    
    public JTextField gettextField() { 
        return textField;
    }
    
    public JRadioButton getHigh() { 
        return high;
    }
    public JRadioButton getMid() { 
        return mid;
    }
    public JRadioButton getLow() { 
        return low;
    }
}
