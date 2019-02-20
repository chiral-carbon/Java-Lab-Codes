//Show constructor chaining and overloading

import java.io.*;
class B216001_18
{
	B216001_18()
	{
		this(5);
		System.out.println("Default Constructor called");
	}
	B216001_18(int x)
	{
		this(10, 20);
		System.out.println("1 Parameter Constructor called");
		System.out.println(x);
	}
	B216001_18(int x, int y)
	{
		System.out.println("2 Parameter Constructor called");
		System.out.println(x+", "+y);
	}
	public static void main(String [] args)
	{
		B216001_18 ob = new B216001_18();
	}
}
