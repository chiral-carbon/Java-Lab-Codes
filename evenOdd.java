import java.io.*;
import java.util.Scanner;
class evenOdd
{
	public static void sort(int []a, int n)
	{
		int b[] = new int[n];
		int k=0;
		for(int i=0; i<n; i++)
		{
			if(a[i]%2==0)
				b[k++]=a[i];
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]%2!=0)
				b[k++]=a[i];
		}
		System.out.println("Putting even elements before odd elements:");
		for(int i=0 ; i<n;i++)
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
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		sort(a, n);
	}
}	
