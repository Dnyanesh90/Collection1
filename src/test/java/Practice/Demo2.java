package Practice;

import java.util.HashSet;

public class Demo2 {

	public static String duplicateValue(String a) {
		HashSet hs1 = new HashSet();
		String c = "";
		String b = "";

		for (int i = 0; i < a.length(); i++) {
			if (hs1.add(a.charAt(i))) {
				c = c + a.charAt(i);
			} else {
				b = b + a.charAt(i);
			}
		}

		return b;
	}

	public static void main(String[] args) {

		String  p =Demo2.duplicateValue("cucumber");
		
		System.out.println(p);

	}

}
