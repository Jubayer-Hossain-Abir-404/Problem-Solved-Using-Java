
package anisulislam1;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int i,n,result;
        System.out.print("Enter the value of n:");
        n=input.nextInt();
        for(i=1;i<=10;i++){
            result=n*i;
            System.out.println(n+" * "+i+" = "+result);
        }
    }
}
