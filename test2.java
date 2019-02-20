import java.io.*;
import java.util.Scanner;
import java.lang.Math;
class test2
{
	public static void prime(int n)
	{
		int c=0;
		for (int i=2; i<=Math.sqrt(n); i++ ) {
			if(n%i==0)
				c++;
		}
		if(c==0)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");
	}
	public static void palindrome(int n)
	{
		int s=0;
		int tmp = n;
		while(tmp>0)
		{
			int d = tmp%10;
			s = s*10 + d;
			tmp/=10;
		}
		if(s==n)
			System.out.println("Number is a palindrome");
		else 
			System.out.println("Number is not a palindrome");
	}
	public static void Armstrong(int n)
	{
		int s=0;
		int tmp = n;
		while(tmp>0)
		{
			int d=tmp%10;
			s = s + (d*d*d);
			tmp/=10;
		}
		if(n == s)
			System.out.println("Number is Armstrong");
		else 
			System.out.println("Number is not Armstrong");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        prime(n);
        palindrome(n);
        Armstrong(n);
	}
}