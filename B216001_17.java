import java.io.*;
import java.util.Scanner;
import java.lang.Math;
class B216001_17
{
	int num;	
	B216001_17(int num)
	{
		this.num=num;
		boolean k = prime(num);
		if (k==true){
			System.out.println("The number is prime.");
			binary(num);
		}
		else System.out.println("The number is not prime.");
	}	
	public static void binary(int num)
	{
		long b = 0;
		int i=0;
		while(num>0)
		{
			int d = num%2;
			b=b+(int)(Math.pow(10,i++))*d;
			num/=2;
		}
		System.out.println("The binary representation of input integer = "+b);
	}
	public static boolean prime(int num)
	{
		int c=0;		
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)	c++;
		}
		if(c==0)	
			return true;
		else	return false;
		
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter an integer: ");
		int n=sc.nextInt();
		B216001_17 ob = new B216001_17(n);
	}
}
