
package w3resourcearray;

import java.util.Scanner;
import java.util.Arrays;
public class arrayQ13 {
    public static void main(String[] args){
       Scanner input=new Scanner(System.in);
       String [] my_array={
           "bcd","abd","jude","bcd","oiu","gzw","oiu"
       };
       int c=0;
       for(int i=0;i<my_array.length-1;i++){
           for(int j=i+1;j<my_array.length;j++){
               c++;
               if((my_array[i].equals(my_array[j]))&&(i!=j)){
                   System.out.println("Duplicate Element is : "+my_array[j]);
               }
           }
       }
       System.out.println("After counting: "+c);
    }
}
