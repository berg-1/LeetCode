package set_a.add_two_numbers;

/**
 * @author Berg
 */
public class Solution {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int remainder = 0;
        int sum = 0;
        ListNode result = new ListNode();
        ListNode current = result;
        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + remainder;
            remainder = sum / 10;
            current.next = new ListNode(sum % 10);
            l1 = l1.next;
            l2 = l2.next;
            current = current.next;
        }
        while (l1 != null) {
            sum = l1.val + remainder;
            remainder = sum / 10;
            sum = sum % 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            sum = l2.val + remainder;
            remainder = sum / 10;
            sum = sum % 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            l2 = l2.next;
        }
        if (remainder == 1) {
            current.next = new ListNode(remainder);
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(1);
        ListNode listNode = addTwoNumbers(l1, l2);
        listNode.traverse(listNode);
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


    void traverse(ListNode listNode) {
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
        System.out.println();
    }

}
