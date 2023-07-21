import java.io.*;
import java.util.*;
public class Maximum
{
public static void main(String...args)
{
   int n,i;
   int sum=0;
   System.out.println("Enter the size of array");
   Scanner s=new Scanner(System.in);
   n=s.nextInt();
   int a[]=new int[n];
   System.out.println("Enter the elements of array");
   for(i=0;i<n;i++)
   {
	   a[i]=s.nextInt();
   }
   int min=max=a[0];
   for(i=0;i<n;i++)
   {
	if(min>a[0])
	min=a[i];
	if(max<a[0])
	max=a[i];
   }
 System.out.println(min);
 System.out.println(max);
  }
}