package Practice1;

import java.util.LinkedHashSet;

public class Demo5 {

	public static void main(String[] args) {
		String a="CUCUMBER";
		
		LinkedHashSet set =new LinkedHashSet();
		String b="";
		String c="";
		
		
		for(int i=0;i<a.length();i++)
		{
			if(set.add(a.charAt(i))) 
			{
				b=b+a.charAt(i);
			}
			else
			{
				c=c+a.charAt(i);
			}
		}
		System.out.println(b);
		System.out.println(c);
		
	}

}
