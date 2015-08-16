import java.util.*;
import java.net.*;

class helloJava
{
	public static void main(String[] args) throws Exception
	{
		Date d=new Date();
		InetAddress ip = InetAddress.getLocalHost();
		System.out.println("Well hello Java");
		System.out.println("Date : "+d);
		System.out.println("Ip address : "+ip);
		
	}
}
