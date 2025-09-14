package l4questions;
public class q12oddEven {

      // Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode oddEvenList(ListNode head) {
            if(head == null){
                return null;
            }
            if(head.next == null){
                return head;
            }
            ListNode oddNode = head;
            ListNode evenNode = head.next;
            ListNode joint = evenNode;
            while(oddNode.next != null && evenNode.next != null){
                if(evenNode.next != null){
                    oddNode.next = oddNode.next.next;
                    oddNode = oddNode.next;
                }
                if(oddNode.next != null){
                    evenNode.next = evenNode.next.next;
                    evenNode = evenNode.next;
                }
            }

            oddNode.next = joint;
            evenNode.next = null;
            return head;
        }
    }
}
