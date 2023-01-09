package Practice;

import java.util.ArrayList;

public class Demo1 {

	public static void main(String[] args) {

		String a="cucumber";
		
		char abc []= a.toCharArray();
		
		ArrayList arr =new ArrayList();
		
		for(int i=0;i<abc.length;i++)
		{
			arr.add(abc[i]);
		}
		
		//System.out.println(arr);
		for(int i=arr.size()-1;i>=0;i--)
		{
			System.out.print(arr.get(i));
		}		

	}

}
