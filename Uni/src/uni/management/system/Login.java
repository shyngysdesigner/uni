package uni.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Login extends JFrame  {

    JTextField tfusername, tfpassword;
    JButton login, cancel;
    Login (){

        getContentPane().setBackground(new Color(255, 255, 255));
        setLayout(null);

        JLabel lbusername = new JLabel("Username");
        lbusername.setBounds(40, 20, 100, 20);
        add(lbusername);

        tfusername = new JTextField();
        tfusername.setBounds(150, 20, 150, 20);
        add(tfusername);

        JLabel lbpassword = new JLabel("Password");
        lbpassword.setBounds(40, 70, 100, 20);
        add(lbusername);

        tfpassword = new JPasswordField();
        tfpassword.setBounds(150, 70, 100, 20);
        add(tfusername);

        login = new JButton("Login");
        login.setBounds(40, 140, 120, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        //login.addActionListener(this);
        login.setFont(new Font("Inter", Font.BOLD, 15));
        add(login);

        cancel = new JButton("Cancel");
        cancel.setBounds(180, 140, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        //cancel.addActionListener(this);
        cancel.setFont(new Font("Inter", Font.BOLD, 15));
        add(cancel);







        setSize(600, 600);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setVisible(true);

    }
    public void actionPerfomed(ActionEvent ae){
        if(ae.getSource() = login )
    }
    public static void main(String[] args) {
        new Login();
    }
}
