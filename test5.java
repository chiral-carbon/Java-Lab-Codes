import java.io.*;
import java.util.*;
class test5
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the order of the two matrices: ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int A[][] = new int [n][m];
		int B[][] = new int [n][m];
		System.out.println("Enter the elements of matrix 1: ");
		for (int i=0;i<n ;i++ ) {
			for (int j=0;j<m ;j++ ) {
				A[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the elements of matrix 2: ");
		for (int i=0;i<n ;i++ ) {
			for (int j=0;j<m ;j++ ) {
				B[i][j] = sc.nextInt();
			}
		}
		int C[][] = new int[n][m];
	    for (int i=0;i<n ;i++ ) {
			for (int j=0;j<m ;j++ ) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		System.out.println("The sum of the arrays:");
		for (int i=0;i<n ;i++ ) {
			for (int j=0;j<m ;j++ ) {
				System.out.print(C[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}
}