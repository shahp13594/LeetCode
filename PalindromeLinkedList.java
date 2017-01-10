/**  Palindrome Linked List
Given a singly linked list, determine if it is a palindrome.

Follow up:
Could you do it in O(n) time and O(1) space?
*/

/** Code */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        
        if(head==null || head.next==null)
        return true;
        
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode sH=slow.next;
        slow.next=null;
        
        ListNode p1=sH;
        ListNode p2=p1.next;
        
        while(p1!=null && p2!=null)
      {  ListNode temp=p2.next;
        p2.next=p1;
        p1=p2;
        p2=temp;
    }
    sH.next=null;
    
    ListNode p=p1;
    ListNode q=head;
    while(p!=null)
    {
        if(p.val!=q.val)
        return false;
        
        p=p.next;
        q=q.next;
    }
    return true;
}
}