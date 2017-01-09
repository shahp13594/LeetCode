import java.util.HashMap;
import java.util.Scanner;


public class RansomNote {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   String ransomNote=sc.nextLine();
   String magazine=sc.nextLine();
   boolean b=canConstruct(ransomNote,magazine);
   if(b)
	 System.out.println("true");
   else
	 System.out.println("false");

   
	}

	private static boolean canConstruct(String ransomNote, String magazine) {
		// TODO Auto-generated method stub
		if(ransomNote.length()>magazine.length())
			return false;
		if(ransomNote == null || ransomNote.isEmpty()) 
		    return true;

		if(magazine == null || magazine.isEmpty())
		    return false;
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		char ch[]=ransomNote.toCharArray();
		for(Character c:ch)
		{
			Integer n=map.get(c);
			n=(n==null)?1:++n;
			map.put(c, n);
		}
		System.out.println(map);
		for(int i=0;i<magazine.length();i++)
		{
			char c=magazine.charAt(i);
			if(!map.containsKey(c))
				continue;
			Integer count=map.get(c);
			count--;
			if(count<=0)
				map.remove(c);
			else
			map.put(c, count);
			if(map.size()==0)
				return true;
			
		}
		return false;
		}

}
