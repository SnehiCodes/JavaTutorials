// printf method = similar to printf in C
//                 optional method to control , format , display text to the console window

public class printfMet{
    public static void main(String[] args)
    {
        System.out.printf("%d This is a %d format string.",123,76);

        boolean myBoolean = true;          // %b for boolean
        char myChar = '$';                 // %c for char
        String myString = "Conopy";        // %s for string
        int myInt = 50;                    // %d for int
        double myDouble = 31416;            // %f for double or float

        System.out.printf("%b \n",myBoolean);
        System.out.printf("%c \n",myChar);
        System.out.printf("%d \n",myInt);
        System.out.printf("%f \n",myDouble);

        // width = minimum number of characters to be written as output
        System.out.printf("Hello %10s \n",myString);
        System.out.printf("Hello %-10s\n",myString);

        //precision = set number of digits of precision when out-putting floating-point numbers
        System.out.printf("You have %f money.\n",myDouble);
        System.out.printf("You have %.2f money.\n ",myDouble);
        System.out.printf("You have %.6f money.\n ",myDouble);

        // flags = adds an effect to output based on the flag added to format specifier

        // - : left justify
        System.out.printf("You have %-20f money.\n",myDouble);
        System.out.printf("You have %-20f money.\n",myDouble);

        // + : output a (+) or (-) sign for a numeric value
        System.out.printf("You have %+f money.\n",myDouble);

        // 0 : numeric values are zero padded
        System.out.printf("You have %+f money.\n",myDouble);
        System.out.printf("You have %017f money.\n",myDouble);

        // , : comma grouping separator if numbers > 1000
        System.out.printf("------------------\n");
        System.out.printf("You have %,f money.\n",myDouble);













    }
}