package Mapainterface;

import java.util.HashMap;

public class Demo7 {

	public static void main(String[] args) {
		HashMap m = new HashMap();

		m.put(1, "Shweta");
		m.put(2, "Ajit");
		m.put(3, "Adinath");
		m.put(4, "Geetesh");
		m.put(5, "Manoj");

		System.out.println(m);
		
		HashMap m1 =new HashMap();
		
		m1.put(1, "Selenium");
		m1.put(2, "TestNG");
		m1.put(7, "POM");
		
		m.putAll(m1);
		
		System.out.println(m);

	}

}
