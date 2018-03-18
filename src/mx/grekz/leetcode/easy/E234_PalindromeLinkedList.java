package mx.grekz.leetcode.easy;

import mx.grekz.leetcode.helpers.ListNode;

/**
 * @author grekz
 */
public class E234_PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        if(head.next.next == null) return head.next.val == head.val;
        ListNode fast = head, slow = head, rev = null;
        while ( fast != null && fast.next != null ) {
            fast = fast.next.next;
            ListNode tmp = slow;
            slow = slow.next;
            tmp.next = rev;
            rev = tmp;
        }
        // if is odd
        if ( fast != null ) {
            slow = slow.next;
        }
        while ( rev != null && rev.val == slow.val ){
            rev = rev.next;
            slow = slow.next;
        }
        return rev == null;
    }
}