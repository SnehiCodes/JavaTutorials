// Arrays

public class paper11{
    public static void main(String[] args) {

        String[] iceCream = {"vanilla","butterscotch","strawberry","milk","chocolate","pumpkin"};

        System.out.println(iceCream[3]);
        iceCream[3] = "pista";
        System.out.println(iceCream[3]);

        // Another way to form an array
        String[] cars = new String[4];

        cars[0] ="tesla";
        cars[1]="BMW";
        cars[2]="Suzuki";
        cars[3]="chev";

        //System.out.println( String(cars));
        //This will print all the cars.
        //Okay , you can't print them this way.

        System.out.println(cars[2]);
        // This will print cars at index no. 2.

        for(int i=0;i<=cars.length-1;i++ )
        {
            System.out.println(cars[i]);
            System.out.println("\n");
        }


    }
}