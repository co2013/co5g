import java.util.*;
import java.net.*;

class Fruits
{
	boolean ct;
	Fruits(boolean c)
	{
		this.ct=c;
	}
	void display()
	{
		System.out.print(ct);
	}
}
		
class Watermelon extends Fruits
{
	int price,quantity;
	Watermelon(boolean c,int q,int p)
	{
		super(c);
		this.price=p ;
		this.quantity=q ;
		
	}
	void show()
	{
		display();
		System.out.print("\t\t"+ quantity+"\t\t"+price+"\n");
	}
}

class exp6c
{
	public static void main(String[] args) throws Exception
	{
		Date d=new Date();
		InetAddress ip = InetAddress.getLocalHost();
		boolean c;
		int pp,q;
		Watermelon[] p=new Watermelon[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;p[i]=new Watermelon(c,pp,q),i++)
		{
			System.out.print("\nIs it countable : ");
			c=sc.nextBoolean();
			System.out.print("Enter price : ");
			pp=sc.nextInt();
			System.out.print("Enter quantity : ");
			q=sc.nextInt();
		
		}
		System.out.println("Countable\tQuantity\tPrice");
		for(int i=0;i<3;p[i].show(),i++);
		System.out.println("Date :  "+d);
		System.out.println("Ip address : "+ip);
		
	}
}
