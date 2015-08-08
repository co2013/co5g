//store 5 vector elements from cmd and display
//not tested 

import java.util.*;
import java.net.*;

class template
{
	public static void main(String[] args) throws Exception
	{
		Date d=new Date();
		InetAddress ip = InetAddress.getLocalHost();
	
	  Vector v=new Vector();
	  for(int i=0;i<5;i++)
	   {
	     v.add(args[i]);
	   }
	  for(int i=0;i<5;i++)
	   {
	     v.elementAt(i);
	   }
	  
		System.out.println("Date : "+d);
		System.out.println("Ip address : "+ip);
		
	}
}
