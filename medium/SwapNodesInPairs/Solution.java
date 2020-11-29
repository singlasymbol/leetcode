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
    public ListNode swapPairs(ListNode head) {
        head = getNextPair(head);
        return head;
    }
    
    public ListNode getNextPair(ListNode firstNode) {
        if(firstNode == null || firstNode.next == null){
            return firstNode;
        }
        
        ListNode secondNode = firstNode.next;
        ListNode secondNodeNext = secondNode.next;
        secondNode.next = firstNode;
        firstNode.next = getNextPair(secondNodeNext);
        return secondNode;
    }
    
}
