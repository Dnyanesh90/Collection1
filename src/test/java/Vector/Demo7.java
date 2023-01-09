package Vector;

import java.util.LinkedList;
import java.util.ListIterator;

public class Demo7 {

	public static void main(String[] args) {
		LinkedList<String> t1 = new LinkedList<String>();
		t1.add("A");
		t1.add("B");
		t1.add("C");
		t1.add("D");
		
		ListIterator<String> it =t1.listIterator();
		
		it.add("E");
		
		while(it.hasNext())
		{
			String a =it.next();
			
			
			if(a.equals("C"))
			{
				it.set("E");
			}
		}
		
		System.out.println(t1);


	}

}
