import java.io.*;
import java.util.*;
public class Prithi
{
public static void main(String args[])
{
  System.out.println("Enter the number");
  Scanner a=new Scanner(System.in);
   int n=a.nextInt();
   int i,j,k;
  for(i=1;i<=(2*n-1);i++)
  { 
   k=n;
   if(i<=n)
   {
  for(j=1;j<=(2*n-1);j++)
  {
   System.out.print(k );
   if(i>j)
   k=k-1;
    if((i+j) >=(2*n))
	k=k+1;
	}
	System.out.print("\n");
   }
   if(i>n)
   {
	 for(j=1;j<=(2*n-1);j++) 
		 System.out.print(k);
        if((i+j)<(2*n))	
			k=k-1;
		if(i<=j)
			k=k+1;
	}
	System.out.print("\n");
}
}
}
 
   
  
   