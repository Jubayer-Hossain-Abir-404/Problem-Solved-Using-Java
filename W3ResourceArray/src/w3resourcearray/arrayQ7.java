
package w3resourcearray;
import java.util.Scanner;
import java.util.Arrays;
public class arrayQ7 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int [] my_array={
            25,14,56,15,36,56,77,18,29,49
        };
        System.out.println("Original Array: "+Arrays.toString(my_array));
        int removeIndex;
        System.out.print("Enter the index number which you want to delete:");
        removeIndex=input.nextInt();
        for(int i=removeIndex;i<my_array.length-1;i++){
            my_array[i]=my_array[i+1];
        }
        System.out.println("After removing the second element: "+Arrays.toString(my_array));
    }
}
