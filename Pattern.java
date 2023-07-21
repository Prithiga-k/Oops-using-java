import java.io.*;
import java.util.*;
public class Pattern
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the positive integer");
  int n=s.nextInt();
  for(int i=n;i>=1;i--)
{
for(int j=1;j<=i;j++)
	  {
System.out.printf(" ");
 }
 System.out.print(i);
  System.out.printf(" \n");	 
  }
}
}