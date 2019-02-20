import java.util.Scanner;
class Average
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int n=sc.nextInt();
		System.out.println("Enter array elements:");
		int[] a = new int[n];
		int s=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
                        s+=a[i];
		}
		System.out.println("Average="+(s/n));
                sc.close();
	}
}
