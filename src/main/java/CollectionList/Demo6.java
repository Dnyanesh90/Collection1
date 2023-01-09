package CollectionList;

import java.util.ArrayList;

public class Demo6 {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add("TestnG");
		arr.add("selenium");
		arr.add("Java Script Executor");
		arr.add("Cucumber");
		arr.add("selenium");
		arr.add("GitHub");

		ArrayList arr1 =new ArrayList();
		arr1.add(100);
		arr1.add(200);
		arr1.add(300);
		arr1.add(400);
		arr1.add(500);
		
		System.out.println(arr1);
		
		arr1.addAll(arr);
		
		System.out.println(arr1);
		
		arr1.removeAll(arr);
		
		System.out.println(arr1);
		arr.add(arr1);
		System.out.println(arr);
		arr.removeAll(arr1);
		System.out.println(arr);
	}

}
