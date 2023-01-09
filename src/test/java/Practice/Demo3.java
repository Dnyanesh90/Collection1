package Practice;

import java.util.HashSet;

public class Demo3 {

	public static void main(String[] args) {
		String a = "cucumber";

		HashSet hs1 = new HashSet();
		String c="";
		String b="";

		for (int i = 0; i < a.length(); i++) 
		{
			if (hs1.add(a.charAt(i))) 
			{
				c=c+a.charAt(i);
			}
			else {
				b=b+a.charAt(i);
			}
		}
		
		System.out.println(c);
		System.out.println(b);

	}

}
