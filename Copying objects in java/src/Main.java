public class Main {
    public static void main(String[] args){

        Car car1 = new Car("Chev","Camaro",2022);
        //Car car2 = new Car("Ford","Mustang",1222);

        //car2 =car1;
        //Doing this we're not copying the value we are copying the location
        // Now there is only one car car1.

        //car2.copy(car1);

        Car car2 = new Car(car1);



        // This will print the address of car1 in memory.
        System.out.println(car1);
        System.out.println(car2);
        System.out.println("----------------");
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println("----------------");
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());

    }

}
