/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package to_do_list;

/**
 *
 * @author User
 */
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class Task extends JPanel implements ActionListener{
    
     JLabel index  = new JLabel("None"); 
     JLabel tasks  = new  JLabel();
     JLabel important  = new JLabel();
     JButton done  = new JButton("Done");
     JPanel  contentPanel = new JPanel();
     boolean status; 
     
    public  Task(String task,  String radio) { 
        
        this.setPreferredSize(new Dimension(400, 50));
        this.setMaximumSize(new Dimension(400, 50));
        this.setOpaque(false);
        String text1 = "| "; 
        status =false;
        
        
        //contentPanel 
        contentPanel.setPreferredSize(new Dimension(400, 40)); 
        if(radio.equalsIgnoreCase("high")) { 
            contentPanel.setBackground(new Color(26, 140, 178));
        }else if (radio.equalsIgnoreCase("mid")) { 
             contentPanel.setBackground(new Color(26 ,118, 163));
        }else { 
             contentPanel.setBackground(new Color(37, 102 ,130));
        }
        contentPanel.setLayout(new BorderLayout());
        add(contentPanel, BorderLayout.NORTH);
        
        //index 
        index.setFont(new Font("Serif, SansSerif, Monospaced, Dialog", java.awt.Font.BOLD,15));
        index.setBorder(new  EmptyBorder(0,10,0,10));
        index.setPreferredSize(new Dimension(45,40));
        index.setForeground(Color.white);
        contentPanel.add(index, BorderLayout.WEST);
         
        //TaskPanel 
        JPanel taskPanel =new JPanel(); 
        taskPanel.setLayout(new BorderLayout());
        taskPanel.setOpaque(false);
        contentPanel.add( taskPanel,  BorderLayout.CENTER); 
         
        //task
        tasks.setFont(new java.awt.Font("Serif, SansSerif, Monospaced, Dialog", java.awt.Font.BOLD,15));
        tasks.setText(text1 +task);
        tasks.setPreferredSize(new Dimension(215,40));
        tasks.setForeground(Color.white);
        taskPanel.add(tasks,BorderLayout.WEST);
        
        //Radio 
        important.setFont(new java.awt.Font("Serif, SansSerif, Monospaced, Dialog", java.awt.Font.BOLD,15));
        important.setPreferredSize(new Dimension( 60,40));
        important.setBorder(new EmptyBorder(0,0 ,0,10));
        important.setText(text1+" "+radio);
        important.setForeground(Color.white);
        taskPanel.add(important,BorderLayout.EAST);
        
        //Button 
        done.setFont(new java.awt.Font("Serif, SansSerif, Monospaced, Dialog", java.awt.Font.BOLD,12));
        done.setFocusable(false);
        done.setBackground(new java.awt.Color(52, 52, 52));
        done.setForeground(Color.white);
        done.setBorder(new EmptyBorder(0,0,0,0));
        done.setPreferredSize(new Dimension( 65,40));
        contentPanel.add(done, BorderLayout.EAST);
        done.addActionListener(this);
        
    }
    
     @Override
    public  void  actionPerformed(ActionEvent  e) { 
        contentPanel.setBackground(new  java.awt.Color(98, 163, 136));
        index.setText("<html><strike>" + index.getText() +  "</strike></html>");
        tasks.setText("<html><strike>" + tasks.getText() +  "</strike></html>");
        important.setText("<html><strike>" + important.getText() +  "</strike></html>");
        done.setForeground(Color.green);
        done.setEnabled(false);
        status = true;
    }
    
    public  boolean getStatus () { 
        return status;
    }
}
