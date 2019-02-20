import java.io.*;
import java.util.Scanner;
class rect
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and width of the rectangle:");
		double a, b;
		a = sc.nextDouble();
		b = sc.nextDouble();
		System.out.println("The area of the rectangle = " + a*b);

	}
}

