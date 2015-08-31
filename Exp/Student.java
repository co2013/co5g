import useFul.UseMe;
class Student
{
	public static void main(String[] args)
	{
		UseMe u=new UseMe();
		double per=u.percentage(300,231);
		System.out.println("Percentage of marks(231/300) is "+per+"%");
	}
}