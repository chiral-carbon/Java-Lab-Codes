import java.io.*;
import java.util.Scanner;
class antiDiag
{
	public static void compute(int [][]a, int n)
	{
		int k=0, i=0;
		while(i<=n)
		{
			for(int j=0; j<n; j++)
			{
				if(i+j == k)
					System.out.print(a[i][j]);
				i++;
			}
			k++;
			System.out.println("\n");
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
		compute(a, n);
	}
}	
