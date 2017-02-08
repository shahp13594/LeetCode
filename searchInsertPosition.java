/* SEARCH INSERT POSITION
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You may assume no duplicates in the array.*/

//CODE//
public class Solution {
    public int searchInsert(int[] nums, int target) {
        
       int i=0, j=nums.length-1,mid;
       while(i<=j)
       {
           mid=(i+j)/2;
           if(nums[mid]==target)
           return mid;
           else
           if(nums[mid]>target)
           j=mid-1;
           else
           i=mid+1;
       }
       return i;
    }
    
}