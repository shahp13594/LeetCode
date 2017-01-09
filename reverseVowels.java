
public class reverseVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdef";
		StringBuilder sb=new StringBuilder(s);
		for(int i=0,j=s.length()-1;i<j;)
		{
			if(!isvowel(sb.charAt(i))) 
				{	
					i++;
					continue;
				}
			if(!isvowel(sb.charAt(j)))
				{
				j--;
				continue;
				}
					  
				char c=sb.charAt(i);
				sb.replace(i,i+1, sb.charAt(j)+"");
				sb.replace(j,j+1,c+"");	
				i++;
				j--;
			
		
		}
		System.out.println(sb);
	}

	private static boolean isvowel(char i) {
		// TODO Auto-generated method stub
		if(i=='a' || i=='e' || i=='i' || i=='o' || i=='u' || i=='A' || i=='E' || i=='I' || i=='O' || i=='U')
			return true;
		return false;
	}

}
