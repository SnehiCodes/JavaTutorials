import java.util.Scanner;


public class KeywordStatic{
    public static void main(String[] args){

        int a,b,c,d,e,f,g,h,i,j,k;

        Scanner comein = new Scanner(System.in);

        a = comein.nextInt();

        b= a%5; c= a/5;
        d=b%4; e=b/4;
        f= d%3; g= d/3;
        h= f%2;i= f/2;
        j=h%1; k=h/1;

        if (b==0)
        {
            System.out.println(c);
        }

        else if( d==0){

            System.out.println(c+e);
        }
        else if(f==0){

            System.out.println(c+e+g);
        }
        else if( h==0){

            System.out.println(c+e+g+i);
        }

        else if( j==0){

            System.out.println(c+e+g+i+k);
        }
        else{

            // System.out.println(a);
        }


    }
}