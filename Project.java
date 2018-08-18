import java.util.*;

class Products
{
    Scanner sc=new Scanner(System.in);
    String name,size;
    int price,quantity,age;
    public Products()
        {   
            System.out.println("ENTER THE DETAILS");
            System.out.println("NAME :\t");
           this.name=sc.next();
            System.out.println("SIZE:\t");
           this.size=sc.next();
            System.out.println("AGE:\t");
           this.age=sc.nextInt();
            System.out.println("PRICE:\t");
           this.price=sc.nextInt();
            System.out.println("QUANTITY:\t");
           this.quantity=sc.nextInt();
        }
}

class Operations
{
	 public void addProduct()
	{
            LinkedList<Products> ll=new LinkedList<>();
            Products products=new Products();
       
    }  
}

class Test
{
    public static void main(String args[])
    {
        Operations o=new Operations();
        o.addProduct();
    }
}