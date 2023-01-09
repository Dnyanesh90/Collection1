package CollectionList;

import java.util.ArrayList;

public class Demo7 {

	public static void main(String[] args) {
		ArrayList arr1 =new ArrayList();
		arr1.add('A');
		arr1.add('B');
		arr1.add('C');
		arr1.add('D');
		
		ArrayList arr2 =new ArrayList();
		arr2.add(100);
		arr2.add(200);
		arr2.add(300);
		arr2.add(400);
		
		System.out.println(arr1);
		arr1.addAll(arr2);
		System.out.println(arr1);
		
		ArrayList arr3 =new ArrayList();
		arr3.add("Pune");
		arr3.add("Mumbai");
		arr3.add("Delhi");
		
		arr1.addAll(arr3);
		System.out.println(arr1);
	
			
		arr1.retainAll(arr2);
		
		System.out.println(arr1);
		

	}

}
