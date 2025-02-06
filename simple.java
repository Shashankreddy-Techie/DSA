package arrays2D;
import java.util.*;
class sample{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of rows & columns :");
       int n = sc.nextInt();
       int m = sc.nextInt();
       int[][] arr = new int[n][m];
       System.out.println("Enter the elements of the matrix :");
       for(int i = 0; i < n; i++) {
        for(int j=0;j<n;j++){
            arr[i][j] = sc.nextInt();
        }
       }
       System.out.println("printing the 2D matrix");
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
       }
    }
}