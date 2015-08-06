//Name : Sandeep Sahani , Enrollment no : 1300040402


import java.util.*;
import java.net.*;

class asg1
{
	public static void main(String[] args) throws Exception
	{
		Date d=new Date();
		InetAddress ip = InetAddress.getLocalHost();
        int n=0,max=40;
		int[] c=new int[max];
        int[] b=new int[max];
		c[0]=1;
		b[0]=1;
		b[1]=1;
		System.out.print("Enter number : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n>1)
		{
		    System.out.print("1\n1 1\n");
		}
		else if(n==1)
		{
			System.out.print("1\n");
			
		}
		else if (n==0)
		{
			System.out.print("\n :/ \n");3
		}
		for(int i=0;i<n-2;i++)
		{
			
			for(int j=1,k=0;k<max-1&&b[k]!=0;k++,j++)
			{ 
				c[j]=b[k]+b[k+1];
			}
			for(int j=0;j<max&&c[j]!=0;j++)
			{
				System.out.print(c[j]+" ");
			}
			System.out.println();
			for(int j=0;j<max&&c[j]!=0;j++)
			{
				b[j]=c[j];
			}			
		}		
		
		System.out.println("Date : "+d);
		System.out.println("Ip address : "+ip);
		
	}
}