import java.io.*;
import java.util.*;
public class Fibanocci
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the positive integer");
  int n=s.nextInt();
  int a=0,b=1,c;
  System.out.printf("%d ",a);
  System.out.printf("%d ",b);
 while(n!=0)
 {
	 c=a+b;
	 a=b;
	 b=c;
	 System.out.printf("%d ",c);
	 n--;
  }
  }
}

  
  
  