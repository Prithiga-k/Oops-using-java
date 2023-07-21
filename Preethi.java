import java.util.*;
import java.io.*;
public class Preethi
{
public static void main(String...args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];int count=0;
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}

   if(a[0]!=1)
   {
     System.out.println("0");
	 }
	 else if(a[0]==a[n-1])
	 {
	 System.out.println(n);
	 }
	 else{
	 for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
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
  }
  
  System.out.println(count-1);
  }
  }
  }