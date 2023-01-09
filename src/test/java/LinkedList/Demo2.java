package LinkedList;

import java.util.LinkedList;

public class Demo2 {

	public static void main(String[] args) {
		LinkedList ls1 =new LinkedList();
		ls1.add(100);
		ls1.add(200);
		ls1.add(300);
		ls1.add(400);
		
		
		LinkedList ls2 =new LinkedList();
		ls2.add("A");
		ls2.add("B");
		ls2.add("C");
		ls2.add("D");
		
		System.out.println(ls1);
		ls1.addAll(ls2);
		System.out.println(ls1);	
		//ls1.removeAll(ls2);
		ls1.retainAll(ls2);
		System.out.println(ls1);
		
		
		System.out.println(ls1);	
		ls1.remove(4);
		ls1.remove("C");
		System.out.println(ls1);

	}

}
