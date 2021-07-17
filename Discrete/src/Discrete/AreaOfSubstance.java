
package anisulislam1;
import java.util.Scanner;

public class AreaOfSubstance {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double base , height, area;
        System.out.print("Please enter the value of base:");
        base=input.nextDouble();
        System.out.print("Please enter the value of height:");
        height=input.nextDouble();
        area=0.5*base*height;
        System.out.println("The area is:"+area);
    }
}
