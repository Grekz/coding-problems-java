package mx.grekz.leetcode.easy;

import mx.grekz.leetcode.helpers.ListNode;

public class E021_MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if( l1 == null ) return l2;
        if( l2 == null ) return l1;
        ListNode temp = new ListNode(-1), walk = temp;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                walk.next = l1;
                l1 = l1.next;
            }else{
                walk.next = l2;
                l2 = l2.next;
            }
            walk = walk.next;
        }
        if(l1 == null) walk.next = l2;
        if(l2 == null) walk.next = l1;
        return temp.next;
    }
}
