package l4questions;

public class q13removeNthNodeFromEnd {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            while(head == null){
                return null;
            }
            if(head.next == null && n == 1){
                return null;
            }
            ListNode node = head;
            ListNode temp = null;
            for(int i=0; i<n; i++){
                node = node.next;
            }

            while(node != null){
                node = node.next;
                if(temp == null){
                    temp = head;
                }else{
                    temp = temp.next;
                }
            }

            if(temp == null){
                head = head.next;

            }
            else{
                temp.next = temp.next.next;
            }
            return head;
        }
    }
}
