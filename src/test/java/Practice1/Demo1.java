package Practice1;

import java.util.HashSet;

public class Demo1 {

	public static void main(String[] args) {
		String a="KADAM";
			
		HashSet hs =new HashSet();
		String b="";
		String c="";
		for(int i=0;i<a.length();i++)
		{
			if(hs.add(a.charAt(i)))
			{
				b=b+a.charAt(i);
			}
			else
			{
				c=c+a.charAt(i);
			}
		}
		System.out.println(b);
		System.out.println(c);
	}

}
