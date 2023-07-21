import java.io.*;
import java.util.*;
public class Pradeep
{
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		
		int x=0;int sum=0,sum1=0,sum3=0;
		for(int i=0;i<n;i++)
		{
		a[i]=s.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
		int count=0;
		for(int j=i+1;j<n;j++)
		{
			if(a[i]!=' ')
			{
		if(a[i]==a[j])
		{
		  count++;
		  a[j]=' ';  
		  }
			}
		  }

		  if(count>1)
		  {
		  if(count%2==0)
		  {
			  sum=sum+count-1;
		  }
		  else
		  {
			  sum1=sum1+count-1;
		  }
		  }
		  else if(count==1)
		  {
			  sum3=count+sum3;
		  }
		}
		System.out.print(sum+sum1+sum3);
		}
		}