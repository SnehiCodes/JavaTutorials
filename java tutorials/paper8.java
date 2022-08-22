// While Loop
import java.util.Scanner;

public class paper8 {
    public static void main(String [] args){

        Scanner snehiScans = new Scanner(System.in);

        String name = "";

// Here , we can also isEmpty .
        // But there is a small difference ...
        // isBlank-doesn't considers spaces
        // isEmpty-considers spaces.

        while(name.isBlank())
        {
            System.out.println("Enter your name.");
            name = snehiScans.nextLine();
        }
        System.out.println("Hello " + name);


        String age;

        do
        {
            System.out.println("What's your age ?");
            age = snehiScans.nextLine();
        }
        while(age.isBlank());
        {
            System.out.println("Hello "+ name + " please type your age.");
        }
    }
}