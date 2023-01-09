package HashLinkedset;

import java.util.LinkedHashSet;

public class Demo3 {

	public static void main(String[] args) {
		String a = "cucumber";
		char[] abc = a.toCharArray();

		LinkedHashSet s = new LinkedHashSet();
		
		String b="";
		String c="";

		for (int i = 0; i < 3; i++) 
		{
			
			if(s.add(abc[i]))
			{
				b=b+abc[i];
			}
			else
			{
				c=c+abc[i];
			}
		}

		System.out.println(b);
		System.out.println(c);

	}

}
