
package w3resourceconditional;

import java.util.Scanner;
public class ProblemNo2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double a,b,c,x1,x2;
        System.out.print("Input a:");
        a=input.nextDouble();
        System.out.print("Input b:");
        b=input.nextDouble();
        System.out.print("Input c:");
        c=input.nextDouble();
        if(a==0){
            System.out.println("There is no root availbale");
        }
        else if(b==0){
            System.out.println("The roots are unavilable");
        }
        else if(c==0){
            x1=0;
            x2=-b/a;
            System.out.println("The roots are "+x1+" and "+x2);
        }
        else{
            x1=(-b+(double)Math.sqrt(b*b-4*a*c))/(2*a);
            x2=(-b-(double)Math.sqrt(b*b-4*a*c))/(2*a);
            System.out.println("The roots are "+x1+" and "+x2);
        }
    }
}
