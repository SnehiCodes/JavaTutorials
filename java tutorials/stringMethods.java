// In this , we'll learn about important string methods.

import java.util.Locale;

public class stringMethods{
    public static void main(String[] args){

        String name="   Coco   ";
        boolean result= name.equals("Coco");
        // This is case sensitive.
        System.out.println(result);

        //If you want case-insensitive, use equals ignorecase.
        boolean result1 = name.equalsIgnoreCase("coco");
        System.out.println(result1);

        int miles=name.length();
        System.out.println(miles);

       // To access a char at some index in a string we use charAt.
        char answer=name.charAt(3);
        System.out.println(answer);

        // to find the index of a char in a string
        int place = name.indexOf("c");
        System.out.println(place);

        // we can also check if the string is empty.
        boolean answer2=name.isEmpty();
        System.out.println(answer2);

        // To change the letters of a string to uppercase, we use toUpperCase().
        System.out.println(name.toUpperCase());
        // Similarly ,to change the letters of a string to lowercase we use toLowerCase().
        System.out.println(name.toLowerCase());

        // to remove the empty space , we use trim().
        System.out.println(name.trim());

        // to replace a letter in a string with a new letter, we use replace(old,new).
        System.out.println(name.replace("o","u"));

    }
}