import java.util.Scanner;
public class matrixaddition{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int rows=sc.nextInt();
		System.out.println("enter the number of columns");
		int cols=sc.nextInt();
		int matrix1[][] = new int[rows][cols];
		int matrix2[][] = new int[rows][cols];
		System.out.println("enter the elements of first matrix");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<rows;j++)
			{
				matrix1[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the elements of second matrix");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<rows;j++)
			{
				matrix2[i][j]=sc.nextInt();
			}
		}
		int sum[][] = new int[rows][cols];
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<rows;j++)
			{
				sum[i][j] = matrix1[i][j]+matrix2[i][j];	
			}
		}
		System.out.println("sum of matrices:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<rows;j++)
			{
				System.out.print(sum[i][j]);
			}
				System.out.print("\n");
		}
		
	}
}

		
