class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        // Base case: if head is null or only one node
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode newHead = reverseList(head.next); // Reverse the rest of the list
        head.next.next = head; // Make the next node point to the current head
        head.next = null; // Set the current head's next to null
        return newHead; // Return the new head of the reversed list
    }
}
