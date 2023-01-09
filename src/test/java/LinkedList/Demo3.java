package LinkedList;

import java.util.LinkedList;

public class Demo3 {

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
		ls1.addAll(ls2);//100 200 300 400 A B C D 
		System.out.println(ls1);	
		
		//System.out.println(ls1.containsAll(ls2));
		
		System.out.println(ls1.removeFirst());
		
		System.out.println(ls1.removeLast());
		
		ls1.addFirst("TestNG");
		ls1.addLast("Jenkins");
		System.out.println(ls1.getFirst());
		System.out.println(ls1.getLast());
		

	}

}
