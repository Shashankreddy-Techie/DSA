package Arrays;
import java.util.*;
public class max {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int n = sc.nextInt();
        int [] a= new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println(max(a));
    }
    public static int max(int[] a) {
        int maxval=a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i]>maxval){
                maxval=a[i];
            }
        }
        return maxval;
    }
}
