package Treeset;

import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) {
		TreeSet t =new TreeSet();
		t.add("A");
		t.add("B");
		t.add("C");
		t.add("D");
		t.add("E");
		t.add("F");
		t.add("G");
		t.add("H");
		
		TreeSet t1 =new TreeSet();
		t1.add("P");
		t1.add("Q");
		t1.add("R");
		t1.add("S");
		
		TreeSet t2 =new TreeSet();
		t2.add("DNYANESHWAR");
		t2.add("PARMESHWAR");
		t2.add("JANHAVI");
		t2.add("SANGEETA");
		t2.add("SAVEETA");
		t2.add("RUKMINI");
		
		//System.out.println(t);
		//System.out.println(t1);
//		t.addAll(t1);
//		System.out.println(t);
//		
//		t.removeAll(t1);
//		System.out.println(t);
//		
//		t.containsAll(t1);
//		System.out.println(t1);
//		System.out.println(t.size());
//		System.out.println(t.isEmpty());
//		System.out.println(t.descendingSet());
//		System.out.println(t2);
//		System.out.println(t2.descendingSet());
//		System.out.println(t1.first());
//		System.out.println(t1.last());
//		System.out.println(t1.headSet("D"));
		
//		System.out.println(t.tailSet("D"));
//		
//		System.out.println(t.subSet("A", "H"));
		
        System.out.println(t);
		
		System.out.println(t.pollFirst());
		System.out.println(t.pollLast());
		
		System.out.println(t.higher("G"));
		System.out.println(t.lower("C"));
		System.out.println(t);
		System.out.println(t.descendingSet());
		
	}

}
