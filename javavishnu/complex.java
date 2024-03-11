import java.util.Scanner;
class complex
{
	double real,image;
	public complex(double r,double i)
	{
		this.real=r;
		this.image=i;
	}
	void add(complex num2)
	{
		complex sum = new complex(0,0);
		sum.real=this.real+num2.real;
		sum.image=this.image+num2.image;
		System.out.println("sum is:"+sum.real+"+i"+sum.image);
	}
	public static void main(String args[])
	{
		double r1,i1,r2,i2;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the real part of this:");
		r1=obj.nextInt();
		System.out.println("enter the imaginary part of this:");
		i1=obj.nextInt();
		complex c1= new complex(r1,i1);
		System.out.println("enter the real part of num2:");
		r2=obj.nextInt();
		System.out.println("enter the imaginary part of num2:");
		i2=obj.nextInt();
		complex c2 = new complex(r2,i2);
		c2.add(c1);
	}
}

