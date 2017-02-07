/* REVERSE STRING
Write a function that takes a string as input and returns the string reversed. */

//CODE//
public class Solution {
    public String reverseString(String s) {
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString();
        
    }
}