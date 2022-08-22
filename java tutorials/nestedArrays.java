// 2D Arrays

public class nestedArrays{
    public static void main(String[] args){

        String[][] friends =new String[3][3];

        friends[0][0]= "David";
        friends[0][1]="Snehi";
        friends[0][2]="Diego";
        friends[1][0]="Brian";
        friends[1][1]="Corton";
        friends[1][2]="Tom";
        friends[2][0]="Suneo";
        friends[2][1]="Phil";
        friends[2][2]="Max";

        for(int i=0;i<=friends.length-1;i++)
        {
            for(int j=0;j<=friends.length-1;j++){
                System.out.println(friends[i][j]);
            }
        }
        // This will print the array elements one-by-one in a line.

        //To print the array in matrix form , we'll do this.
        // Remove the ln from println and add one " " instead.
        for(int i=0;i<=friends.length-1;i++)
        {
            for(int j=0;j<= friends.length-1;j++)
            {
                System.out.print(friends[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

        //Easier way to do this.
        String[][] metals= { {"Gold","Silver","Copper"},
                             {"Aluminium","Mercury","Zinc"},
                             {"Sodium","Magnesium","Barium"}
                           };

        for(int i=0;i<metals.length;i++)
        {
            for(int j=0;j<metals.length;j++)
            {
                System.out.print(metals[i][j]);
                // Don't forget to add [][] after metals ,otherwise it'll print some gibberish.
                System.out.print(" ");
            }
            System.out.println();
        }



    }
}