package mx.grekz.leetcode.easy;

import mx.grekz.leetcode.helpers.ListNode;

public class E203_RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode fakeHead = new ListNode(-1), cur = fakeHead ;
        fakeHead.next = head;
        while(cur.next != null){
            if (cur.next.val == val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return fakeHead.next;
    }
}
