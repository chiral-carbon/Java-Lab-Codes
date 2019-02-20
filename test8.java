import java.io.*;
class test8
{
	public static void main(String[] args) {
		try
		{
			int n = 10 / 0;
		}
		catch (ArithmeticException e)
		{
			System.out.println("Exception found.");
		}
	}
}