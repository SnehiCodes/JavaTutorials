import javax.swing.JFrame;
import java.awt.*;

public class MyFrame extends JFrame{

    MyFrame(){
        this.setTitle("JFrame title goes there");// sets title of frame

        //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setResizable(false);

        this.setSize(420,470);// sets the x-direction, and y-dimension of frame

        this.setVisible(true); // make frame visible

        //ImageIcon image = new ImageIcon("\"C:\\Users\\snehi\\Pictures\\snehi.jpg\""); // create an image icon
        //frame.setIconImage(image.getImage()); // chane icon of frame

        //frame.getContentPane().setBackground(Color.ORANGE);
        this.getContentPane().setBackground(new Color(234,67,90));
    }
    }


