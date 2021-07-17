
package anisulislam1;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       int result,a,b;
       double result2;
       System.out.print("Please enter a number:");
       a=input.nextInt();
       System.out.print("Please enter a another number:");
       b=input.nextInt();
       result=a+b;
       System.out.println("The summation is:"+result);
       result=a-b;
       System.out.println("The subtraction is:"+result);
       result=a*b;
       System.out.println("The multiplication result is:"+result);
       result=a/b;
       result2=(double)a/b;
       System.out.println("The Quotient is:"+result);
       System.out.println("The exact Quotient is:"+result2);
       result=a%b;
       System.out.println("The remainder is:"+result);
    }
}
