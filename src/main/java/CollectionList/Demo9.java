package CollectionList;

import java.util.ArrayList;

public class Demo9 {

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
		arr3.add(1);
		arr3.add(2);
		arr3.add(3);
		arr3.add(4);
		
		arr1.addAll(arr3);
		
		Object [] a =arr1.toArray();
		
		for(Object o:a)
		{
			System.out.println(o);
		}

	}

}
