import java.io.*;
import java.util.*;
public class Star
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the positive integer");
  int n=s.nextInt();
  for(int i=1;i<=n;i++)
  {
	  for(int j=1;j<=i;j++)
	  {
	 System.out.printf("*");
	 
	  }
	  System.out.printf(" \n");
	 
  }
}
}