import java.io.*;
import java.util.Scanner;
class B216001_4
{
	
	public static void main(String args[])
	{
		int sum=0;
		int i=5;
		while(sum>=0)
		{
			sum = sum+ i*i;
		}
		System.out.println("The smallest n: "+i);
	}
}
