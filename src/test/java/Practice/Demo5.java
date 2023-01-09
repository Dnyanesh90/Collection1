package Practice;

import java.util.HashSet;

public class Demo5 {

	public static void main(String[] args) {
		String a = "java";
		HashSet hs = new HashSet();
		HashSet hs1 = new HashSet();
		
		for(int i=0;i<a.length();i++)
		{
			if(hs.add(a.charAt(i)))
			{
				hs.add(a.charAt(i));
			}
			else {
				hs1.add(a.charAt(i));
			}
			
		}
		
		System.out.println(hs1);

	}

}
