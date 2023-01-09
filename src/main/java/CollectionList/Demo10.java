package CollectionList;

import java.util.ArrayList;

public class Demo10 {

	public static void main(String[] args) {
		ArrayList arr1 =new ArrayList();
		arr1.add('A');
		arr1.add('B');
		arr1.add('C');
		arr1.add('D');
		
		System.out.println(arr1);//A B C D
		
		arr1.add(2, "TestnG");
		System.out.println(arr1);//A B TestNG C D
		
		arr1.set(2, "selenium");
		System.out.println(arr1);//A B Selenium C D

	}

}
