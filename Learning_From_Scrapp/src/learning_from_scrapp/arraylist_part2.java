
package learning_from_scrapp;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class arraylist_part2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> number=new ArrayList<Integer>();
        System.out.println("Size of ArrayList:"+number.size());
        //adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);
        number.add(4,50);
        System.out.println("The ArrayList is: "+number);
        System.out.println("Size of ArrayList:"+number.size());
        for(int x:number){
            System.out.print(" "+x);
        }
        System.out.println();
        Iterator itr=number.iterator();
        while(itr.hasNext()){
            System.out.print(" "+itr.next());
        }
        System.out.println();
        number.clear();
        System.out.println("After clearing all the list: "+number);

    }
}
