import java.util.*;
class employee
{
	
	int eno;
	String eName;
	double salary;
	void read()
	{
		Scanner obj =  new Scanner(System.in);
		System.out.println("enter enmployee number:");
		eno=obj.nextInt();
		System.out.println("enter enmployee name:");
		eName=obj.next();
		System.out.println("enter enmployee salary:");
		salary=obj.nextDouble();
				
	}
	void display()
	{
		System.out.println("employee number:"+eno);
		System.out.println("employee name:"+eName);
		System.out.println("employee salary:"+salary);
	}
	public static void main(String args[])
	{
		int flag=1;
		Scanner s = new Scanner(System.in);
		System.out.println("enter number of employee:");
		int n= s.nextInt();
		employee empobj[] = new employee[n];
		for(int i=0;i<n;i++)
		{
			empobj[i] = new employee();
			empobj[i].read();
		}
		System.out.println("details are:");
		for(int i=0;i<n;i++)
		{
			empobj[i].display();
		}
		System.out.println("enter the employee number to be searched:");
		int searchno=s.nextInt();
		for(int i=0;i<n;i++)
		{
			if(empobj[i].eno==searchno)
			{
				empobj[i].display();
				flag=0;
				break;
			}
		}
		if(flag!=1)
		{
			System.out.println("employee not found");
		}
	}
}
		
		
