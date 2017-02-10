/*MISSING NUMBER
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.*/

//CODE//
public class Solution {
    public int missingNumber(int[] nums) {
        
        int sum = nums.length*(nums.length + 1)/2;
        for(int i=0;i<nums.length;i++)
        {
            sum -=nums[i];
        }
        return sum;
        
    }
}