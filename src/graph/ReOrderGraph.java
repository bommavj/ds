package graph;

public class ReOrderGraph {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        reorderList(head);
        // the reordered linked list should be 1->5->2->4->3
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + "->");
            current = current.next;
        }
    }

    //1->2->3->4->5
    public static void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        // find the middle of the list
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // reverse the second half of the list
        ListNode prev = null, curr = slow.next;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        slow.next = prev;
        // merge the two halves back together
        ListNode first = head, second = slow.next;
        while (second != null) {
            slow.next = second.next;
            second.next = first.next;
            first.next = second;
            first = second.next;
            second = slow.next;
        }
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}



