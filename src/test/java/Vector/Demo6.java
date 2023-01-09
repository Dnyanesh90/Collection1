package Vector;

import java.util.HashSet;
import java.util.Iterator;

public class Demo6 {

	public static void main(String[] args) {
		HashSet v =new HashSet();
		v.add("A");
		v.add(null);
		v.add(100);
		v.add("A");
		
		Iterator it =v.iterator();
	
		while(it.hasNext())
		{
		
			System.out.println(it.next());
			it.remove();
		}
	}

}
