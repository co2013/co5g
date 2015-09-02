import java.util.Scanner;
class exp8a
{
	public static void main(String[] args)
	{
		String p="treaks";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter password : ");
		try
		{
			String s=sc.next();
			if(s.equals(p))
			{
				System.out.println("Correct!! :)");
			}else
				{
					throw new Exception("ERROR password mismatch!");
				}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
