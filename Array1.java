import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        //Syntax//
        // datatype[] var_name= new datatype[size];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element at index "+i+" :");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
        
}
