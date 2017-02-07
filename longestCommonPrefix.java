/* LONGEST COMMON PREFIX
Write a function to find the longest common prefix string amongst an array of strings. */

//CODE//
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs==null || strs.length==0)
        return "";
        String s=strs[0];
        for(int i=1;i<strs.length;i++)
        while(strs[i].indexOf(s)!=0)
        s=s.substring(0,s.length()-1);
        return s;
        
    }
}