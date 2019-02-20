import java.io.*;
import java.util.Scanner;
class B216001_21
{
	B216001_21()
	{
		System.out.println("Enter the elements of a 4x4 matrix, row-wise:");
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int [4][4];
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The matrix you entered:");
		disp(arr);
		System.out.println("Printing output like a maze:");
		mazePrint(arr);
	}
	public static void disp(int[][] a)
	{
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
	public static void mazePrint(int[][] a)
	{
		for(int j=0; j<4; j++)
		{
			System.out.print(a[0][j]+" ");
		}
		for(int i=1;i<=3;i++)
			System.out.print(a[i][3]+" ");
		for(int j=2;j>=0;j--)
			System.out.print(a[3][j]+" ");
		for(int i=2;i>=1;i--)
			System.out.print(a[i][0]+" ");
		for(int j=1;j<=2;j++)
			System.out.print(a[1][j]+" ");
		System.out.print(a[2][2]+" "+a[2][1]);
		System.out.print("\n");
	}
	public static void main(String[] args)
	{
		B216001_21 ob = new B216001_21();
	}
}

