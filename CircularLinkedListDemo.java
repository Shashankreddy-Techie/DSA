package ja;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    private Node last;

    public CircularLinkedList() {
        this.last = null;
    }

    // Method to add a new node to the circular linked list
    public void add(int data) {
        Node newNode = new Node(data);
        if (last == null) {
            last = newNode;
            last.next = last; // Point to itself
        } else {
            newNode.next = last.next; // New node points to the first node
            last.next = newNode; // Last node points to the new node
            last = newNode; // Update last to the new node
        }
    }

    // Method to display the circular linked list
    public void display() {
        if (last == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node first = last.next; // First node
        Node current = first;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != first);
        System.out.println();
    }
}

public class CircularLinkedListDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CircularLinkedList circularLinkedList = new CircularLinkedList();

        System.out.println("Enter numbers to add to the circular linked list (type -1 to stop):");
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            circularLinkedList.add(input);
        }

        System.out.println("The circular linked list is:");
        circularLinkedList.display();

        scanner.close();
    }
}