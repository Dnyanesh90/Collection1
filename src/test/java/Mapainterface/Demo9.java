package Mapainterface;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Demo9 {

	public static void main(String[] args) {
		LinkedHashMap lh = new LinkedHashMap();

		lh.put("firstname", "Anjali");
		lh.put("lastname", "Patil");
		lh.put("email", "anjali@tcs.com");
		lh.put("password", "Anjali@123");
		lh.put("date", 10);
		lh.put("month", "Dec");
		lh.put("year", 2020);
		lh.put("gender", false);

		Set s = lh.entrySet();
		
		System.out.println(lh.get("email"));
		Iterator it = s.iterator();

		while (it.hasNext()) {
			Map.Entry m = (Map.Entry) it.next();
			
			System.out.println(m.getKey());
			System.out.println(m.getValue());
			
			if(m.getKey().equals("email"))
		{
				m.setValue("anjali@citi.com");
			}
		}
		
		System.out.println(lh.get("email"));

	}

	}
