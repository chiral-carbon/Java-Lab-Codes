//Rearrange a 5x5 matrix
import java.io.*;
import java.util.Scanner;
class B216001_20
{
	B216001_20()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of 5x5 matrix, row-wise:");
		int[][] arr = new int[5][5];
                int[] vec = new int[25];
		int k=0;
		for(int i=0; i<5; i++)
		{
		 	for(int j=0; j<5; j++)
		        {
		       		arr[i][j]=sc.nextInt();
				vec[k++]=arr[i][j];
			}
		}
		System.out.println("The matrix you entered:");
                disp(arr);
		vec = bubsort(vec);
		System.out.println("After sorting and rearranging:");
		rearrange(arr, vec);
	}
	public static int[] bubsort(int[] v)
	{
		int n = 25;
		for(int i=0; i<n-1; i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(v[j]>v[j+1])
				{
					int temp = v[j];
					v[j] = v[j+1];
					v[j+1] = temp;
				}
			}
		}
		return v;
	}
	public static void disp(int[][] a)
	{
	        for(int i=0; i<5; i++)
                {
	                for(int j=0; j<5; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
	public static void rearrange(int[][] a, int[] v)
	{
		int k=0;
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				a[i][j]=v[k++];
			}
		}		
		disp(a);
	}
	public static void main(String[] args)
	{
		B216001_20 ob = new B216001_20();
	}
}

