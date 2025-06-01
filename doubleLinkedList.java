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

    // Insert a new node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    // Delete a node from the list
    public void delete(int data) {
        if (head == null) return;

        Node current = head;

        // If the node to be deleted is the head
        if (current.data == data) {
            head = current.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        // Traverse the list to find the node to delete
        while (current != null && current.data != data) {
            current = current.next;
        }

        // If the node was not found
        if (current == null) return;

        // Unlink the node from the list
        if (current.next != null) {
            current.next.prev = current.prev;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }
    }

    // Print the list from head to tail
    public void printForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Print the list from tail to head
    public void printBackward() {
        Node current = head;
        if (current == null) return;

        // Go to the last node
        while (current.next != null) {
            current = current.next;
        }

        // Traverse backward
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insert(10);
        dll.insert(20);
        dll.insert(30);
        
        System.out.println("Forward traversal:");
        dll.printForward(); // Output: 10 20 30
        
        System.out.println("Backward traversal:");
        dll.printBackward(); // Output: 30 20 10
        
        dll.delete(20);
        System.out.println("After deleting 20:");
        dll.printForward(); // Output: 10 30
    }
}
