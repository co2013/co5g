//remove vowels


import java.util.*;
import java.net.*;

class asg3
{
	public static void main(String[] args) throws Exception
	{
		Date d=new Date();
		InetAddress ip = InetAddress.getLocalHost();
		
		String s;
		char[] vov={'a','e','i','o','u'};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string : ");
		s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s.toLowerCase());
		for(int i=0;i<sb.length();i++)
		{
			for(int j=0;j<5;j++)
			{
				if(sb.charAt(i)==vov[j])
				{
       				sb.deleteCharAt(i);
					i--;
					break;
				}
			}
		}
		System.out.println("Original : "+ s);
		System.out.println("Without vovels : "+sb);
		
		
		
		System.out.println("Date : "+d);
		System.out.println("Ip address : "+ip);
		
	}
}
