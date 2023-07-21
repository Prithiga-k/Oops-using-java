import java.io.*;
import java.util.*;
public class Array
{
public static void main(String...args)
{
   int n,i;
   System.out.println("Enter the size of array");
   Scanner s=new Scanner(System.in);
   n=s.nextInt();
   int a[]=new int[n];
   System.out.println("Enter the elements of array");
   for(i=0;i<n;i++)
   {
	   a[i]=s.nextInt();
   }
   System.out.println("The elements of array are");
   for(i=0;i<n;i++)
   {
	   
	   System.out.print(a[i] );
   }
 
   
  }
}