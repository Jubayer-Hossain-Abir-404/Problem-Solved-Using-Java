
package w3resourceconditional;
import java.util.Scanner;

public class ProblemNo1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a;
        System.out.print("Input Number:");
        a=input.nextInt();
        if(a>=0){
            System.out.println("Number is positive");
        }
        else{
            System.out.println("Number is Negative");
        }
    }
}
