package l4questions;

public class q14deleteMiddleNode {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public ListNode deleteMiddle(ListNode head) {
            if(head == null){
                return null;
            }
            if(head.next == null){
                return null;
            }
            ListNode slow = null;
            ListNode faster = head;
            while(faster != null && faster.next != null){
                if(slow == null){
                    slow = head;
                }else{
                    slow = slow.next;
                }
                faster = faster.next.next;
            }
            slow.next = slow.next.next;
            return head;
        }
    }
}
