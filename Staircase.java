import java.io.*;
import java.util.*;
public class Staircase
{
public static void main(String args[])
{
       Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
	   int count=0;
	   while(n!=0)
	   {
		   if(n%2==0)
	   {
		   n=n-n/2; 
		   count++;
	   }
	   
	   else
	   {
		     n=n-1;
			 count++;
	   }
	  
	   } 
	    System.out.println(count);
}
}
   
	 