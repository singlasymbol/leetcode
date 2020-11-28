// PS : 1290. Convert Binary Number in a Linked List to Integer
// 1290. Convert Binary Number in a Linked List to Integer


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
    int integerValue = 0;
    
    public int traverse(ListNode node) {
        if(node == null) {
            return 0;
        }
        
        int index = traverse(node.next);
        
        if(node.val == 1){
            integerValue = integerValue + (int)Math.pow(2, index);    
        }
        
        return index + 1;
    }
    
    public int getDecimalValue(ListNode head) {
        int index = traverse(head);
        return integerValue;
    }
}