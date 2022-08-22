//  method = block of code that is executed whenever it is called upon

public class methods{
    public static void main (String[] args)
    {
        String name = "Snehi";
        //hello(name);
        //hello("coco");
        int age=43;
        hello(name,age);
    }

    static void hello(String name,int age)
        {
            System.out.println("Hello " + name);
            System.out.println("You are "+ age);
        }

}