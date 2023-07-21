import java.io.*;
import java.util.*;
public class Multiplication
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the positive integer");
  int a=s.nextInt(),ans;
  for(int i=1;i<=10;i++)
  {
    ans=a*i;
	System.out.println(a + "*" + i +"=" +ans);
	}
}
}
	
	