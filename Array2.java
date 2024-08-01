import java.util.*;
public class Array2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of 2d array :");
        int n=sc.nextInt();
        int [][] arr= new int[n][n];
        System.out.println("Enter the elements in the 2D array :");
        for (int i = 0; i <arr.length; i++) {
            for(int j=0;j<arr.length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i <arr.length; i++) {
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}