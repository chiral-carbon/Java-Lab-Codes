import java.io.*;
import java.util.Scanner;
class antiDiag
{
	public static void compute(int [][]a, int n)
	{
		for(int i=0; i<n; i++)
		{
			for(int j=i; j<n; j++)
			{
				System.out.println(a[i][j]);
			}
		}

	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int n;
		System.out.println("Enter the order of square matrix:");
		n = sc.nextInt();
		int a[][] = new int[n][n];
		System.out.println("Enter the matrix elements:");
		for(int i=0;i<n;i++)
		{	
			for(int j=0; j< n;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		compute();
	}
}	
