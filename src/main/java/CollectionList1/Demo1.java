package CollectionList1;

import java.util.ArrayList;

public class Demo1 {

	public static void main(String[] args) {
		ArrayList arr1 =new ArrayList();
		arr1.add("Rukmini");
		arr1.add("Savita");
		arr1.add("Sangita");
		arr1.add("Dnyanesh");
		arr1.add("Janhavi");
		arr1.add("Parmesh");
		
		ArrayList arr2 =new ArrayList();
		arr2.add("Bhargude");
		arr2.add("Tumberphale");
		arr2.add("Pokale");
		arr2.add("Kadam");
		
		System.out.println(arr1.size());
		System.out.println(arr1.get(3));
		System.out.println(arr1.addAll(arr2));
		
		arr1.add(arr2);
		System.out.println(arr1);
		
		arr1.remove(2);
		System.out.println(arr1);
		
		arr1.contains(arr2);
		System.out.println(arr1);
		
		arr1.retainAll(arr2);
		System.out.println(arr1);
		System.out.println(arr1.isEmpty());
		
		System.out.println(arr1);
		System.out.println(arr2);
		
		arr1.add(3, "Nanded");
		System.out.println(arr1);
		
		arr2.add(3, "Prithviraj");
		System.out.println(arr2);
		
		arr2.retainAll(arr1);
        Object [] abc =arr1.toArray();
		
		for(Object pqr: abc)
		{
			System.out.println(pqr);
		}
		
		
		for(int i=0;i<abc.length;i++)
		{
			System.out.println(abc[i]);
		}
		

	}

}
