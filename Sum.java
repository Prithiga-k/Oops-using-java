import java.io.*;
import java.util.*;
public class Sum
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
   float avg=0.0f;
   for(i=0;i<n;i++)
   {
	   sum=sum+a[i];
	   avg=sum/n;
   }
 System.out.println("The sum of array is");
 System.out.println(sum);
 System.out.println("The average of array is");
 System.out.print(avg);
  }
}