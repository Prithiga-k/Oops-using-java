import java.io.*;
import java.util.*;
public class Maximum
{
public static void main(String args[])
{
      Scanner s=new Scanner(System.in);
	  System.out.println("Enter the size of an array");
	  int n=s.nextInt();
	  int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
	  arr[i]=s.nextInt();
	}
	for(int i=0;i<n;i++)
	{
	int cnt=0;
	int cnt1=0;
	for(int j=i;j<n;j++)
	{
		cnt1++;
	  if(arr[i]>=arr[j])
	  {
	  cnt++;
	  }
	 }
	if(cnt==cnt1)
	{
		System.out.printf("%d ",arr[i]);
	
    }
}
}
}