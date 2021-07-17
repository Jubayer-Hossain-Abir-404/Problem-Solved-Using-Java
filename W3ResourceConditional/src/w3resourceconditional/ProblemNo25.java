
package w3resourceconditional;

import java.util.Scanner;
public class ProblemNo25 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int i,j,k,n,m,p;
        System.out.print("Input the number:");
        n=input.nextInt();
        p=n;
        for(i=1;i<=n;i++){
            for(m=1;m<=p;m++){
                System.out.print(" ");
            }
            p--;
            for(j=i;j>=1;j--){
                System.out.print(j);
            }
            for(k=2;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
        n=n-1;
        p+=2;
        for(i=n;i>=1;i--){
            for(m=1;m<=p;m++){
                System.out.print(" ");
            }
            p++;
            for(j=i;j>=1;j--){
                System.out.print(j);
            }
            for(k=2;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
