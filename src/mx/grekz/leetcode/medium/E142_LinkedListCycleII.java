package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E142_LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while ( fast != null && fast.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
            if ( fast == slow ) {
                slow = head;
                while ( slow != fast ) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;            
            }
        }
        return null;
    }
}