package data_structure.day5.remove_nth_from_end;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode left = dummy;
        ListNode right = head;
        for (int i = 0; i < n; i++) {
            right = right.next;
        }
        while (right != null) {
            right = right.next;
            left = left.next;
        }
        left.next = left.next.next;
        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void traverse(ListNode listNode) {
        System.out.println(listNode.val + " ");
        if (listNode.next != null) {
            traverse(listNode.next);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l6 = new ListNode(6);
        ListNode l5 = new ListNode(5, l6);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        ListNode.traverse(solution.removeNthFromEnd(l1, 2));
    }
}
