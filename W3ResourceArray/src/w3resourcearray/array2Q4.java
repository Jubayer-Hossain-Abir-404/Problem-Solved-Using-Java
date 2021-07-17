
package w3resourcearray;


public class array2Q4 {
    public static void main(String[] args){
        int []numbers= new int[]{
            20,30,25,35,-16,60,-100
        };
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];
        }
        double avg=sum/numbers.length;
        System.out.println("The average is:"+avg);
    }
}
