
package beginarray;

import java.util.Scanner;
public class ArrayOutputpart1 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int[][] a=new int[4][5];
        int k=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                a[i][j]=k++;
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
    }
}
