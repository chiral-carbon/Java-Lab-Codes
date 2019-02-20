import java.io.*;
import java.util.Scanner;
class B216001_13
{
	public static void area(int s)
	{
		System.out.println("Area of square = "+(s*s));
	}
	public static void area(int l, int b)
	{
		System.out.println("Area of rectangle = "+(l*b));
	}
	public static void area(double r)
	{
		System.out.println("Area of circle = "+(3.14*r*r));
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of square, length and breadth of rectangle, and radius of circle in this order:");
		int s=sc.nextInt();
		int l=sc.nextInt(); int b=sc.nextInt();
		double r=sc.nextDouble();
		area(s); area(l,b); area(r);
	}
}
		
