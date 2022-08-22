// object passing

public class ObjPass{
    public static void main(String[] args){

        Garage garage = new Garage();
        Car3 car_1 = new Car3("BMW");
        Car3 car_2 = new Car3("Chev");

        garage.park(car_1);
        garage.park(car_2);
    }
}

class Car3{

    String name ;
    Car3 (String name)
    {
        this.name = name ;
    }

}

class Garage{

    void park(Car3 car){
        System.out.println("The " + car.name + " is parked in the garage .");
    }
}