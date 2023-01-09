package CollectionList;

import java.util.ArrayList;

public class Demo11 {

	public static void main(String[] args) {
		ArrayList arr1 =new ArrayList();
		arr1.add('A');
		arr1.add('B');
		arr1.add('C');
		arr1.add('D');
		
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
