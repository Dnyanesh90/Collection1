package Vector;

import java.util.Enumeration;
import java.util.Vector;

public class Demo5 {

	public static void main(String[] args) {
		Vector v =new Vector();
		v.add("A");
		v.add(null);
		v.add(100);
		v.add("A");
		
		
		Enumeration  a =v.elements();
		
		while(a.hasMoreElements())
		{
			Object c =a.nextElement();
			System.out.println(c);
		}

	}

}
