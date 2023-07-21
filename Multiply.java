import java.util.*;
import java.lang.*;
import java.io.*;
class Multiply
{
	public static void main (String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		for(int i=1;i<n;i++)
		{
		if((i%3==0) || (i%5==0))
		{
		     count=count+i;
		}
		}
		if(count<1000)
		{
		System.out.println(count);
		}
		else
		{
		System.out.println("Count is greater than 1000");
		}
	}
}	