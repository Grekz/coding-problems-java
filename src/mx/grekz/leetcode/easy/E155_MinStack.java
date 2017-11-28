package mx.grekz.leetcode.easy;

public class E155_MinStack {
    private Node head;
    
    /** initialize your data structure here. */
    public E155_MinStack() {
    }
    
    public void push(int x) {
        head = new Node( x, head == null ? x : Math.min(x, head.min), head );
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
    private class Node{
        int val, min;
        Node next; 
        public Node(int val, int min, Node next){
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */