
package w3resourcearray;

public class arrayQ6 {
    public static int find_my_index(int [] a,int item){
        if(a==null){
            return -1;
        }
        int len=a.length;
        int i=0;
        while(i<len){
            if(a[i]==item){
                return i;
            }
            i++;
        }
        return -1;
    }
    public static void main(String[] args){
        int []my_array={
            25,14,56,15,36,56,77,18,29,49
        };
        System.out.println("Index number of 25 is:"+find_my_index(my_array,25));
        System.out.println("Index number of 77 is:"+find_my_index(my_array,77));
    }
}
