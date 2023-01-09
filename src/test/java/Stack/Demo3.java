package Stack;

import java.util.Stack;

public class Demo3 {

	public static void main(String[] args) {
		Stack s =new Stack();
		s.push("java");
		s.push("100");
		s.push("200");
		s.push("300");
		s.push("400");
		s.push("500");
		
		System.out.println(s);
		s.addElement("testNG");
		s.removeElement("400");
		s.removeElementAt(3);//java 100 200 400 500
		System.out.println(s.elementAt(4));
		System.out.println(s.firstElement());
		System.out.println(s.lastElement());
		s.removeAllElements();
		System.out.println(s);
//		
		System.out.println(s.capacity());
//			

	}

}
