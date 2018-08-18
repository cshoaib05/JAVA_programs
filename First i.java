import java.util.*;

class Test
{
	public static void main(String args[]) 
	{
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		int i,j,temp;
		System.out.println("ENTER THE ARRAY");
		for (i=0;i<10;i++) 
		{
			a[i]=sc.nextInt();
		}
		/*for (i=0;i<9;i++)
		{
			for (j=0;j<9-i;j++)
			{	
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}*/
		Arrays.sort(a);
		System.out.println("largest number="+a[9]+"\nsecond highest"+a[9-1]+"\nsmallest number"+a[0]);
	}
}