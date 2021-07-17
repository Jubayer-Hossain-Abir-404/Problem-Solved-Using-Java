
package anisulislam1;

import java.util.Scanner;
public class ReverseaNumnber {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int i,sum=0,x,remainder;
        System.out.print("Enter a value:");
        x=input.nextInt();
        while(x!=0){
            remainder=x%10;
            sum=sum*10+remainder;
            x=x/10;
        }
        System.out.println("After Reversing:"+sum);
    }
    
    
}
