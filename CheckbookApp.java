import java.io.*;
import java.util.Scanner;
class Checkbook
{
	double bal;
	public static double deposit(double bal)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter new deposit:");
		double dep = sc.nextDouble();
		return bal+dep;
	}
	public static double check(double bal)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter new withdrawal amount:");
		double ch = sc.nextDouble();
		if(bal-ch<=0.0)
			return 0.0;
		else return bal-ch;
	}
}
class CheckbookApp
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Checkbook c = new Checkbook();
		double initBal;
		System.out.println("Enter the initial balance:");
		initBal = sc.nextDouble();
		int n;
		System.out.println("Enter the number of transactions:");
		n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("1. Deposit\n2. Check");
			int k = sc.nextInt();
			if(k==1)
				System.out.println("After new deposit = "+c.deposit(initBal));
			else if(k==2)
				System.out.println("After new check = "+c.check(initBal));
		}
	}
}
