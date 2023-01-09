package Stack;

import java.util.Enumeration;
import java.util.Stack;

public class Demo4 {

	public static void main(String[] args) {
		Stack s =new Stack();
		s.push("java");
		s.push("100");
		s.push("200");
		s.push("300");
		s.push("400");
		s.push("500");
		
		System.out.println(s);
		
		Enumeration a =s.elements();
		
		while(a.hasMoreElements())
		{
			System.out.println(a.nextElement());
		}

	}

}
