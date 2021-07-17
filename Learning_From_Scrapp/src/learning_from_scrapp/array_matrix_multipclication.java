
package learning_from_scrapp;
import java.util.Scanner;

public class array_matrix_multipclication {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int [][]a=new int [3][3];
        int [][]b=new int [3][3];
        int [][]c=new int [3][3];
        System.out.println("Enter the value of matrix A:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=input.nextInt();
            }
        }
        System.out.println("Enter the value of B:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[i][j]=input.nextInt();
            }
        }
        int sum;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum=0;
                for(int k=0;k<3;k++){
                    sum=sum+a[i][k]*a[k][j];
                }
                c[i][j]=sum;
            }
        }
        System.out.println("After the multiplication Matrix C is:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
