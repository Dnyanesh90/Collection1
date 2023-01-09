package List;

import java.util.Vector;

public class Demo4 {

	public static void main(String[] args) {
		Vector v =new Vector();
		v.add("KADAM");
		v.add("TUMBERPHALE");
		v.add("POKALE");
		System.out.println(v);
		v.add(0, "BHARGUDE");
		System.out.println(v);
		v.remove("POKALE");
		System.out.println(v);
		Vector v1 =new Vector();
		v1.add(0, "A");
		v1.add(1, "B");
		v1.add(2, "C");
		v1.add(3, "D");
		v1.add(4, null);
		System.out.println(v1);
		v.add(v1);
		System.out.println(v);
		

	}

}
