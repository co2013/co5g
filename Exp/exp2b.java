//java exp question below
//Develop a program to print the first 7 terms of fibonacci series 

import java.util.*;
import java.net.*;

class exp2b
{
	public static void main(String[] args) throws Exception
	{
		Date d=new Date();
		InetAddress ip = InetAddress.getLocalHost();
        int a=0,b=0,c=1;
		
		for(int i=0;i<7;i++)
		{
			System.out.println((i+1)+" : "+c);
			a=b;
			b=c;
			c=a+b;
		}		
				
		System.out.println("Date : "+d);
		System.out.println("Ip address : "+ip);
		
	}
}