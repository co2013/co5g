//matrix one


import java.util.*;
import java.net.*;

class asg2
{
	public static void main(String[] args) throws Exception
	{
		Date d=new Date();
		InetAddress ip = InetAddress.getLocalHost();
		
		int n=Integer.parseInt(args[0]);
		int[][] mat=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				mat[i][j]=(int)(Math.random()*100);
				System.out.print("|"+mat[i][j]);
			}
			System.out.print("|");
			System.out.println();
		}
		
		
		
		
		System.out.println("Date : "+d);
		System.out.println("Ip address : "+ip);
		
	}
}
