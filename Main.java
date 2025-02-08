package Strings;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String word = sc.nextLine();
        StringBuilder sb = new StringBuilder(word);
        String revWord = sb.reverse().toString();
        System.out.println("The reverse of given string "+word+" is "+revWord);
    }
}