import java.util.*;
class program4
{
	public static void main(String args[])
	{
		Scanner obj1 = new Scanner(System.in);
		System.out.println("enter string one:");
		String stringone = obj1.nextLine();
		Scanner obj2 =  new Scanner(System.in);
		System.out.println("enter string two:");
		String stringtwo = obj2.nextLine();
		System.out.println("concatenation:"+stringone.concat(stringtwo));
		System.out.println("length of string one is:"+stringone.length());
		System.out.println("uppercase:"+stringone.toUpperCase());
		System.out.println("replacing o with i:"+stringone.replace('o','i'));
		System.out.println("index of lo in string:"+stringone.indexOf("lo"));
		char chararray[] = stringone.toCharArray();
		System.out.println("String buffer class:");
		StringBuffer str =  new StringBuffer("hello");
		StringBuffer temp1 =  new StringBuffer("hai");
		StringBuffer str1 = new StringBuffer("goodmorning");
		StringBuffer temp2= new StringBuffer("goodnight");
		System.out.println("appending:"+str.append(temp1));
		System.out.println("length os str1:"+str1.length());
		System.out.println("insert operation:"+str.insert(3,temp2));

	}
}
		
