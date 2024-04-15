import java.util.Scanner;
class  person
{
	String pname;
	String address;
	String gender;
	int age;
	person(String pname,String address,String gender,int age)
	{
		this.pname=pname;
		this.address=address;
		this.gender=gender;
		this.age=age;
	}
		
}
class  employees extends person
{
	int emp_id;
	String cp_name;
	String qualification;
	float salary;
	employees(String pname,String address,String gender,int age,int emp_id,String cp_name,String qualification,float salary)
	{
		super(pname,address,gender,age);
		this.emp_id=emp_id;
		this.cp_name=cp_name;
		this.qualification=qualification;
		this.salary=salary;
	}
		
}
class teachers extends employees 
{
	Scanner sc =  new Scanner(System.in);
	int teach_id;
	String department;
	String subject;
	teachers(int teach_id,String department,String subject,int emp_id,String cp_name,String qualification,float salary,String 	pname,String address,String gender,int age)
	{
		super(pname,address,gender,age,emp_id,cp_name,qualification,salary);
		this.teach_id=teach_id;
		this.department=department;
		this.subject=subject;
	}
	public void display()
	{
		System.out.println("name is:"+pname);
		System.out.println("gender is:"+gender);
		System.out.println("address is:"+address);
		System.out.println("age is:"+age);
		System.out.println("employee id is:"+emp_id);
		System.out.println("company name is:"+cp_name);
		System.out.println("salary is:"+salary);
		System.out.println("qualification is:"+qualification);
		System.out.println("teacher id is:"+teach_id);
		System.out.println("department is:"+department);
		System.out.println("subject taught is:"+subject);
	}
	public static void main(String args[])
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println(" enter no of employee:");
		int n = sc.nextInt();
		teachers empobj[] = new teachers[n];
		for (int i=0;i<n;i++)
		{	
			System.out.println("enter name of person:");
			String pname=sc.next();
			System.out.println("enter gender:");
			String gender=sc.next();
			System.out.println("enter address:");
			String address=sc.next();
			System.out.println("enter age:");
			int age=sc.nextInt();
			System.out.println("enter employee id:");
			int emp_id=sc.nextInt();
			System.out.println("enter company name :");
			String cp_name=sc.next();
			System.out.println("enter salary :");
			float salary=sc.nextFloat();
			System.out.println("enter qualification :");
			String qualification=sc.next();
			System.out.println("enter teacher id :");
			int teach_id=sc.nextInt();
			System.out.println("enter department:");
			String department=sc.next();
			System.out.println("enter subject taught:");
			String subject=sc.next();
			empobj[i]=new teachers(teach_id,department,subject,emp_id,cp_name,qualification,salary,pname,address,gender,age);
		}
		System.out.println("the details are:");
		for (int i=0;i<n;i++)
		{
			empobj[i].display();
		}
}
}
	
	
