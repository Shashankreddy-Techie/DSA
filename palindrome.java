package Strings;
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = sc.nextLine().toLowerCase();
        String revString = new StringBuffer(word).reverse().toString();
        if (word.equals(revString)) {
            System.out.println("The string is a palindrome");
        }else{
            System.out.println("The string is not a palindrome");
        }
    }

}
// public static String 
