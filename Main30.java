import java.io.*;
import java.util.*;
class Main30
{
public static void sort(int arr[],int k)
{
  int res=arr[k-1];
   System.out.println(res);
}
public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 int arr[]=new int[n];
	 for(int i=0;i<n;i++)
	 {
	   arr[i]=s.nextInt();
	   int k=s.nextInt();
	   Arrays.sort(arr);
     }
}
}