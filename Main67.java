import java.io.*;
import java.util.*;
public class Main67
{
public static void main(String argss[])
{
    Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[][]=new int[n][n];
	int max=0;
	for(int i=0;i<n;i++)
	{
	    for(int j=0;j<n;j++)
	{
	    a[i][j]=s.nextInt();
	}
	}
	int c,d,e;
		c=a[0][1]*a[1][0];
		d=a[1][1]*a[0][0];
		e=d-c;
	int ans=a[0][0];
	int res=a[1][1];
	for(int i=0;i<n;i++)
	{
	    for(int j=0;j<n;j++)
	{
	    if(i==0 && j==0)
	    {
	        a[0][0]=res;
	    }
	   else if(i==0 && j==1)
	    {
	        a[0][1]=-(a[0][1]);
	    }
	    else if(i==1 && j==0)
	    {
	        a[1][0]=-(a[1][0]);
	    }
	    if(i==1 && j==1)
	    {
	        a[1][1]=ans;
	    }
	}
	}
	
	 for(int i=0;i<n;i++)
	{
	    for(int j=0;j<n;j++)
	{   
	    System.out.print(a[i][j]/e+" ");
	}
	System.out.println();
	}  
}
}