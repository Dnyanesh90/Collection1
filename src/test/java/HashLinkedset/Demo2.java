package HashLinkedset;

import java.util.LinkedHashSet;

public class Demo2 {

	public static void main(String[] args) {
		String a = "cucumber";
		char[] abc = a.toCharArray();

		LinkedHashSet s = new LinkedHashSet();

		for (int i = 0; i < 3; i++) 
		{
				char p =abc[i];//c
				System.out.println(p);
				System.out.println(s.add(p));//true true false
		}
		
		
		System.out.println(s);//cu

	}

}
