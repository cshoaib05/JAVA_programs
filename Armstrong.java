import java.util.*;

class Armstrong 
{
	public static void main(String args[])
	{
		int temp,sum=0,a;
		Scanner sc=new Scanner(System.in);
		int i=Integer.parseInt(args[0]);
		temp=i;
		while(i!=0)
		{
			a=i%10;
			sum=sum+a*a*a;
			i=i/10;
		}
		if(temp==sum)
		{
			System.out.println("arm");
		}
		else {
			System.out.println("not ");
		}
	}	
}
