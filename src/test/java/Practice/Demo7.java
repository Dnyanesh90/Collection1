package Practice;

import java.util.HashSet;

public class Demo7 {

	public static void main(String[] args) {
		String a = "cucumber";

		char[] abc = a.toCharArray();

		HashSet hs = new HashSet();

		for (int i = 0; i < abc.length; i++) {
			hs.add(abc[i]);
		}

		Object[] abcd = hs.toArray();
		
		for(Object o:abcd)
		{
			System.out.print(o);
		}

	}

}
