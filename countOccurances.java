package Arrays;
import java.util.*;
public class countOccurances {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element :");
        int target = sc.nextInt();
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == target){
                count++;
            }
        }
        if(count>0){
            System.out.println("The target element "+target+" has occured :"+count);
        }
        else{
            System.out.println("The target element "+target+" has not occured");
        }
    }
}
