import useFul.UseMe;
import useFul.useFulToo.*;
class PackageUse
{
	public static void main(String[] args)
	{
		UseMeToo m=new UseMeToo();
		UseMe u=new UseMe();
		double area=u.area(302.3,22.21);
		System.out.println("Area of rectange (l=302.3,b=22.21) is "+area+"unit^2");
		m.show();
	}
}