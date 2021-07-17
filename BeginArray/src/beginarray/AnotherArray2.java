
package beginarray;

import java.util.Scanner;
public class AnotherArray2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[] a={10,20,30,40,50,60,70,80,90,100};
        System.out.println("The size of the array is:"+a.length);
        int sum=0;
        for(int x: a){
            sum=sum+x;
        }
        System.out.println("The sum is:"+sum);
    }
}
