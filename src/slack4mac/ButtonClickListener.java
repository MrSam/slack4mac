package slack4mac;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonClickListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
       String command = e.getActionCommand();  
       if( command.equals( "Login" ))  {
           System.out.println("Login button pressed");
       }
       
    }     
 }