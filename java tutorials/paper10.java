// Nested loop

import java.util.Scanner;
public class paper10{
    public static void main(String[] args){

        Scanner cocoScans = new Scanner(System.in);

        int rows, columns;
        String symbol;

        System.out.println("Enter the number of rows.");
        rows = cocoScans.nextInt();

        System.out.println("Enter the number of columns.");
        columns = cocoScans.nextInt();

        System.out.println("Enter symbol to use.");
        symbol = cocoScans.next();

        for(int i=1;i<= rows;i++)
        {
            System.out.println();
            for(int j=1;j<=columns;j++){
                System.out.print(symbol);
            }
        }








    }
}