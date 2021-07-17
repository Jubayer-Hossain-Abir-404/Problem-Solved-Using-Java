
package anisulislam1;
import java.util.Scanner;

public class Series {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int i,n,sum=0;
        System.out.print("Enter the value of n:");
        n=input.nextInt();
        for(i=1;i<=n;i++){
            sum= sum+ (int)Math.pow(i, 2);
        }
        System.out.println("The result is:"+sum);
    }
}
