import java.io.*;
import java.util.Scanner;
class test6
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
		System.out.println("Printing even then odd elements:");
		for(int i=0 ; i<n;i++)
		{
			if (b[i] %2 == 0){
				System.out.print("Even:");
				System.out.println(b[i] + "\t");
			}
			else
			{ 
				System.out.print("Odd:");
				System.out.println(b[i] + "\t");
			}
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