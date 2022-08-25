import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){

        // JPanel = a GUI component that functions as a container to hold other components

        JLabel label = new JLabel();
        label.setText("HI !");

        JPanel cyanpanel = new JPanel();
        cyanpanel.setBackground(Color.black);
        cyanpanel.setBounds(0,0,250,250);

        JPanel pinkpanel = new JPanel();
        cyanpanel.setBackground(Color.pink);
        cyanpanel.setBounds(250,0,250,250);

        JPanel greenpanel = new JPanel();
        cyanpanel.setBackground(Color.green);
        cyanpanel.setBounds(0,250,500,250);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        frame.add(cyanpanel);
        frame.add(pinkpanel);
        greenpanel.add(label);
        frame.add(greenpanel);

    }
}
