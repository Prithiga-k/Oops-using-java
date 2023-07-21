import java.io.*;
import java.util.*;
public class N
{
public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
	System.out.println("Enter the integer");
	  int n=s.nextInt();
	  System.out.println("Enter the value of q");
	  int q=s.nextInt();
	  int sum=0;
	  int Multiply=1;
	   if(q==1)
	   {
		   for(int i=1;i<=n;i++)
	  sum=sum+i;
      System.out.println(sum);
	   }
	  else if(q==2)
	  {
		 for(int i=1;i<=n;i++)
	    Multiply=Multiply*i;
	System.out.println(Multiply);
	  }
	  else 
	  {		
        for(int i=1;i<=n;i++)
		{
          if(Multiply>n)
		  {
            Multiply=Math.pow(10,9);	
	   System.out.print("Multiply");
	      }
		  else
		  {
			System.out.print("Not possible");  
	       }
	   
        }
	  }
}
}