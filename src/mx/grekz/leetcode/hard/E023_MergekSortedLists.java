package mx.grekz.leetcode.hard;

import mx.grekz.leetcode.helpers.ListNode;

public class E023_MergekSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        return merge( lists, 0, lists.length - 1 );
    }
    private ListNode merge(ListNode[] lists, int ini, int las) {
        if ( ini > las ) { return null; }
        if ( ini == las ) { return lists[ini]; }
        int mid = ( ini + las ) / 2;
        ListNode a = merge(lists, ini, mid),
        b = merge(lists, mid+1, las),
        tmp = new ListNode(0),
        cur = tmp;
        while ( a != null && b != null ) {
            if ( a.val < b.val ) {
                cur.next = a;
                a = a.next;
            }else{
                cur.next = b;
                b = b.next;                
            }
            cur = cur.next;
        }
        cur.next = a != null ? a : b;
        return tmp.next;
    }
}
