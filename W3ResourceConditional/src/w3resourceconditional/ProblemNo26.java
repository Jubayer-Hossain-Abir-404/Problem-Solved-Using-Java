
package w3resourceconditional;
import java.util.Scanner;

public class ProblemNo26 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int i,j,k,n,m,p;
        System.out.print("Input the number:");
        n=input.nextInt();
        p=n;
        for(i=0;i<n;i++){
            for(m=1;m<=p;m++){
                System.out.print(" ");
            }
            p--;
            for(j=0;j<i;j++){
                System.out.printf("%c",'A'+j);
            }
            for(k=i-2;k>=0;k--){
                System.out.printf("%c",'A'+k);
            }
            System.out.println();
        }
        n=n-1;
        p+=2;
        for(i=0;i<n-1;i++){
            for(m=1;m<=p;m++){
                System.out.print(" ");
            }
            p++;
            for(j=0;j<n-1;j++){
                System.out.printf("%c",'A'+j);
            }
            for(k=n-2;k>=i;k--){
                System.out.printf("%c",'A'+k);
            }
            System.out.println();
        }
    }
}
