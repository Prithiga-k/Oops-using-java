import java.io.*;
import java.util.*;
public class Main54
{
public static void main(String argss[])
{
    Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	int m=s.nextInt();
	int b[]=new int[m];
	for(int i=0;i<n;i++)
	{
	    a[i]=s.nextInt();
	}
	for(int j=0;j<m;j++)
	{
	    b[j]=s.nextInt();
	}
	int x=s.nextInt();
	for(int i=0;i<n;i++)
	{
	   for(int j=0;j<m;j++)
	{
	    if(a[i]+b[j]==x)
	    {
	        System.out.println(a[i]+" "+b[j]);
	    }
	}
	}
}
}