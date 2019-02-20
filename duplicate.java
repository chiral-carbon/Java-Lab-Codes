import java.io.*;
import java.util.Scanner;
class duplicate
{
	public static void compute(int []a, int n)
	{
		int d[] = new int[n/2];
		int k=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					d[k++]=a[i];
					break;
				}
			}
		}
		System.out.println("The duplicate values:");
		for(int i=0;i<d.length;i++)
		{
			if(d[i]==0)
				break;
//			if(d[i+1]==d[i])
//				continue;
			System.out.print(d[i]+" ");
		}
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		int n;
		System.out.println("Enter size of array:");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		compute(a, n);
	}
}
		
