// Logical Operators

import java.util.Scanner;
public class paper7{
    public static void main(String[] args) {

        int temp = 25;

        if (temp > 30)
        {
            System.out.print("It's hot outside.");
        }
        else if (temp>=20 && temp<=30)
        {
            System.out.println("It's warm.");
        }
        else
        {
            System.out.println("It's cold");
        }
        if (2==4 || 2<4){
            System.out.println("Close escape , buddy");
        }
        if ("rahul" != "meeko")
        {
            System.out.println("Yeah , you're right.");
        }

        Scanner snehiScans= new Scanner(System.in);
        System.out.println("You are playing a game. Press Q or q to quit.");

        String response = snehiScans.next();
        if (response.equals("q") || response.equals("Q"))
        {
            System.out.println("You Quit !");
        }



    }
}