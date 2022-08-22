// object = an instance of a class that may contain attributes and methods
// e.g. - phone, desk , laptop, coffee cup

public class OOP{
    public static void main(String[] args){
        Car myCar1 = new Car();

        System.out.println(myCar1.model);
        System.out.println(myCar1.make);

        myCar1.drive();
        myCar1.brake();

        System.out.println("------------");

        Car myCar2 = new Car();

        System.out.println(myCar2.model);
        System.out.println(myCar2.make);
    }
}

class Car{
    // Here are the attributes
    String make = "Chev";
    String model = "Corvette";
    int year = 2020;
    String color = "blue";
    double price = 50000.00;

    // Here are the methods
    void drive()
    {
        System.out.println("You drive the car.");
    }
    void brake ()
    {
        System.out.println("You step on the brakes.");
    }

}