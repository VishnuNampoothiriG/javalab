class rectangle
{
	double length;
	double breadth;
	
	void setData()
	{
		length=12.48;
		breadth=13;	
	}
	void getArea()
	{
		double area = length * breadth;
		System.out.println("area is"+area);
	}
	
}
class rectangletest
{
	public static void main(String args[])
	{
		rectangle obj = new rectangle();
		obj.setData();
		obj.getArea();
	}
}
