package arrays2D;
import java.util.*;
public class minMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows and columns :");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr1 = new int[r][c];
        System.out.println("enter the elements of the array");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        int min = arr1[0][0];
        int max = arr1[0][0];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(min > arr1[i][j]){
                    min = arr1[i][j];
                }
                if(max < arr1[i][j]){
                    max = arr1[i][j];
                }
            }
        }
        System.out.println("minimum element is : "+min);
        System.out.println("maximum element is : "+max);
    }
}
