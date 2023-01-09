package Vector;

import java.util.Vector;

public class Demo4 {

	public static void main(String[] args) {
		Vector v =new Vector();
		v.add("100");
		v.add("200");
		v.add("300");
		v.add("400");//selenium
		
		System.out.println(v);
		v.add("500");
		System.out.println(v);
		v.addElement("600");
		System.out.println(v);
		v.set(3, "Selenium");
		System.out.println(v);
		//100 200 300 selenium 500 600
		
		System.out.println(v.get(4));
		System.out.println(v.elementAt(3));
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
		System.out.println(v.remove(3));
		System.out.println(v.removeElement("600"));

	}

}
