import java.io.*;
import java.util.*;
public class Prithiga
{
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[n];
		int x=0,b;
		for(int i=0;i<n;i++)
		{
		arr[i]=s.nextInt();
		}
		for(int j=0;j<n;j++)
		{
		arr1[j]=s.nextInt();
		}
		int arr3[]=new int[n];
		for(int i=0;i<n;i++)
		{
		for(int j=i;j<n;j++)
		{
			if(i==j)
			{
		   b=arr[i]-arr1[j];
		   arr3[x++]=b;
			}
		  }
		  }
		  Arrays.sort(arr3);
		  System.out.println(arr3[n-1]);
		  }
		  }