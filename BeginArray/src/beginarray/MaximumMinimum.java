package beginarray;

import java.util.Scanner;

public class MaximumMinimum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] number = new double[5];
        double maximum, minimum;
        for (int i = 0; i < number.length; i++) {
            System.out.print("Enter any value:");
            number[i] = input.nextDouble();
        }
        maximum = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > maximum) {
                maximum = number[i];
            }
        }
        minimum = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] < minimum) {
                minimum = number[i];
            }
        }
        System.out.println("The maximum value is:" + maximum);
        System.out.println("The minimum value is:" + minimum);
    }
}
