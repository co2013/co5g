//written by roll no 24&26  retouched by sylveryte
//tested working :thumbsup:

import java.net.*;
import java.io.*;
import java.util.*;
class Book
{
	String author,title,publisher;
	DataInputStream d=new DataInputStream(System.in);
	void get() throws Exception 
	{
		System.out.print("Enter the author : ");
		author=d.readLine();
		System.out.print("Enter the title : ");
		title=d.readLine();
		System.out.print("Enter the publisher : ");
		publisher=d.readLine();
	}
	void show()
	{
		System.out.print(author+ "\t" +title+ "\t" +publisher);
	}
}
class BookInfo extends Book
{
	int price;
	String sp;
	void get1() throws Exception
	{
		get();
		System.out.print("Enter the price : ");
		price=Integer.parseInt(d.readLine());
		System.out.print("Enter the stock position : ");
		sp=d.readLine();
		System.out.println();
	}
	void show()
	{
		super.show();
		System.out.println("\t" +price+ "\t" +sp);
	}
}

class exp6a
{
	public static void main(String args[]) throws Exception 
	{
		BookInfo b[]=new BookInfo[3];
		for(int i=0;i<3;i++)
		{
			b[i]=new BookInfo();
			b[i].get1();
		}
		System.out.println("\nAuthor\tTitle\tPublisher\tPrice\tStock");
		for(int i=0;i<3;i++)
		b[i].show();
		Date d1=new Date();
		InetAddress IP=InetAddress.getLocalHost();
		System.out.println("Executed on machine " + IP+ " on "+d1);
	}
}
