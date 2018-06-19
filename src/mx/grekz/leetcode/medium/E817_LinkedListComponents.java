package mx.grekz.leetcode.medium;

import mx.grekz.leetcode.helpers.ListNode;
/**
 * @author grekz
 */
public class E817_LinkedListComponents {

    public int numComponents(ListNode head, int[] G) {
        java.util.Set<Integer> s = new java.util.HashSet<>();
        for ( int x : G ) s.add(x);
        int res = 0;
        while ( head != null ) {
            if ( s.contains(head.val) && ( head.next == null || !s.contains(head.next.val) ) )
                res++;
            head = head.next;
        }
        return res;
    }
}