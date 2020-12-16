/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        ListNode prev = head;
        ListNode forward = head;
        
        while(n-- > 0) {
            forward = forward.next;
        }
        
        while(forward!= null) {
            prev = curr;
            curr = curr.next;
            forward = forward.next;
        }

        if(curr == head) {
            return head.next;
        }
        
        prev.next = curr.next;
        
        
        return head;
    }
}