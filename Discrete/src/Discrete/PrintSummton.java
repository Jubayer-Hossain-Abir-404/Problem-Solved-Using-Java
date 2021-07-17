
package anisulislam1;
import java.util.Scanner;

public class PrintSummton {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int m,n,sum=0;
        System.out.print("Enter the value of m:");
        m=input.nextInt();
        System.out.print("Enter the value of n:");
        n=input.nextInt();
        for(int i=m;i<=n;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println("The Sum is:"+sum);
    }
}
