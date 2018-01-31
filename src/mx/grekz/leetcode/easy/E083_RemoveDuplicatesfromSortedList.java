package mx.grekz.leetcode.easy;

import mx.grekz.leetcode.helpers.ListNode;

public class E083_RemoveDuplicatesfromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode walk = head;
        while(walk.next != null){
            int curVal = walk.val;
            if(curVal == walk.next.val)
                walk.next = walk.next.next;
            else
                walk = walk.next;
        }
        return head;
    }
}
