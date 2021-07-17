package beginarray;

import java.util.Scanner;

public class ArraySumAverage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] number = new double[5];
        double sum = 0;
        //System.out.print("Enter any 5 values:");
        for (int i = 0; i < number.length; i++) {
            System.out.print("Enter value no." + i + ":");
            number[i] = input.nextDouble();
        }
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        System.out.println("Sum is:" + sum);
        double avg = sum / 5;
        System.out.println("The average is:" + avg);
    }
}
