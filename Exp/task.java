import java.util.*;
import java.net.*;

class Student
{
	String name;
	int rno;
	
	void show()
	{
		System.out.println("Name : "+name+"\nRoll NO : "+rno);
	}
}
		
class Exam extends Student
{
	int m1,m2;

	void show()
	{
		super.show();
		System.out.println("Subject1 Marks : "+m1);
		System.out.println("Subject2 Marks : "+m2);
	}
}

class Result extends Exam
{
	boolean pass=false;
		void show()
	{
		super.show();
		if(m1>34&&m2>34)
			{
				pass=true;
				System.out.println("Passed!!");
			}
			else
				{System.out.println("Failed!!");
				}
	}
}

interface extrcc
{
	int cmarks=53;
	}
interface sports
{
	int smarks=75;
	}
	
class Marksheet extends Result implements extrcc,sports
{
	Scanner sc=new Scanner(System.in);
	void get()
	{
		System.out.print("Enter Name : ");
		name=sc.next();
		System.out.print("Enter Roll NO : ");
		rno=sc.nextInt();
		System.out.print("Enter Subject1 marks : ");
		m1=sc.nextInt();
		System.out.print("Enter Subject2 marks : ");
		m2=sc.nextInt();
	}
	void show()
	{	
		System.out.println("\n************MARKSHEET*************");
		super.show();
		System.out.println("Extra Curricular Marks : "+cmarks); 
		System.out.println("Sports Marks : "+smarks); 
		System.out.println("Total Marks : "+(smarks+cmarks+m1+m2)+"\n"); 
	}
}

class task
{
	public static void main(String[] args) throws Exception
	{
		Date d=new Date();
		InetAddress ip = InetAddress.getLocalHost();
		Marksheet m=new Marksheet();
		m.get();
		m.show();
		System.out.println("Date : "+d);
		System.out.println("Ip address : "+ip);
		
	}
}
