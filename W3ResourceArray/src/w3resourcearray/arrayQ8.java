
package w3resourcearray;

import java.util.Arrays;
public class arrayQ8 {
    public static void main(String[] args){
        int [] my_arrays={
            25,14,56,15,36,56,77,18,29,49
        };
        int [] new_array = new int[10];
        System.out.println("Source Array: "+Arrays.toString(my_arrays));
        for(int i=0;i<my_arrays.length;i++){
            new_array[i]=my_arrays[i];
        }
        System.out.println("New Array: "+Arrays.toString(new_array));
    }
}
