package arrays2D;
import java.util.*;
public class addition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows and columns :");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr1 = new int[r][c];
        int[][] arr2 = new int[r][c];
        System.out.println("enter the elements of the array");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        int[][] arr3 = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Printing the Addition of the two matrices :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
