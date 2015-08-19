import java.util.*;
import java.net.*;

class Bird
{
	String ct;
	Bird(String c)
	{
		this.ct=c;
	}
	void show()
	{
		System.out.println("Category : "+ct);
	}
}
		
class Parrot extends Bird
{
	int nop;
	Parrot(int np)
	{
		super("Parrot");
		this.nop=np;
	}
	void show()
	{
		super.show();
		System.out.println("No of Parrots : "+nop);
	}
}

class exp6b
{
	public static void main(String[] args) throws Exception
	{
		Date d=new Date();
		InetAddress ip = InetAddress.getLocalHost();
		Parrot p=new Parrot(6);
		p.show();
		System.out.println("Date : "+d);
		System.out.println("Ip address : "+ip);
		
	}
}
