package mx.grekz.leetcode.medium;

import mx.grekz.leetcode.helpers.ListNode;

public class E019_RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n < 1)
            return head;
        int size = 0;
        ListNode walk = head;
        while(walk.next != null){
            size++;
            walk = walk.next;
        }
        int index = size - (n - 1);
        if(index < 1){
            head = head.next;
            return head;
        }
        walk = head;
        int i = 1;
        while(walk.next != null){
            if(i++ == index){
                walk.next = walk.next.next;
                break;
            }
            walk = walk.next;
        }
        return head;
    }
}
