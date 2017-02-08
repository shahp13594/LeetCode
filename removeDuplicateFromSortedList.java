/*REMOVE DUPLICATES FROM SORTED LIST
Given a sorted linked list, delete all duplicates such that each element appear only once.
*/

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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
        return head;
        ListNode node=head;
        LinkedHashSet<Integer> map=new LinkedHashSet<>();
        while(node!=null)
        {
           map.add(node.val);
           node=node.next;
        }
         node=head;
        for(Integer i: map)
        {
        ListNode node1=new ListNode(i);
        node.next=node1;
        node=node.next;
    }
    return head.next;
}}