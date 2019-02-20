import java.util.Scanner;
import java.lang.Math;
class Prime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int c=0;
		if(n>=2)
		{
			for(int i=2;i<=Math.sqrt(n);i++)
			{
				if(n%i==0)
					c++;
			}
		}
		if(c==0)
			System.out.println("Number is prime");
        	else
			System.out.println("Number is not prime");
		sc.close();
	      
      }
}
		
