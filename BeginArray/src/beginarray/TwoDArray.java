package beginarray;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int [][]a=new int [2][3];
        int [][]b=new int [2][3];
        int [][]c=new int [2][3];
        System.out.println("Enter the value of matrix A:");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.printf("A[%d][%d] = ",i,j);
                a[i][j]=input.nextInt();
            }
        }
        System.out.println("Enter the value of matrix B:");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.printf("B[%d][%d] = ",i,j);
                b[i][j]=input.nextInt();
            }
        }
        System.out.println("A:");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print("\t "+a[i][j]);
            }
            System.out.println();
        }
        System.out.println("B:");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print("\t "+b[i][j]);
            }
            System.out.println();
        }
        System.out.println("A+B:");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
               System.out.print("\t "+c[i][j]);
            }
            System.out.println();
        }
    }
}
