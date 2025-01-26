package ja;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create a linked list
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        // Get the size of the linked list from the user
        System.out.print("Enter the size of the linked list: ");
        int size = scanner.nextInt();
        
        // Populate the linked list with user-defined values
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            linkedList.add(scanner.nextInt());
        }
        
        // Check the first element
        if (!linkedList.isEmpty()) {
            int firstElement = linkedList.get(0);
            System.out.println("First element: " + firstElement);
            
            // Determine whether to remove even or odd elements
            if (firstElement % 2 == 0) {
                // First element is even, remove all even elements
                linkedList.removeIf(n -> n % 2 == 0);
            } else {
                // First element is odd, remove all odd elements
                linkedList.removeIf(n -> n % 2 != 0);
            }
        }
        
        // Print the remaining elements in the linked list
        System.out.println("Remaining elements in the linked list:");
        for (Integer num : linkedList) {
            System.out.print(num + " ");
        }
        
        // Close the scanner
        scanner.close();
    }
}
