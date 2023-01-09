package Mapainterface;

import java.util.HashMap;

public class Demo2 {

	public static void main(String[] args) {
		HashMap h =new HashMap();
		h.put("firstName", "Ashish");
		h.put("lastName", "Patil");
		h.put("address", "Pune");
		h.put("mobile", 909090909);
	
		System.out.println(h.containsKey("mobile"));
		//h.remove("address");
		System.out.println(h.containsValue("Patil"));
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		h.clear();
		System.out.println(h);
		
		

	}

}
