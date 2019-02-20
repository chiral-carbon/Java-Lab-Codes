import java.io.*;
import java.util.Scanner;
class secondLarge
{
	public static int bubsort(int []a, int n)
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a[n-2];
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter size of array:");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter array elements:");
		for (int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		int sec = bubsort(a, n);
		System.out.println("The second largest array element: " + sec);
	}
}	
