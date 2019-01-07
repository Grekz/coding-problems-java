package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E876_MiddleoftheLinkedList {

    public ListNode middleNode(ListNode head) {
        int mid = getSize(head, 0) / 2;
        return getKth(head, 0, mid);
    }

    private int getSize(ListNode node, int n) {
        return node == null ? n : getSize(node.next, n + 1);
    }

    private ListNode getKth(ListNode node, int n, int k) {
        return n == k ? node : getKth(node.next, n + 1, k);
    }
}