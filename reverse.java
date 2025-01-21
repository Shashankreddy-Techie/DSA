package ja;
import java.lang.reflect.Array;
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an Array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the Array :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr);
        System.out.println("Reversed Array : "+ Arrays.toString(arr));
    }

    static void reverse(int []arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr, start, end);
            end--;
            start++;
        }
    }
    static void swap(int []arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
}
