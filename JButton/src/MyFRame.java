import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;



public class MyFRame extends JFrame {
    JButton button;
    JLabel label;
    MyFRame(){

        ImageIcon icon = new ImageIcon("—Pngtree—pink watercolor brushes_5054156.png");

        button = new JButton();
        label = new JLabel();
        button.setBounds(200,100,250,50);
        button.addActionListener(e->System.out.println("coco"));
        button.setText("I'm a button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Monotype Corsiva",Font.BOLD,25));

        button.setForeground(Color.orange);
        button.setBackground(Color.green);
        button.setBorder(BorderFactory.createEtchedBorder());


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
   }



}
