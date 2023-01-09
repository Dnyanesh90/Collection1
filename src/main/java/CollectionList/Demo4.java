package CollectionList;

import java.util.ArrayList;

public class Demo4 {

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
		
		for(String abc: arr)
		{
			System.out.println(abc);
		}
		
		
		
//		for(Object o:arr)
//		{
//			System.out.println(o);
//		}
				
//		for(int i=0;i<arr.size();i++)
//		{
//			System.out.println(arr.get(i));
//		}

	}

}
