package Mapainterface;

import java.util.HashMap;

public class Demo6 {

	public static void main(String[] args) {

		HashMap m =new HashMap ();
		
		m.put(1, "Shweta");
		m.put(2, "Ajit");
		m.put(3, "Adinath");
		m.put(4, "Geetesh");
		m.put(5, "Manoj");

		HashMap m1 =new HashMap();
		m1.put("firstName", "Ashish");
		m1.put(3, "Selenium");
		m1.put(4, "testNG");
		m1.put(5, "Cucumber");
		
		System.out.println(m);
		m.putAll(m1);
		System.out.println(m);
		

	}

}
