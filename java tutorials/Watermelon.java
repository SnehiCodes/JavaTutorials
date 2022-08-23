import java.util.*;

public class Watermelon{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n= input.nextInt();

        if(n%2 ==0 & n>2){

            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }


    }
}