/* NUMBER OF SEGMENTS IN A STRING 
Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.
Please note that the string does not contain any non-printable characters. */

//CODE//
import java.util.StringTokenizer;
public class Solution {
    public int countSegments(String s) {
         StringTokenizer st=new StringTokenizer(s);
         return st.countTokens();
    
    }
}