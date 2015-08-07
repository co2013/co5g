//java exp question below
/*Wap to find all substring of a string and print them. Using
 *subString() method of String class.
 */

import java.util.*;
import java.net.*;

class exp4a
{
	public static void main(String[] args) throws Exception
	{
		Date d=new Date();
		InetAddress ip = InetAddress.getLocalHost();
		System.out.print("Enter string : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		for(int i=0;i<=str.length();i++)
			for(int j=i;j<=str.length();j++)
				System.out.println(str.substring(i,j));
		
		System.out.println("Date : "+d);
		System.out.println("Ip address : "+ip);
		
	}
}