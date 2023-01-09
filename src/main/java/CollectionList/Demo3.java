package CollectionList;

import java.util.ArrayList;

public class Demo3 {

	public static void main(String[] args) {

		ArrayList arr =new ArrayList();
		
		arr.add("selenium");
		arr.add(1000);
		arr.add(true);
		arr.add(12.34f);
		arr.add('A');
		
		System.out.println(arr);
		arr.remove("selenium");//remove method from Collection
		System.out.println(arr);//1000 true 12.34 A
		arr.remove(1);//remove method from List interface
		
		System.out.println(arr);

	}

}
