/**
Partition List
Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
You should preserve the original relative order of the nodes in each of the two partitions.

For example,
Given 1->4->3->2->5->2 and x = 3,
return 1->2->2->4->3->5.
 */ 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        
       if(head==null)
        return null;
        ListNode List1=new ListNode(0);
        ListNode List2=new ListNode(0);
        ListNode l1=List1;
        ListNode l2=List2;
        ListNode temp=head;
        while(temp!=null)
        {
            if(temp.val<x)
            {
            l1.next=temp;
            l1=temp;
            }
            else
            {
                l2.next=temp;
                l2=temp;
                
            }
            temp=temp.next;
        }
       l2.next=null;
       l1.next=List2.next;
       return List1.next;
    }
   
}