import java.util.Scanner;
class area
{
	static int area(int a)
	{
		return a*a;
	}
	static int  area(int a,int b)
	{
		return a*b;
	}
	static double area(double r)
	{
		return 3.14*r*r;
	}
}
class	shape
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the side length of square:");
		int a = obj.nextInt();
		System.out.println("enter the length of rectangle:");
		int l = obj.nextInt();
		System.out.println("enter the breadth of rectangle:");
		int b = obj.nextInt();
		System.out.println("enter the radius of circle:");
		double r = obj.nextDouble();
		System.out.println("area of square is:"+area.area(a));
		System.out.println("area of rectangle is:"+area.area(l,b));
		System.out.println("area of circle is:"+area.area(r));
	}
}
