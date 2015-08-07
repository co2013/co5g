//java exp question below
/*Implement a program to accomplish the following task using String and StringBuffer
 *>To search a word
 *>To search from the last position of string
 *>To compare two string
 *>To print reverse of string
 */

import java.io.*;
import java.util.*;
import java.net.*;

class exp4b
{
	public static void main(String[] args) throws Exception
	{
		Date d=new Date();
		InetAddress ip = InetAddress.getLocalHost();
		
		
		StringBuffer s=new StringBuffer();
		String s1,s2,s3,s4;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter string:");
		s1=br.readLine();
		System.out.print("Enter substring to be searched:");
		s2=br.readLine();
		if(s1.indexOf(s2)>=0)
		System.out.println("Substring  found at "+s1.indexOf(s2));
			else
				System.out.println("Substring not found");
		System.out.print("Enter substring to be searched(from last):");
		s2=br.readLine();
        if(s1.lastIndexOf(s2)>=0)
		System.out.println("Substring  found at "+s1.lastIndexOf(s2));
			else
				System.out.println("Substring not found");
		System.out.print("Enter str1:");
		s3=br.readLine();

		System.out.print("Enter str2: ");
		s4=br.readLine();
		if(s3.compareTo(s4)>0)
		System.out.println(s3 +"is greater");
			else 
				System.out.println(s4 +" is greater");

		System.out.print("Enter Str to be reversed:");
		s.append(br.readLine());
		System.out.println("Reverse is "+s.reverse());
			
		System.out.println("Date : "+d);
		System.out.println("Ip address : "+ip);
		
	}
}