import java.io.*;
import java.util.*;
public class Snake
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the positive integer");
  int n=s.nextInt(),k=0;
  for(int i=0;i<n;i++)
  {
	for(int j=0;j<n;j++)
	{
	   if(i%2==0)
	   {
           k++;
        System.out.print(k);
	   }
     else
	 {
        System.out.print(k);
           k--;
	 }
       k=k+n;
	}
	System.out.print("\n");	
  }
}
}
  
  