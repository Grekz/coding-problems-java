package mx.grekz.leetcode.medium;

import mx.grekz.leetcode.helpers.ListNode;

/**
 * @author grekz
 */
public class E328_OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {
        if ( head != null ) {
            ListNode res = head, even = head.next, evenHead = head.next;
            while ( even != null && even.next != null ) {
                res.next = res.next.next;
                even.next = even.next.next;
                res = res.next;
                even = even.next;
            }
            res.next = evenHead;
        }
        return head;
    }
}