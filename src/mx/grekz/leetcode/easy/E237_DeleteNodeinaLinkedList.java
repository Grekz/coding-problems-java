package mx.grekz.leetcode.easy;

import mx.grekz.leetcode.helpers.ListNode;

/**
 * 
 * @author grekz
 *
 */
public class E237_DeleteNodeinaLinkedList {

    public void deleteNode(ListNode node) {
        if(node == null || node.next == null) return;
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
