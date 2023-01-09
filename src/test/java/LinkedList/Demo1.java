package LinkedList;

import java.util.LinkedList;

public class Demo1 {

	public static void main(String[] args) {
		LinkedList ls =new LinkedList();
		ls.add(1000);
		ls.add(null);
		ls.add(1000);
		ls.add("Selenium");
		ls.add(true);
		ls.add(23.434f);
		
		System.out.println(ls.get(4));
		System.out.println(ls.contains(1000));
		System.out.println(ls.size());
		System.out.println(ls.isEmpty());
		
		ls.clear();
		System.out.println(ls.size());

	}

}
