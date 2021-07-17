
package w3resourceconditional;

import java.util.Scanner;
public class ProblemNo6 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double m,n;
        System.out.print("Input floating-point number:");
        m=input.nextDouble();
        System.out.print("Input floating-point another number:");
        n=input.nextDouble();
        m=Math.round(m*1000);
        m=m/1000;
        n=Math.round(n*1000);
        n=n/1000;
        System.out.println("After rounding up m:"+m);
        System.out.println("After rounding up n:"+n);
        if(m==n){
            System.out.println("They are the same up to three decimal places");
        }
        else{
            System.out.println("They are different");
        }
    }
}
