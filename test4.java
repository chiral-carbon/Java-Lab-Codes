import java.io.*;
import java.util.Scanner;
class test4
{
	public static void sort(int arr[], int n)
	{
		for (int i=0;i<n-1 ;i++ ) {
			for (int j=0; j<n-1-i;j++ ) {
				if(arr[j]>arr[j+1])
				{
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements:");
		for (int i=0;i<n ;i++ ) {
			arr[i] = sc.nextInt();
		}
		sort(arr, n);
		System.out.println("Third largest array element = "+arr[n-3]);

	}
}