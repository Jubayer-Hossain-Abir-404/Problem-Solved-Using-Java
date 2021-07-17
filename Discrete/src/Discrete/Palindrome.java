
package anisulislam1;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int sum=0,remainder,x,p;
        System.out.print("Enter any number:");
        x=input.nextInt();
        p=x;
        while(x!=0){
            remainder=x%10;
            sum=sum*10+remainder;
            x=x/10;
        }
        if(sum==p){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
