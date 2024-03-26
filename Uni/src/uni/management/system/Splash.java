package uni.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {
    Splash(){
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/uni.jpg"));
        Image image2 = image1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        JLabel image = new JLabel(image1);
        add(image);


        setSize(1000, 700);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2); //to centralize window
        setVisible(true);


    }

    public static void main(String[] args) {
        new Splash();
    }
}
