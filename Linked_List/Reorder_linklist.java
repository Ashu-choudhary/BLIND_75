package Linked_List;

class ListNode {

    int data;

    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Reorder_linklist {
    public static void reorderList(ListNode head) {
        ListNode mid = middle(head);
        ListNode rev = reverse(mid.next);
        mid.next = null;

        ListNode c1 = head;
        ListNode c2 = rev;
        ListNode t1 = null;
        ListNode t2 = null;

        while (c1 != null && c2 != null) {
            t1 = c1.next;
            t2 = c2.next;

            c1.next = c2;
            c2.next = t1;

            c1 = t1;
            c2 = t2;

        }
    }

    static ListNode middle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode forw = null;

        while (curr != null) {
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }

    public static void printLinkedList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Reverse the linked list
        reorderList(head);

        // Print the reversed linked list
        System.out.print("Reordered Linked List: ");
        printLinkedList(head);
    }
}
