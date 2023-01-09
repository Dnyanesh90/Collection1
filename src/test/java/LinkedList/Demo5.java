package LinkedList;

import java.util.LinkedList;

public class Demo5 {

	public static void main(String[] args) {
		LinkedList ls1 = new LinkedList();
		ls1.add(100);
		ls1.add(200);
		ls1.add(300);
		ls1.add(400);
		
		
		System.out.println(ls1);//100 200 300 400
		ls1.add("Selenium");
		System.out.println(ls1);//100 200 300 400 selenium
		
		ls1.add(2,"Jenkins");
		System.out.println(ls1);//100 200 Jenkins 300 400 selenium
		
		ls1.set(3, "POM");
		System.out.println(ls1);//100 200 jenkins pom 400 selenium
		
		System.out.println(ls1.indexOf(400));

	}

}
