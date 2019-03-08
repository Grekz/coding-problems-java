package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E143_ReorderList {
    public void reorderList(ListNode head) {
        if ( head == null || head.next == null) return;
        // get to the middle, reverse second part, mix parts
        ListNode slow = head, fast = head;
        while ( fast.next != null && fast.next.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = slow.next;
        ListNode cur;
        while (fast.next != null) {
            cur = fast.next;
            fast.next = cur.next;
            cur.next = slow.next;
            slow.next = cur;
        }
        fast = slow.next;
        cur = slow;
        slow = head;
        while ( slow != cur ) {
            cur.next = fast.next;
            fast.next = slow.next;
            slow.next = fast;
            slow = fast.next;
            fast = cur.next;
        }
    }
}