import java.util.*;

public class Main {
    public static void main(String[] args){

        // Polymorphism = many shapes/forms
        // dynamic =      after compilation (during runtime)

        // e.g. A corvette is a : corvette, & a car, & a vehicle,& an object


        Scanner input = new Scanner(System.in);
        Animal animal ;

        System.out.println("What animal do you want ?");
        System.out.println("(1=dog) or (2=cat):");

        int choice = input.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }
        else{
            animal = new Animal();
            System.out.println("You did something wrong.");
            animal.speak();
        }

    }
}
