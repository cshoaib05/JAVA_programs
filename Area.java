import java.util.*;

interface area 
{
	public void circle(float r);
	public void Square(int a);
	public void rectangle(int a,int b);
}

 class Area implements area
{
	public void circle(float r)
			{
				double area=2*3.14*r;
				System.out.println(area);
			}

	public void Square(int a)
			{
				int area=a*a;
				System.out.println(area);
			}
	public void rectangle(int a,int b)
			{	
				int area=2*a*b;
			}

}

class Main
{
	public static void main(String args[])
	 {
			Area a=new Area();
			a.circle(31);		
	}
}



