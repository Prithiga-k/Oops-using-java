import java.io.*;
import java.util.*;
public class P
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number"); 
      int n=s.nextInt();	
  for(int i=1;i<=n;i++)
  {
  for(int j=1;j<=n;j++)
  {
  if((i==j)||(i+j==n+1))
  {
      System.out.print("x");
  }
  else
  {
    System.out.print(" ");
  }
  }
    System.out.println();
  }
  }
 }