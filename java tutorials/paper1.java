import java.util.Scanner;



public class paper1{
    public static void main(String[] args){
        System.out.println("Coconut butter");

        int p= 23;
        double q = 1.787;
        char k='h';
        String name1 ="Snehi";
        System.out.println(name1);
        System.out.println("Hello, " + name1);

        String x ="Water";
        String y = "Coffee";
        String temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println("x is "+ x);
        System.out.println("y is "+ y);

        Scanner snehiScans = new Scanner(System.in);
        System.out.println("What's your name ?");
        String name = snehiScans.nextLine();
        System.out.println("Hello " + name);

        System.out.println("How old are you ?");
        int age = snehiScans.nextInt();
        snehiScans.nextLine();
        System.out.println("You are "+ age+" years old.");
        System.out.println("What's your favourite food.");
        String food = snehiScans.nextLine();
        System.out.println("you like "+food );

        int friends= 6;
        System.out.println(friends-1);
        System.out.println(friends%3);




    }
}