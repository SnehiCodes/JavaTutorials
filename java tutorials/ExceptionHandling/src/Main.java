import java.util.*;

public class Main {

    public static void main(String[] args){
        // Exception = an event that occurs during the execution of a program that,
        //             disrupts the normal flow of instructions.
                     Scanner input = new Scanner (System.in);
        try{


            System.out.println("Enter a whole number to divide:");
            int x = input.nextInt();

            System.out.println("Enter a whole number to divide by:");
            int y = input.nextInt();

            int z = x/y;
            System.out.println("result:" + z);}

        catch(ArithmeticException e){
            System.out.println("You can't divide by zero!");

        }
        catch(InputMismatchException e){
            System.out.println("Please enter a number!");
        }
        catch (Exception e){
            System.out.println("Something went wrong.");
        }
        finally{
            System.out.println("This will always print.");
            // Also used to close the scaner.
            input.close();

        }
    }
}
