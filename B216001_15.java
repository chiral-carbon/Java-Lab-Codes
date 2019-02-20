import java.io.*;
import java.util.Scanner;
class B216001_15
{
	public static int fact(int n)
	{
		if(n==1 || n==0)
			return 1; // Base
		else
			return n*fact(n-1); // Calculating factorial recursively
	}
	public static void main(String[] args)
	{
 		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a whole number: ");
		int num=sc.nextInt();
		int F = fact(num);
		System.out.println("Factorial of the number = "+F);
	}
}
