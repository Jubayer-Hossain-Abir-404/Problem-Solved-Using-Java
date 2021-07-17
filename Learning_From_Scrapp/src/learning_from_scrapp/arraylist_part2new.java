
package learning_from_scrapp;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class arraylist_part2new {
    public static void main(String[] args){
        ArrayList <Integer> number= new ArrayList<Integer>();
        System.out.println("Size= "+number.size());
        
        //adding number
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);
        System.out.println("Arraylist Contains: "+number);
        System.out.println();
        System.out.println("Size = "+number.size());
        //removing elements
       /* number.remove(2);
        System.out.println("After removing Arraylist COntains: "+number);
        number.removeAll(number);
        System.out.println("After removing all: "+number);*/
       //number.clear();
       //System.out.println("After clear arraylist contains : "+number);
       boolean check=number.isEmpty();
       System.out.println("arraylist empty : "+check);
       boolean contain=number.contains(30);
       System.out.println("30 is in the list : "+contain);
       int pos=number.indexOf(40);
       System.out.println("The index of 40 is : "+pos);
       number.set(3, 50); //replace
       System.out.println("After setting : "+number);
       int x=number.get(0);
       System.out.println("index 0 = "+x);
    }
}
