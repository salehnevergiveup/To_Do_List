/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package to_do_list;

/**
 *
 * @author User
 */ 
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  javax.swing.*;
import javax.swing.border.EmptyBorder;

public class AppForm extends JFrame {
    
    //ttle / buttons .fields / radio
    JPanel container;
    Title title;
    panelButtonField btnField;
    
    //TaskList 
    TaskList taskList;
    
    //footer
    Footer footer;
    
    //Taskcounter 
    private int taskCounter = 0;
    
    //constractor
   public  AppForm() { 
       this.setSize(400, 600);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setResizable(false);
       this.setLocationRelativeTo(null);
       this.setUndecorated(true);
       
       //title
       container = new  JPanel(); 
       container.setPreferredSize( new Dimension(400, 160));
       container.setBackground(new  java.awt.Color(185, 210, 210));
       title = new Title(); 
       container.add(title,  BorderLayout.NORTH);
       add(container, BorderLayout.NORTH);
       
       //button and the Text filed
       btnField = new panelButtonField(); 
       container.add(btnField,  BorderLayout.SOUTH);
       
       
       //Footer 
       footer = new Footer();
       add(footer, BorderLayout.SOUTH);
       
       //TaskList
       taskList = new TaskList(); 
       JScrollPane scroll = new JScrollPane(taskList); 
       scroll.setPreferredSize(new Dimension(400, 50));
       scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
       scroll.setBorder(new EmptyBorder(0,0,0,0));
       add(scroll);
       
       
       //functions 
       JButton add = btnField.getAdd(); 
       JButton clear = btnField.getClear(); 
       JButton close = footer.getCloseButton();
       JRadioButton high = btnField.getHigh();
       JRadioButton mid = btnField.getMid();
       JRadioButton low = btnField.getLow();
       JTextField textField = btnField.gettextField();
       JFrame x = this;

       
       add.addActionListener(
       new  ActionListener() { 
           @Override
           public  void actionPerformed(ActionEvent e){ 
               if(!textField.getText().isEmpty()){ 
                   taskCounter++; 
                   String radioText = (high.isSelected())? high.getText() : (mid.isSelected())? mid.getText() : low.getText();
                   Task task = new  Task(textField.getText(), radioText);
                   taskList.add(task);
                   taskList.setIndex();
                   textField.setText("");
               }
           }
       }
       );
       
       
       clear.addActionListener(
       new  ActionListener() { 
           @Override
           public  void actionPerformed(ActionEvent e){ 
              
                   for(Component  p : taskList.getComponents()){ 
                       if(p instanceof Task){ 
                           if(((Task) p).getStatus()) { 
                               taskList.remove(p); 
                               taskList.setIndex();
                               taskList.repaint();
                              
                           }
                       }
                   }
               }
           
       });
       
       
       close.addActionListener(
       new ActionListener() { 
           @Override
           public  void actionPerformed(ActionEvent e){ 
               x.dispose();
           }
       }
       );
   }
}
