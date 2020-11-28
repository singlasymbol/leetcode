// PS : 92. Reverse Linked List II
// https://leetcode.com/problems/reverse-linked-list-ii/
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
    
    private ListNode reverseLinkedList(ListNode node, int n) {
        // System.out.println("Reversing from node.val " + node.val);
        ListNode prev = null;
        ListNode forward;
        ListNode curr = node;
        int lengthCount = n;

        while(lengthCount-- > 0) {
            node = node.next;
        }
        
        // System.out.println("Reversing till node.val " + node.val);
        prev = node;
        
        int iterations = 0;
        
        while(iterations != n) {
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
            iterations++;
        }
        // System.out.println("Returning  " + prev.val);

        return prev;
    }
    
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode node = head;
        
        if(m == 1) {
            ListNode temp = reverseLinkedList(node, n - m + 1);
            return temp;
        }
                
        int start = 1;
        while(start < m - 1) {
            node = node.next;
            start++;
        }
        

        node.next =  reverseLinkedList(node.next, n - m + 1);
        
        return head;
    }
}