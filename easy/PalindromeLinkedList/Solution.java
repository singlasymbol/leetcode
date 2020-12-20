// https://leetcode.com/problems/palindrome-linked-list/submissions/
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
    ListNode findMid(ListNode node) {
        ListNode curr = node;
        ListNode fast = node;
        
        while(fast != null && fast.next != null) {
            curr = curr.next;
            fast = fast.next.next;
        }
        
        return curr;
    }
    
    ListNode reverseAfterMid(ListNode node) {
        
        ListNode prev = null;
        ListNode curr = node;
        ListNode forward = node;
        
        while(curr != null) {
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        
        return prev;
    }
    
    public boolean isPalindrome(ListNode head) {
        ListNode mid = findMid(head);
        // System.out.println("mid " + mid.val);
        
        ListNode reversedHead = reverseAfterMid(mid);
        // System.out.println("reversedHead " + reversedHead.val);

        ListNode curr = head;
        
        while(curr != mid && reversedHead != null) {
            if(curr.val != reversedHead.val) {
                return false;
            }
            curr = curr.next;
            reversedHead = reversedHead.next;
        }
        
        return true;
    }
}