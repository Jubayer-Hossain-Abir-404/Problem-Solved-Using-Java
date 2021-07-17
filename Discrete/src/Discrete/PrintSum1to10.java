
package anisulislam1;

import java.util.Scanner;
public class PrintSum1to10 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int sum=0,i;
        for(i=1;i<=10;i++){
            sum+=i;
        }
        System.out.println("The sum is:"+sum);
    }
}
