package heap;

import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;

public class MergeKSorted {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        // Create a priority queue to store the nodes from the lists
        PriorityQueue<ListNode> queue = new PriorityQueue<>(
                (a, b) -> a.val - b.val);

        // Add the head nodes of all the lists to the queue
        for (ListNode node : lists) {
            if (node != null) {
                queue.add(node);
            }
        }

        // Create a dummy head node to store the result
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        // While the queue is not empty
        while (!queue.isEmpty()) {
            // Remove the minimum element from the queue
            ListNode min = queue.poll();

            // Add the minimum element to the result list
            curr.next = min;
            curr = curr.next;

            // Add the next element from the list containing the minimum element to the queue
            if (min.next != null) {
                queue.add(min.next);
            }
        }

        // Return the result list
        return dummy.next;
    }

    public static void main(String[] args) {
        // Create some test lists
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(7);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(5);
        l2.next.next = new ListNode(8);

        ListNode l3 = new ListNode(3);
        l3.next = new ListNode(6);
        l3.next.next = new ListNode(9);

        ListNode[] lists = {l3, l2, l1};

        // Merge the lists
        ListNode result = mergeKLists(lists);

        // Print the result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
