
package anisulislam1;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int i,sum=0,temp,remainder,x;
        System.out.print("Enter a number:");
        x=input.nextInt();
        temp=x;
        while(x!=0){
            remainder=x%10;
            sum=sum+(int)Math.pow(remainder,3);
            x=x/10;
        }
        if(temp==sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
}
