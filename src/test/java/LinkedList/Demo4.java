package LinkedList;

import java.util.LinkedList;

public class Demo4 {

	public static void main(String[] args) {
		LinkedList ls1 = new LinkedList();
		ls1.add(100);
		ls1.add(200);
		ls1.add(300);
		ls1.add(400);

		LinkedList ls2 = new LinkedList();
		ls2.add("A");
		ls2.add("B");
		ls2.add("C");
		ls2.add("D");

		// System.out.println(ls1);
		ls1.addAll(ls2);
		// print value by
		// enhance for loop

		for (Object o : ls1) {
			System.out.println(o);
		}

		// normal for loop

//		for(int i=0;i<ls1.size();i++)
//		{
//			System.out.println(ls1.get(i));
//		}

		// iterator()
		// listIterator()

//toArray()
//		Object [] abc =ls1.toArray();
//		
//		for(Object o: abc)
//		{
//			System.out.println(o);
//		}

	}

}
