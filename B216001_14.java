import java.io.*;
import java.util.Scanner;
class B216001_14
{
	public static void volume(double r)
	{
		System.out.println("Volume of the sphere = "+((double)4/3*3.14*r*r*r));
	}
	public static void surface_area(double r)
	{
		System.out.println("Surface area of the sphere = "+(4*3.14*r*r));
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius of sphere: ");
		double radius=sc.nextDouble();
		volume(radius); surface_area(radius);
	}
}
