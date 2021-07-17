package beginarray;

import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i=0;
        String[] names = {"Abir","Asif Hossain","Shawon","Rabbi Hasan"};
        /*for (int i = 0; i < names.length; i++) {
            System.out.print("Enter any name:");
            names[i]=input.nextLine();
        }*/
        //System.out.print("\n\n");
        for(String x: names){
            System.out.println(x);
        }
    }
}
