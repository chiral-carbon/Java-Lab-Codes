import java.io.*;
import java.util.Scanner;
class B216001_3
{
	public static void sort(int a[], int n)
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(a[j+1]<a[j])
				{
					int tmp=a[j];
					a[j]=a[j+1];
					a[j+1]=tmp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		System.out.println("Enter array elements:");
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt(); 
		}	
		sort(a, n);
		System.out.println("The second largest array element: "+ a[n-2]);
	}
}
