
package anisulislam1;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int first=0,second=1,i,n,x;
        System.out.print("How many values do you want to take:");
        n=input.nextInt();
        System.out.print(first+" "+second);
        for(i=3;i<=n;i++){
            x=first+second;
            System.out.print(" "+x);
            first=second;
            second=x;
        }
    }
}
