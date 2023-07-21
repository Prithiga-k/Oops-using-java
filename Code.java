import java.util.*;
import java.lang.*;
import java.io.*;
class Code
{
	public static void main (String[] args)
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t!=0)
		{ 
		    int n=s.nextInt();
		String a[]=new String[n];
	for(int i=0;i<a.length;i++)
	{
	    a[i]=s.nextLine();
	}
	int cnt1=0,cnt2=0;
	for(int i=0;i<a.length;i++)
	{
	    if(a[i]=="START38")
	    {
	        cnt1++;
	    }
	    else
	    {
	        cnt2++;
	    }
	}
    System.out.printf("%d %d",cnt1,cnt2);
	t--;
}
}
}
