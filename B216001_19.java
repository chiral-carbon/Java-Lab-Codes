import java.io.*;
import java.util.Scanner;
class B216001_19
{
	B216001_19()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of 3x3 matrix, row-wise:");
		int[][] arr = new int[3][3];
		for(int i=0; i<3; i++)
			for(int j=0; j<3; j++)
				arr[i][j]=sc.nextInt();
		System.out.println("The matrix you entered:");
		disp(arr);
		System.out.println("The output on reading the matrix in the manner:\na[0][0]->a[0][1]->a[0][2]\na[1][0]<-a[1][1]<-a[0][2]\na[2][0]->a[2][1]->a[2][2]");
		invokeMat(arr);
	}
	public static void disp(int[][] a)
	{
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
				System.out.print(a[i][j]+" ");
			System.out.print("\n");
		}
	}
	public static void invokeMat(int[][] a)
	{
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(i%2==0)
					System.out.print(a[i][j]+" ");
				else
					System.out.print(a[i][2-j]+" ");
			}
		}
	}
	public static void main(String[] args)
	{
		B216001_19 ob = new B216001_19();
	}
}
