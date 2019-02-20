import java.io.*;
import java.util.Scanner;
import java.lang.Math;
class B216001_16
{
	B216001_16(double s)
	{
		System.out.println("Area of equilateral triangle = "+((double)Math.sqrt(3)/4*s*s));
	}
	B216001_16(double a, double b)
	{
		if(2*a*a == b*b)    System.out.println("Area of right angled triangle = "+((double)(1)/2*a*b));
		else	System.out.println("Area of isosceles triangle = "+(double)(1)/4*b*Math.pow((4*a*a) - (b*b), 0.5));
	}
	B216001_16(double s1, double s2, double s3)
	{
		if(s1*s1+s2*s2==s3*s3)
		{
			System.out.println("Area of right angled triangle = "+((double)(1)/2*s1*s2));
		}
		else
		{		
			double s=(double)(s1+s2+s3)/2;
			System.out.println("Area of scalene triangle = "+Math.pow(s*(s-s1)*(s-s2)*(s-s3), 0.5));	
		}	
		
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sides of the triangle in ascending order:");
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		if(s1==s2&&s2==s3)
		{
			B216001_16 ob1 = new B216001_16(s1);
		}
		else if(s1==s2&&s2!=s3)
		{
			int a=s1; int b=s3;
			B216001_16 ob2 = new B216001_16(a,b);
		}
		else if(s1==s3&&s2!=s3)
		{
			int a=s1;int b=s2;
			B216001_16 ob2 = new B216001_16(a,b);
		}
		else if(s2==s3&&s2!=s1)
		{
			int a=s2;int b=s1;
			B216001_16 ob2 = new B216001_16(a,b);
		}
		else
		{
			B216001_16 ob3 = new B216001_16(s1,s2,s3);
		}
		
	}
}
