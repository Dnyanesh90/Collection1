package HashLinkedset;

import java.util.LinkedHashSet;

public class Demo1 {

	public static void main(String[] args) {
		String a = "cucumber";
		char[] abc = a.toCharArray();

		LinkedHashSet s = new LinkedHashSet();

		String b = "";//cumber
		String c = "";//cu

		for (int i = 0; i < abc.length; i++) 
		{
			if (s.add(abc[i])) 
			{		//"cumbe"+r
				b = b + abc[i];//
			} 
			else {
				
				c = c + abc[i];
			}
		}

		System.out.println(b);//cumber

		System.out.println(c);//cu


	}

}
