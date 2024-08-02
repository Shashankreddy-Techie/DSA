package Arrays;
import java.util.*;
import java.io.*;
public class Plus_minus{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        int plus=0;
        int minus=0;
        int zero=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                plus++;
            }
            else if(arr[i]<0) {
                minus++;
            }
            else{
                zero++;
            }
        }
        float positives=plus/n;
        float negatives=minus/n;
        float zeros=zero/n;
        System.out.printf("Positive fraction is :",positives);
        System.out.printf("Negative decimals is :",negatives);
        System.out.printf("Zeroes decimal is :",zeros);
    }
}