/*MERGE TWO SORTED LISTS
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
 //CODE//
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
         if(l1==null && l2==null)
         return null;
           if(l1==null)
        return l2;
        if(l2==null)
        return l1;
        
        ListNode result=new ListNode(0);
        ListNode temp=result;
        while(l1!=null && l2!=null)
        {
            if(l1.val<=l2.val)
            {
                temp.next=l1;
                l1=l1.next;
            }
            else
            {
                temp.next=l2;
                l2=l2.next;
            }
            temp=temp.next;
        }
        if(l1!=null)
        temp.next=l1;
        if(l2!=null)
        temp.next=l2;
        
        return result.next;
    }
}