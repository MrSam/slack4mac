package slack4mac;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import slack4mac.windows.ButtonClickListener;

public class LoginScreen {

    private JFrame frame;
    private JLabel lblLogin,lblPassword;
    private JTextField txtLogin;
    private JPasswordField txtPassword;
    private JButton btnSubmit;
    private JPanel p1,p2;
    private GridLayout gl42,gl21;
    private FlowLayout fl;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LoginScreen window = new LoginScreen();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public LoginScreen() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        
        lblLogin=new JLabel("Login :");
        lblPassword=new JLabel("Password :");

        txtLogin=new JTextField(40);
        txtPassword=new JPasswordField(40);

        btnSubmit=new JButton("Login");
        btnSubmit.addActionListener(new ButtonClickListener()); 

        p1=new JPanel();
        p2=new JPanel();

        gl42=new GridLayout(4,2);
        gl21=new GridLayout(2,1);
        fl=new FlowLayout();

        p1.setLayout(gl42);
        p1.add(lblLogin);
        p1.add(txtLogin);
        p1.add(lblPassword);
        p1.add(txtPassword);

        p2.setLayout(fl);
        p2.add(btnSubmit);

        frame.setLayout(gl21);
        frame.add(p1);
        frame.add(p2);
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
