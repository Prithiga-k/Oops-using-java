import java.util.*;
import java.lang.*;
import java.io.*;
class F
{
	public static void main (String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	     int a=1,b=2,c,sum=2;
		 for(int i=2;i<=n-2;i++)
		 {
		 c=a+b;
		 a=b;
		 b=c;
		 if(c%2==0)
		 {
		  sum=sum+c;
		  }
		  }
		   System.out.println(sum);
		 }
	}