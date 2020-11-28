// PS: https://leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/
// 83. Remove Duplicates from Sorted List

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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        
        if(head.val == head.next.val) {
            head.next = head.next.next;
            ListNode node = deleteDuplicates(head);
        } else {
            ListNode node = deleteDuplicates(head.next);            
        }
        
        return head;
    }
}