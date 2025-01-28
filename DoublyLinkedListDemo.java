package ja;
import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    private Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    // Method to add a new node to the end of the doubly linked list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If the list is empty, set head to new node
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; // Traverse to the end of the list
            }
            current.next = newNode; // Link the last node to the new node
            newNode.prev = current; // Link the new node back to the last node
        }
    }

    // Method to display the doubly linked list
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class DoublyLinkedListDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        System.out.println("Enter numbers to add to the doubly linked list (type -1 to stop):");
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            doublyLinkedList.add(input);
        }

        System.out.println("The doubly linked list is:");
        doublyLinkedList.display();

        scanner.close();
    }
}
