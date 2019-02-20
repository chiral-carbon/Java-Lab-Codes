import java.io.*;
import java.util.Scanner;
class reverse
{
	public static void rev(int []a, int n)
	{
		for(int i=0; i<n/2; i++)
		{
			int temp = a[i];
			a[i] = a[n-1-i];
			a[n-1-i] = temp;
		}
	}
	public static void disp(int []a, int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args)
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
		System.out.println("The array you entered:");
		disp(a, n);
		rev(a, n);
		System.out.println("\nThe reverse array:");
		disp(a, n);
	}
}

