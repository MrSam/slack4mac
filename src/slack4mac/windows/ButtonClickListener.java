package slack4mac.windows;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import slack4mac.LoginScreen;
import slack4mac.slack.SlackAPI;

public class ButtonClickListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
       String command = e.getActionCommand();  
       if( command.equals( "Connect" ))  {
           System.out.println("Connect button pressed");
           SlackAPI.authTest(LoginScreen.txtToken.getText());
       }
       
    }     
 }