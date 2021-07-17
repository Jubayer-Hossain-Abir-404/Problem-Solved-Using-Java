
package anisulislam1;

import java.util.Scanner;


public class CapitalSmall {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        char ch;
        System.out.print("please enter any character:");
        ch=input.next().charAt(0);
        if(ch>='A'&&ch<='Z'){
            System.out.println(ch+" is capital letter");
        }
        else{
            System.out.println(ch+" is small letter");
        }
        
    }
}
