//ArrayList
import java.util.ArrayList;

public class arraylist{
    public static void main(String[] args){

        // ArrayList is a resizable array.
        //           elements can be added or removed after compilation phase.
        //           only stores reference data types.
        //           should be written as ArrayList
        //           if you want to use primitive data types , use wrapper class.

        ArrayList<String>food = new ArrayList<String>();
        food.add("pizza");
        food.add("ice-cream");
        food.add("burger");

        for(int i=0;i<food.size();i++)
        {
            System.out.println(food.get(i));
        }

        // Few useful methods
        food.set(0,"sushi");
        for(int i=0;i<food.size();i++)
        {
            System.out.println(food.get(i));
        }

        //remove a value using remove method
        food.remove(2);
        for(int i=0;i<food.size();i++)
        {
            System.out.println(food.get(i));
        }
        System.out.println("----------");
        food.clear();
        for(int i=0;i<food.size();i++)
        {
            System.out.println(food.get(i));
        }
    }
}