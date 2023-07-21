import java.util.*;
import java.lang.*;
import java.io.*;
class M
{
	public static void main (String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),sum=0,subtract=0,m=0;
		int z=0;
	  for(int i=1;i<n;i++)
	  {
	     sum = (n*(n+1))*(2*n+1)/6;
		 subtract=(n*(n+1)/2);
		 m=subtract*subtract;
		 z=m-sum;
		}
		System.out.println(z);
	
		
	}
	}