public class ObjArr{

    public static void main(String[] args){

        //int[] numbers = new int[3];
        //char[] characters = new char[4];
        //String[] strings = new String[5];

        Food[] refrigerator = new Food[3];

        Food food1 = new Food("pizza");
        Food food2 = new Food("pasta");
        Food food3 = new Food("eggs");

        refrigerator[0]= food1;
        refrigerator[1]= food2;
        refrigerator[2]= food3;

        System.out.println(refrigerator[2].name);
    }

}

class Food{

    String name ;
    Food(String name)
    {
        this.name = name;
    }

}