import java.io.*;
import java.util.*;
public class Main99
{
public static void main(String argss[])
{
    Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of elements of array");
	 int n=s.nextInt();
	System.out.println("Enter the first array ");
	  int arr1[]=new int[n];
	  System.out.println("Enter the second array");
	  int arr2[]=new int[n];
	  for(int i=0;i<n;i++)
	  {
	     arr1[i]=s.nextInt();
	   }
	   for(int i=0;i<n;i++)
	  {
	     arr2[i]=s.nextInt();
	   }
	  int cnt=0;
	  for(int i=0;i<n;i++)
	  {
		  int arr3[]=arr1[]+arr1[];
	  if(arr3[].contains(arr2[]))
	     cnt++;
		 System.out.println(cnt);
	  }
}
}
