import java.util.*;

class GCD 
{
	public static void main(String arg[]) 
	{
		int n1,n2;
			n1=Integer.parseInt(arg[0]);
			n2=Integer.parseInt(arg[1]);
			while(n1!=n2)
			{
				if (n1>n2)
				{
					n1=n1-n2;
				}
				else 
				{
					n2=n2-n1;
				}
			}
		
		System.out.println(n1);
	}	
}