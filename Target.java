import java.io.*;
import java.util.*;
public class Target
{
public static void main(String args[])
{
     Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 int arr[]=new int[n];
    System.out.println("Enter the element of array");
for(int i=0;i<n;i++)
{
    arr[i]=s.nextInt();
}
     System.out.println("Enter the target element");
     int a=s.nextInt();

for(int i=0;i<n;i++)
   {
  for(int j=i+1;j<n;j++)
   {
   if(arr[i]+arr[j]==a)
      {
   	    
		System.out.println(arr[i]+ "+" + arr[j]+"=" + a);
		
	  }
	
	}
	}
}
}
