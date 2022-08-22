import javax.swing.JOptionPane;

public class paper2{
    public static void main (String[] args){
        String name = JOptionPane.showInputDialog("What's your name ?");
        JOptionPane.showMessageDialog(null,"Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("What\'s your age ?"));
        JOptionPane.showInputDialog(null, "You are "+ age+" years old "+ name);

        double height= Double.parseDouble(JOptionPane.showInputDialog("How long are you ?"));
        JOptionPane.showInputDialog(null,"You are "+height +" cms long.");










    }
}