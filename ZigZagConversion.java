import java.nio.Buffer;


public class ZigZagConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="PAYPALISHIRING";
		char ch[]=s.toCharArray();
		int numRows=3;
		StringBuffer[] sb=new StringBuffer[numRows];
		for(int i=0;i<numRows;i++)
			sb[i]=new StringBuffer();
		int j=0;
		while(j<s.length())
		{
		for(int i=0;j<s.length()&& i<numRows;i++)
			sb[i].append(ch[j++]);
		for(int i=numRows-2;i>=1 && j<s.length();i--)
			sb[i].append(ch[j++]);
		
		}
		for(int i=1;i<sb.length;i++)
			sb[0].append(sb[i]);
		System.out.println(sb[0].toString());
		
	}

}
