// Overload Method = methods that have name but have differernt parameters
//                   method name + parameters = method signature
//

public class overloadedMethod{
    public static void main(String[] args)
    {
        int x=add(5,7,7,8);
        System.out.println(x);
        double y = add(4,5,3);
        System.out.println(y);
    }
    static int add(int a,int b)
    {
        return a+b;
    }
    static int add(int a,int b,int c,int d)
    {
        return a+b+c+d;
    }
    static double add(int a,int b,int c)
    {
        return a+b+c;
    }




}