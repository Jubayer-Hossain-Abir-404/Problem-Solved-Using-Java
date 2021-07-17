
package w3resourcearray;

import java.util.Scanner;
import java.util.Arrays;
public class arrayQ9 {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int [] my_array={
            25,14,56,15,36,56,77,18,29,49
        };
        int Index_position,newValue;
        System.out.println("Source Array: "+Arrays.toString(my_array));
        System.out.print("Enter the position of the index:");
        Index_position= input.nextInt();
        System.out.print("Enter the value you want to put in that newly scanned index number:");
        newValue=input.nextInt();
        for(int i=my_array.length-1;i>Index_position;i--){
            my_array[i]=my_array[i-1];
        }
        my_array[Index_position]=newValue;
        System.out.println("After insertion:"+Arrays.toString(my_array));
    }
}
