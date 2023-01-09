package Mapainterface;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class Demo8 {

	public static void main(String[] args) {
        LinkedHashMap lh =new LinkedHashMap();
		
		lh.put("firstname", "Anjali");
		lh.put("lastname", "Patil");
		lh.put("email", "anjali@tcs.com");
		lh.put("password", "Anjali@123");
		lh.put("date", 10);
		lh.put("month", "Dec");
		lh.put("year", 2020);
		lh.put("gender",false);
		
		System.out.println(lh.get("date"));
		System.out.println(lh.size());
		System.out.println(lh.isEmpty());
		lh.clear();
		System.out.println(lh);

	    Set s =lh.keySet();
		System.out.println(s);
	
		Collection c =lh.values();
		System.out.println(c);


	}

}
