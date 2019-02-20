import java.io.*;
import java.util.Scanner;
class altSort
{
	public static void sort(int []a, int n)
	{
		int b[] = new int[n];
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
		int k=1, l=0;
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
				b[i]=a[n-(k++)];
			else
				b[i]=a[l++];
		}
		System.out.println("The array sorted as max first, min 2nd, second largest third, and so on...:");
		for(int i=0;i<n;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		int n;
		System.out.println("Enter size of array:");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		sort(a, n);
	}
}
