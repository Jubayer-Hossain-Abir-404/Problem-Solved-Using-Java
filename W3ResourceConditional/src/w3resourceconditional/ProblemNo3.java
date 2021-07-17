
package w3resourceconditional;

import java.util.Scanner;
public class ProblemNo3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double m;
        int n;
        System.out.print("Input a number:");
        m=input.nextDouble();
        if(m>0){
            n=1;
            System.out.println("The value of m = "+m);
            System.out.println("The value of n = "+n);
        }
        else if(m<0){
            n=-1;
            System.out.println("The value of m = "+m);
            System.out.println("The value of n = "+n);

        }
        else{
            n=0;
            System.out.println("The value of m = "+m);
            System.out.println("The value of n = "+n);

        }
    }
}
