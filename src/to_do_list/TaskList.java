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

public class TaskList extends JPanel{
    
    public TaskList() { 
    this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    this.setBackground(new Color(5, 94, 104));
    
    }
    
    
    //Setting the Index
    public void setIndex(){ 
        int counter =0;
        for(Component com : this.getComponents()){ 
            if(com instanceof JPanel){ 
              ((JLabel)((JPanel)((JPanel) com).getComponent(0)).getComponent(0)).setText( " "+(++counter));
            }
        }
    }
    
}
