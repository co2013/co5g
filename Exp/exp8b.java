import java.util.Scanner;
class exp8b
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		try
		{
			int a=sc.nextInt();
			if(a%2==0)
			{
				System.out.println(":)");
			}else
				{
					throw new Exception("ERROR number isn't even !!");
				}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
