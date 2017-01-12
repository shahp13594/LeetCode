/**
Linked List Cycle II
Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Note: Do not modify the linked list.

Follow up:
Can you solve it without using extra space?
*/
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 
 /** Code */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        
        if(fast==slow)
        {
            ListNode slow2=head;
            while(slow2!=slow)
            {
                slow2=slow2.next;
                slow=slow.next;
            }
         return slow2;
            
        }
        
       
        } 
       return null;
    }
}