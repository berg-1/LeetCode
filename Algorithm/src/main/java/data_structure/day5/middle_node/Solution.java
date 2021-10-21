package data_structure.day5.middle_node;

public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode left = head;
        ListNode right = head;
        while (right != null) {
            if (right.next == null) break;
            right = right.next.next;
            left = left.next;
        }
        return left;
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
        System.out.println(solution.middleNode(l1));
    }
}
