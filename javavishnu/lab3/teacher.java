import java.util.Scanner;
class  employee
{
	int empid;
	String name;
	float salary;
	String address;
	public void employee(int empid,String name,float salary,String address)
	{
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		this.address=address;
	}
	public void read()
	{	
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter emp id:");
		empid = sc.nextInt();
		System.out.println("enter name:");
		name = sc.next();
		System.out.println("enter salary:");
		salary = sc.nextFloat();
		System.out.println("enter address :");
		address = sc.next();
	}
}
class teacher extends employee
{
	Scanner sc =  new Scanner(System.in);
	String department;
	String subject;
	public void teacher(String department,String subject)
	{
		this.department=department;
		this.subject=subject;
	}
	public void display()
	{
		System.out.println("employee id is:"+empid);
		System.out.println("name is:"+name);
		System.out.println("salary is:"+salary);
		System.out.println("address is:"+address);
		System.out.println("department is:"+department);
		System.out.println("subject taught is:"+subject);
	}
	public void read()
	{
		super.read();
		System.out.println("enter department:");
		department = sc.next();
		System.out.println("enter subject taught:");
		subject = sc.next();
	}
	public static void main(String args[])
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println(" enter no of employee:");
		int n = sc.nextInt();
		teacher empobj[] = new teacher[n];
		for (int i=0;i<n;i++)
		{
			empobj[i]=new teacher();
			empobj[i].read();
		}
		System.out.println("the details are:");
		for (int i=0;i<n;i++)
		{
			empobj[i].display();
		}
}
}
	
	
