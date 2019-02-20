import java.util.Scanner;
class Armstrong
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:"); 
		int n=sc.nextInt();
		int d, c=0, s=0, temp=n;
		while(temp!=0)
		{
			d=temp%10;
			c++;
			temp/=10;
		}
		while(temp!=0)
		{
			d=temp%10;
			s+=Math.pow(d,c);
			temp/=10;
		}
		if(s==n)
			System.out.print("It is an Armstrong number");
		else
			System.out.print("Not an Armstrong number");
	}
}
