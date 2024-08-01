package Arrays;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int n = sc.nextInt();
        int [] a= new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        reverse(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    static void reverse(int[]a){
        int start=0;
        int end=a.length-1;
        while(start<end){
            swap(a,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[]a ,int index1,int index2){
            int temp=a[index1];
            a[index1]=a[index2];
            a[index2]=temp;
    }
}
