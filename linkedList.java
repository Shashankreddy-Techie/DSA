public class LinkedList {
    private Node head;

    // Method to add a new node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Added " + data + " to the linked list.");
    }

    // Method to display the linked list
    public void display() {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }
        Node current = head;
        System.out.print("Linked list elements: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to delete a node by value
    public void delete(int value) {
        if (head == null) {
            System.out.println("Linked list is empty. Cannot delete.");
            return;
        }
        if (head.data == value) {
            head = head.next;
            System.out.println("Deleted " + value + " from the linked list.");
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println(value + " not found in the linked list.");
        } else {
            current.next = current.next.next;
            System.out.println("Deleted " + value + " from the linked list.");
        }
    }

    // Main method to test the linked list implementation
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.display();
        linkedList.delete(20);
        linkedList.display();
    }
}
