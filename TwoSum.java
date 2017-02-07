/*
TWO SUM
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
*/

// CODE//
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int result[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                result[0]=(int)map.get(nums[i]);
                result[1]=i;
                break;
            }
            else
            {
                map.put(target-nums[i],i);
            }
        }
       return result;
    }
}