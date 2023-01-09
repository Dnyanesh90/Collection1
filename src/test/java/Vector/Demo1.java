package Vector;

import java.util.Vector;

public class Demo1 {

	public static void main(String[] args) {
		Vector v =new Vector();
		v.add("100");
		v.add("200");
		v.add("300");
		v.add("400");
		
		System.out.println(v);
		v.addElement("500");
		System.out.println(v);
		v.add(3,"700");
		System.out.println(v);

	}

}
