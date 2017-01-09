import java.util.*;
public class RepeatedSubstringPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		String str=sc.nextLine();
		int length=str.length();
		for(int i=length/2;i>=1;i--)
		{
			if(length%i==0)
			{
				int m=length/i;
				String s=str.substring(0,i);
				int j;
				for(j=1;j<m;j++)
					{
					if(!s.equals(str.substring(j*i,i+j*i)))
						
						break;
					}
				if(j==m)
					System.out.println("true");
					}
				
		}
		
		}

}
