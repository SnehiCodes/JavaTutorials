// Scope
//
//   local = declared inside a method
//           visible only to that method
//
//  global = declared outside a method , but within a class
//           visible to all parts of a class

import java.util.Random;

public class scope{

    Random random;
    int number = 0;

    public static void main(String[] args){

        DiceRoller diceRoller = new DiceRoller();
    }

        }


class DiceRoller{
    DiceRoller(){
        Random random = new Random();
        int number = 0;
        roll(random,number);

    }
    void roll(Random random,int number)
    {
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}


