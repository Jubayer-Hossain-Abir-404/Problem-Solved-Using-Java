
package learning_from_scrapp;
import java.util.Scanner;

public class array_begin {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int [] number=new int[6];
        for(int i=0;i<number.length;i++){
            System.out.print("Enter any number:");
            number[i]=input.nextInt();
        }
        int sum=0;
        for(int x:number){
            sum=sum+x;
        }
        System.out.println("The sum is:"+sum);
    }
}
