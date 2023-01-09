package List;

import java.util.ArrayList;

public class Demo2 {

	public static void main(String[] args) {
		ArrayList arr =new ArrayList();
		arr.add(0, "KADAM");
		arr.add(1,"RUKMINI");
		arr.add(2, "SAVITA");
		arr.add(3, "SANGEETA");
		arr.add(4, "JANHAVI");
		
		System.out.println(arr);
		arr.add(2, "BHARGUDE");
		System.out.println(arr);
		arr.remove(2);
		System.out.println(arr);
		ArrayList arr1 =new ArrayList();
		arr1.add(0, "kadam");
		arr1.add(1, "BHARGUDE");
		arr1.add(2, "TUMBERPHALE");
		arr1.add(3, "POKALE");
		arr1.add(4, "KADAM");
		arr.addAll(arr1);
		System.out.println(arr);
		
		arr.removeAll(arr1);
		System.out.println(arr);
		arr1.addAll(arr);
		System.out.println(arr1);
		arr.clear();
		//System.out.println(arr);
		arr.contains(arr1);
		//System.out.println(arr);
		arr.containsAll(arr1);
		//System.out.println(arr);
		arr.size();
		//System.out.println(arr);
		arr.toArray();
		//System.out.println(arr);
		
		arr.indexOf(arr1);
		System.out.println(arr);
		
		
		

	}

}
