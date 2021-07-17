
package learning_from_scrapp;
import java.util.ArrayList;
import java.util.Iterator;
public class arraylist_part1 {
    public static void main(String[] args){
        ArrayList<Integer> number= new ArrayList<Integer>();
        System.out.println("Size = "+number.size());
        //adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 40);
        number.add(4,50);
        System.out.println("ArrayList are:"+number);
        System.out.println("Size = "+number.size());
        for(int x:number){
            System.out.print(" "+x);
        }
        System.out.println();
        Iterator itr=number.iterator();
        while(itr.hasNext()){
            System.out.print(" "+itr.next());
        }
        System.out.println();
        number.remove(2);
        System.out.println("After romoving ArrayList are: "+number);
        number.removeAll(number);
        System.out.println("After removing all ArrayList: "+number);
    }
}
