//tested 
//activity 2nd

import java.util.*;
import java.net.*;

class exp5b
{
	public static void main(String[] args) throws Exception
	{
		Date d=new Date();
		InetAddress ip = InetAddress.getLocalHost();
	
	  Vector v=new Vector();
	  
	  v.add(21);
	   v.add(7);
	    v.add(3.14);
	     v.add(2.13);
	      v.add('s');
	       v.add('j');
	        v.add("Yo");
	         v.add("Lo");
	   
	   
	  for(int i=0;i<v.size();i++)
	   {
	     System.out.println("At index " +i+" element is "+v.elementAt(i));
	   }
	  
		System.out.println("Date : "+d);
		System.out.println("Ip address : "+ip);
		
	}
}
