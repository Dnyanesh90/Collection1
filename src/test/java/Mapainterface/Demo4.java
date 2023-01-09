package Mapainterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo4 {

	public static void main(String[] args) {
		HashMap h =new HashMap();
		h.put("firstName", "Ashish");
		h.put("lastName", "Patil");
		h.put("address", "Pune");
		h.put("mobile", 909090909);
	
		System.out.println(h);
		Set hs =h.entrySet();
		
		Iterator it =hs.iterator();
		
		while(it.hasNext())
		{
				Map.Entry m = (Map.Entry)it.next();
				
				System.out.println(m.getValue());
				
				if(m.getKey().equals("address"))
				{
					m.setValue("Mumbai");
				}	
		}
		
		System.out.println(h);

	}

	}

