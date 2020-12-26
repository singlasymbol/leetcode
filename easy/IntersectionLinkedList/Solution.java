// https://leetcode.com/problems/intersection-of-two-linked-lists/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int listOneLength = 0, listTwoLength = 0;
        
        ListNode curr = headA;
        while(curr != null) {
            listOneLength++;
            curr = curr.next;
        }
        
        curr = headB;
        while(curr != null) {
            listTwoLength++;
            curr = curr.next;
        }
        
        if(listOneLength > listTwoLength) {
            int diff = listOneLength - listTwoLength;
            while(diff-- > 0) {
                headA = headA.next;
            }
        } else if (listOneLength < listTwoLength) {
            int diff = listTwoLength - listOneLength;
            while(diff-- > 0) {
                headB = headB.next;
            }
        }
        
        while(headA != null && headB != null && headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        
        return headA;
        
        
    }
}