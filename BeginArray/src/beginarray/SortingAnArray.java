
package beginarray;

import java.util.Arrays;
import java.util.Scanner;
public class SortingAnArray {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[] a=new int [5];
        System.out.println("Enter any values:");
        for(int i=0;i<5;i++){
            a[i]=input.nextInt();
        }
        Arrays.sort(a);
        System.out.println("After Sorting in ascending order:");
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
        System.out.println("After soting in descending order:");
        for(int i=4;i>=0;i--){
            System.out.println(a[i]);
        }
        String [] names={"Abir","Rabbi","Shawon","Kaka"};
        Arrays.sort(names);
        for(String x:names){
            System.out.println(x);
        }
        
        
    }
}
