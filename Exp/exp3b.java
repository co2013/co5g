//Name : Sandeep Sahani , Enrollment no : 1300040402
/*Define a class Cube having data members length, breadth and height.
 *Initialize three objects using different constructor and display its volume.
  */


import java.util.*;
import java.net.*;

class Cube
{
	float length,breadth,height,volume;
	Cube(float l,float b, float h)
	{
		volume=l*b*h;
	}
	Cube(float l,float b)
	{
		volume=l*b*b;
	}
	Cube(float l)
	{
		volume=l*l*l;
	}
	void display()
	{
		System.out.println("Volume : "+volume);
	}
}
class exp3b
{
	public static void main(String[] args) throws Exception
	{
		Date d=new Date();
		InetAddress ip = InetAddress.getLocalHost();
		
		Cube box[]=new Cube[3];
		box[0] = new Cube(2,5,7);
		box[1] = new Cube(8,7);
		box[2] = new Cube(7);
		for(Cube b : box)
			b.display();		
		
		System.out.println("Date : "+d);
		System.out.println("Ip address : "+ip);
		
	}
}