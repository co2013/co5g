//java exp question below
//WAP to do sum of two numbers if both are grater than 10

import java.util.*;
import java.net.*;

class exp2a
{
	public static void main(String[] args) throws Exception
	{
		Date d=new Date();
		InetAddress ip = InetAddress.getLocalHost();
        int a=Integer.parseInt(args[0]),b=Integer.parseInt(args[1]);
		
		if(a>10&&b>10)
		{
			System.out.println("a+b="+(a+b));
		}else 
			System.out.println("less than 10");
				
		System.out.println("Date : "+d);
		System.out.println("Ip address : "+ip);
		
	}
}