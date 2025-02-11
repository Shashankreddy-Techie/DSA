package Searching_Algorithms;
import java.util.*;

public class Linear_Search{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in Array :");
        for(int i= 0; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target Element :");
        int target = sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                System.out.println("Element is found at index " + i);
            }
        }
    }
}