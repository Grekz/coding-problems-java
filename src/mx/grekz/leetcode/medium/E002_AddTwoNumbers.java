package mx.grekz.leetcode.medium;

import mx.grekz.leetcode.helpers.ListNode;

/**
 * https://leetcode.com/problems/add-two-numbers/description/
 * @author grekz
 *
 */
public class E002_AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode res = new ListNode(-1), head = res;
		int sum = 0, carry = 0;
		while (l1 != null || l2 != null || carry > 0) {
			sum = carry;
			if (l1 != null) {
				sum = sum + l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum = sum + l2.val;
				l2 = l2.next;
			}
			if (sum > 9) {
				carry = 1;
				sum = sum - 10;
			} else {
				carry = 0;
			}
			res.next = new ListNode(sum);
			res = res.next;
		}
		return head.next;
	}
}
