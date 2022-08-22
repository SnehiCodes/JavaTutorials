// Random

import java.util.Random;

public class paper4{
    public static void main( String[] args){

        Random r = new Random();
        int y = r.nextInt();
        double x= r.nextDouble(6)+1;

        double p= r.nextInt();
        //We can store int into double but not vice-versa.
        //int z= r.nextDouble(6);

        boolean q= r.nextBoolean();

        System.out.println(x);
        System.out.println(y);
        System.out.println(p);
        System.out.println(q);



    }
}
