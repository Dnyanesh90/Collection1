package CollectionList;

import java.util.ArrayList;

public class Demo5 {

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>();

		arr.add("Selenium");
		arr.add("TestnG");
		arr.add("Java Script Executor");
		arr.add("Cucumber");
		arr.add("selenium");
		arr.add("GitHub");

		System.out.println(arr.size());
		System.out.println(arr.isEmpty());
		
		System.out.println(arr);
		
		arr.clear();
		
		System.out.println("array value is not present "+arr);

	int a =arr.indexOf("selenium");
		System.out.println(a);
		System.out.println(arr.contains("Cucumber"));


	}

}
