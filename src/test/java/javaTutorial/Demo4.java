package javaTutorial;

public class Demo4 {

	public static void main(String[] args) {
		String a="HELLOWORLD";
		
		char b[] =a.toCharArray();
		int count;
		for(int i=0;i<=b.length;i++)
		{
			count=1;
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]==b[j]&&b[i]!=' ')
				{
					count++;
					b[j]='0';
				}
			}
			if(count>=1 &&b[i]!='0')
			{
			System.out.print(b[i]+" "+count+"");
			
			//System.out.print(b[i]);
				
				}
			}
		}
	}

