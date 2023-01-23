import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args){

        // JLabel = a GUI display area for a string of text, an image , or both

        ImageIcon image = new ImageIcon("\"C:\\Users\\snehi\\Pictures\\snehi.jpg\"");
        Border border = BorderFactory.createLineBorder(Color.RED,3);

        JLabel label = new JLabel();// create a label
        label.setText("Bro, do you even code ?"); // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT,CENTER,RIGHT of screen
        label.setForeground(new Color(234,78,67));// set color for text
        label.setFont(new Font("Monotype Corsiva",Font.BOLD,20));// set font for text
        label.setIconTextGap(25); // set gap of text to image
        label.setBackground(new Color(245,243,178));// set background color
        label.setOpaque(true);

        label.setBorder(border);

        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon & text
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(100,100,250,250); // set x,y position within frame as well as dimensions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(540,500);

        //frame.setLayout(null);

        frame.setVisible(true);

        frame.add(label);

        frame.pack();
    }
}
