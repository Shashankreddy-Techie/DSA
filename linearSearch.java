package ja;
import java.util.*;
import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements in Array :");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Target Element :");
        int target = sc.nextInt();
        int result = linearSearch(arr, target);
        if(result == -1){
            System.out.println("Element not found in the Array !!!!!!!");
        }else{
            System.out.println("Element found at index : "+result);
        }
    }
    static int linearSearch(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
