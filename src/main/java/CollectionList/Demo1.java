package CollectionList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Demo1 {

	public static void main(String[] args) {
	ArrayList array =new ArrayList();
	array.add("Selenium");
	array.add("TestNG");
	array.add("Cucumber");
	array.add("BDD");
	
	System.out.println(array.get(2));
	
	System.out.println(array.add("java"));
	array.add(2,"Automation");
	System.out.println(Array.getLength(4));
	}
}

