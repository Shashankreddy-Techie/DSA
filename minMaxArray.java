package Arrays;
import java.util.*;
public class minMaxArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array :");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements in the Array :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for(int i=0;i<n;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Minimum element in the array is :"+min);
        System.out.println("Maximum element in the array is :"+max);
    }
}
