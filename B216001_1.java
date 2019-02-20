import java.io.*;
class B216001_1
{
	public static void main(String[] args) {
		for(int i=1;i<=6;i++)
		{
			if(i==5)
				continue;
			for(int j=6;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.print("\n");
		}
		int k=4;
		for(int i=3;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=k;j>=1;j--)
			{
				System.out.print(j);
			}
			for(int j=2;j<=k;j++)
			{
				System.out.print(j);
			}
			System.out.print("\n");
			k--;
		}
	}
}
