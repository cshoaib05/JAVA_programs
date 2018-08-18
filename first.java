import java.util.*;
class Seats
{
public static void main(String arg[]) 
{	int a,i;
	Scanner sc=new Scanner(System.in);
	for(i=2;i>1;i++)
	{
	System.out.println("\nENTER THE SEAT NO.\n");
	a=sc.nextInt();
	if(a%6==0 || a%6==1 || a==1)
	{
		System.out.println("WINDOW SEAT\n");
	}
	 if (a==2 || a%3==2) 
	 {
	 	System.out.println("MIDDLE SEAT\n");
	 }
	 else
	 {
	 	if(a%3==0 || a%2==0)
	 	{ 
	 		System.out.println("CORNER SEAT\n");
	 	}
	 }
	}
}
}