package CollectionList;

import java.util.ArrayList;

public class Demo2 {

	public static void main(String[] args) {
        ArrayList arr =new ArrayList();
		
		arr.add("selenium");
		arr.add(1000);
		arr.add(true);
		arr.add(12.34f);
		arr.add('A');
		
		System.out.println(arr.get(4));
		arr.add(2, "TestNg");
		System.out.println(arr.get(4));

	}

}
