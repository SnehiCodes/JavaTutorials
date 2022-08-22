// For-each loop = traversing technique to iterate through the elements in an array/collection
//                 less steps , more readable
//                 less flexible

import java.util.*;

public class foreach{
    public static void main(String[] args){

        String[] animals = {"cat","dog","cow","pig","horse","rat","donkey","elephant"};

        for (String i: animals)
        {
            System.out.println(i);
        }

        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("coke");
        food.add("mayo");

        for(String i: food)
        {
            System.out.println(i);
        }

}}