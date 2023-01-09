package Stack;

import java.util.Stack;

public class Demo2 {

	public static void main(String[] args) {
		Stack s =new Stack();
		s.push("java");
		s.push("1000");
		s.push("3000");
		s.push("2000");
		s.push("2000");
		s.push("4000");
		
		System.out.println(s);
		
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.empty());
//		
		System.out.println(s.search("java"));
		System.out.println(s);
		
	}

}
