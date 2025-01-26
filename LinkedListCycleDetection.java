package ja;

class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

public class LinkedListCycleDetection {
    
    // Function to detect cycle in the linked list
    public static boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // Move slow pointer by 1
            fast = fast.next.next;     // Move fast pointer by 2

            // If they meet, there is a cycle
            if (slow == fast) {
                return true;
            }
        }

        return false; // No cycle found
    }

    public static void main(String[] args) {
        // Create a linked list with a cycle for testing
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        // Creating a cycle for testing
        head.next.next.next.next.next = head.next; // 5 points to 2, creating a cycle

        // Check if the linked list has a cycle
        if (hasCycle(head)) {
            System.out.println("The linked list has a cycle.");
        } else {
            System.out.println("The linked list does not have a cycle.");
        }
    }
}
