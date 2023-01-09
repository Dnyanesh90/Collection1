package Vector;

import java.util.Vector;

public class Demo2 {

	public static void main(String[] args) {
		Vector v =new Vector();
		v.add("100");
		v.add("200");
		v.add("300");
		v.add("400");
		
		Vector v1 =new Vector();
		v1.add("A");
		v1.add("B");
		v1.add("C");
		v1.add("D");
		
		System.out.println(v1);
		v1.addAll(v);
		System.out.println(v1);//A B C D 100 200 300 400
		
		v1.removeAll(v);
		v1.retainAll(v);
//		
		System.out.println(v1.containsAll(v));
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		System.out.println(v1.isEmpty());
		System.out.println("-------------------------");
		System.out.println(v1.clone());

	}

}
