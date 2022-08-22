public class overloadedConstructors{
    public static void main(String[] args){



        System.out.println("---------------------------");

        Pizza pizza = new Pizza("thick crust","tomato","mozzerella");

        System.out.println("Here are the ingredients of your pizza");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.topping);
        System.out.println(pizza.cheese);





    }
}

class Pizza{

    String bread,sauce,topping,cheese;

    Pizza(String bread,String sauce,String topping,String cheese){

        this.bread = bread;
        this.sauce = sauce;
        this.topping = topping;
        this.cheese = cheese;

    }

    Pizza(String bread,String sauce,String topping){

        this.bread = bread;
        this.sauce = sauce;
        this.topping = topping;

    }


}