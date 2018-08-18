import java.util.*;

class First extends Thread
{
	public void run()
	{
		for (int i=0;i<5;i++)
		{
			System.out.println("@");
			try
			{
				sleep(100);
			}
			catch (Exception e)
		 	{	
			}
		}
	}
}

class Second extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{	
			System.out.println("*");
			try
			{
				sleep(100);
			}
			catch (Exception e)
			 {	
			}
		}
	}
}

class AAAAA 
{
	public static void main(String[] args)
	{
		First f=new First();
		Second s=new Second();
		f.start();
		s.start();
	}	
}
