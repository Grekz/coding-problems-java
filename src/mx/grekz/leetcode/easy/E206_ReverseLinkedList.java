package mx.grekz.leetcode.easy;

import mx.grekz.leetcode.helpers.ListNode;

public class E206_ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode res = null, cur;
        while(head!=null){
            cur=head;
            head=head.next;
            cur.next=res;
            res=cur;
        }
        return res;
    }
}
