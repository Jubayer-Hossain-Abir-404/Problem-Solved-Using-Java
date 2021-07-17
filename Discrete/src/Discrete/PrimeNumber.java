
package anisulislam1;

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int c=0,i,x;
        System.out.print("Please enter a number:");
        x=input.nextInt();
        for(i=2;i<x/2;i++){
            if(x%i==0){
                c=1;
                break;
            }
        }
        if(c==0){
            System.out.println(x+" is a prime");
        }
        else{
            System.out.println(x+" is not a prime");
        }
    }
}
