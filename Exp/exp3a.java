//Name : Sandeep Sahani , Enrollment no : 1300040402
/*Define a class 'Mobile' with data members comapny_name & screen_size
 *Initialize and display value of data members for five mobiles using 
 *array of objects.
 */

import java.util.*;
import java.net.*;
import java.io.*;


class Mobile
{
	String company_name;
	float screen_size=0.0f;
	Mobile(String n,float s)
	{
		this.company_name=n;
		this.screen_size=s;
	}
	void display()
	{
		System.out.println("\t"+company_name+"\t"+screen_size);
	}
}
class exp3a
{
	public static void main(String[] args) throws Exception
	{
		Date d=new Date();
		InetAddress ip = InetAddress.getLocalHost();
		
		float size=0.0f;
	    String name;
	
		Mobile m[]=new Mobile[5];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Details");
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter the company Name : ");
			name=br.readLine();
			System.out.print("Enter the screen Size : ");
			size=Float.parseFloat(br.readLine());
			m[i] = new Mobile(name,size);
		}
		System.out.println("\tCompany\tScreen_size");
		System.out.println("\t------------------");
		for(int i=0;i<5;i++)
		{
			m[i].display();
		}
		
		System.out.println("Date : "+d);
		System.out.println("Ip address : "+ip);
		
	}
}