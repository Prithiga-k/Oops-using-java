import java.io.*;
import java.util.*;
import java.util.Arrays;
class Main
{
public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of elements of array");
	int n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
	   arr[i]=s.nextInt();
	   }
	for(int i:arr)
	{
	  System.out.print(i +" ");
	  }
}
}