import java.io.*;
import java.util.*;
class Main21
{
public static int equal(int arr[],int arr1[])
{
  if(Arrays.equals(arr,arr1)
  {
    return 1;
  }	
  else
  {
   return 0;
   }
}

public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	int arr1[]=new int[n];
	for(int i=0;i<n;i++)
	{
	   arr[i]=s.nextInt();
	  
	 }
	 Arrays.sort(arr);
	for(int i=0;i<n;i++)
	{
	   arr1[i]=s.nextInt();
	 }
	 Arrays.sort(arr1);
	 System.out.println(equal(arr,arr1));
}
}
   
	   