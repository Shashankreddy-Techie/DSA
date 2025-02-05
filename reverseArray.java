package Arrays;
import java.util.*;
class ReverseArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int [] revArr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            revArr[i] = arr[n-i-1];
        }
        System.out.println("Printing the reverse order of Array:");
        for(int i=0;i<n;i++){
            System.out.print(revArr[i]+" ");
        }
    }
}