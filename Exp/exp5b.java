//not tested 
//activity 2nd

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
	     System.out.println(v.elementAt(i));
	   }
	  
		System.out.println("Date : "+d);
		System.out.println("Ip address : "+ip);
		
	}
}
