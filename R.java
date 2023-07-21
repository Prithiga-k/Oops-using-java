import java.util.*;
import java.lang.*;
import java.io.*;
class R
{
	public static void main (String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a=100,b=999;
		int y=s.nextInt();
		int c,n,rem,rev=0,x;
		for(int i=a;i<=b;i++)
		{
		for(int j=a;j<=b;j++)
		{
		    c=i*j;
			n=c;
			 while(n!=0)
			 {
			   rem=n%10;
			   rev=rev*10+rem;
			   n=n/10;
			 }
			   x=rev;
			   if(x==c)
			   {
			   System.out.printf("%d " ,c);
			   }
			   else
			   {
				   System.out.println("No");
			   }
	    } 
			   
	}
}	}	  