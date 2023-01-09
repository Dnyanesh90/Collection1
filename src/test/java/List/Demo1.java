package List;

import java.util.ArrayList;

public class Demo1 {

	public static void main(String[] args) {
		ArrayList arr =new ArrayList();
		arr.add("Selenium");
		arr.add("TestNG");
		arr.add("POM");
		
		
		
		System.out.println(arr.addAll(arr));
		System.out.println(arr.add(arr));
		System.out.println(arr.containsAll(arr));
		System.out.println(arr.size());
		arr.add(2, "JAVA");
		System.out.println(arr);
		arr.remove("POM");
		System.out.println(arr.remove("POM"));

	}

}
