// PS : 1290. Convert Binary Number in a Linked List to Integer
// 1290. Convert Binary Number in a Linked List to Integer

// Difference is no global variable

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
    // int integerValue = 0;
    
    public int [] traverse(ListNode node, int [] arr) {
        if(node == null) {
            arr[0] = 0;
            arr[1] = 0;
            return arr; 
        }
        
        arr = traverse(node.next, arr);
        
        if(node.val == 1){
            arr[0] = arr[0] + (int)Math.pow(2, arr[1]);
        }
        arr[1] = arr[1] + 1;
        return arr;
    }
    
    public int getDecimalValue(ListNode head) {
        int [] res = new int[2];
        res = traverse(head, res);
        return res[0];
    }
}