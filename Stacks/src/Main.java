import java.util.Stack;

public class Main {
    public static void main(String[] args){

        //Stack =  LIFO data structure, First In First Out
        //         stores objects into a sort of vertical tower
        //         push() to add on the top
        //         pop() to remove from the stack

        Stack <String> myStack = new Stack<String>();

        System.out.println(myStack.empty());

        myStack.push("Top Gun");
        myStack.push("Cocktail");
        myStack.push("Mission Impossible");
        myStack.push("Eyes Wide Shut");
        myStack.push("The Last Samurai");
        myStack.push("Minority Report");
        myStack.push("War of the Worlds");
        myStack.push("Risky Business");
        myStack.push("Top Gun : Maverick");
        myStack.push("The Mummy");

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        myStack.pop();

        System.out.println(myStack.empty());



    }
}
