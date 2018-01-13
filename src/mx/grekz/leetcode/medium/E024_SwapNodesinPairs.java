package mx.grekz.leetcode.medium;

import mx.grekz.leetcode.helpers.ListNode;

public class E024_SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode walk = res;
        while ( walk.next != null && walk.next.next != null ) {
            ListNode a = walk.next, b = walk.next.next;
            a.next = b.next;
            b.next = a;
            walk.next = b;
            walk = a;
        }        
        return res.next;
    }
}
