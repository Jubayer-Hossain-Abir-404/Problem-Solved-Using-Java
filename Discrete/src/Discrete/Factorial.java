
package anisulislam1;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner value=new Scanner(System.in);
        int i,n,fact=1;
        System.out.print("Enter the value of n:");
        n=value.nextInt();
        for(i=n;i>=1;i--){
            fact=fact*i;
        }
        System.out.println("The result is:"+fact);
    }
}
