package Searching_Algorithms;
import java.util.*;
public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements in Array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted Array is :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the target element :");
        int target = sc.nextInt();
        int low = 0, high = n-1;
        int result = binarySearch(arr, target,0 , n-1);
        if (result == -1){
            System.out.println("Element not found in array");
        }
        else{
            System.out.println("Element found at index " + result);
        }
    }
    public static int binarySearch(int[] arr, int target, int low, int high) {
        while(low<=high){
            int mid = (low + high) / 2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }        
        return -1;
    }
}
