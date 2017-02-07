/*REVERSE WORDS IN A STRING
Given an input string, reverse the string word by word.*/

//CODE//
public class Solution {
    public String reverseWords(String s) {
        String[] sub=s.trim().split("\\s+");
        String result="";
        for(int i=sub.length-1;i>=0;i--)
        {
            result+=sub[i]+" ";
        }
        return result.trim();
        
    }
}