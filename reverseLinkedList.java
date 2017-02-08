/*REVERSE LINKED LIST
Reverse a singly linked list.*/

//CODE//
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head==null || head.next==null)
        return head;
        ListNode p=null;
       ListNode q;
        while(head!=null)
        {
            q=head.next;
            head.next=p;
            p=head;
            head=q;
        }
       return p;
    }
}