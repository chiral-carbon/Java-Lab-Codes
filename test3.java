import java.io.*;
import java.util.Scanner;
class test3
{ 
    public static int search(int arr[], int n, int x) 
    { 
        for (int i = 0; i < n; i++) 
        { 
            if (arr[i] == x) 
                return i; 
        } 
        return -1; 
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for (int i=0;i<n ;i++ ) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number to be searched: ");
        int x = sc.nextInt();
        int s = search(arr, n , x);
        if (s!=-1)
            System.out.println("The element is at "+(s+1)+ " position.");
        else
            System.out.println("The element is not present in the list.");
    }
}
