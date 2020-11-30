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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode nextNode = head.next;
        
        oddEven(head);
        
        ListNode node = head;
        while(node.next != null) {
            node = node.next;
        }
        
        node.next = nextNode;
        
        return head;
    }
    
    
    public void oddEven(ListNode node) {
        if(node == null || node.next == null) {
            return;
        }
        
        ListNode nextElem = node.next;
        node.next = node.next.next;
        oddEven(nextElem);
    }
}