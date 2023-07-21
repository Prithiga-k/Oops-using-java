import java.io.*;	
import java.util.*;	
public class Pavinprithi1
{	
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	if(n==0)
	{
	    System.out.print(n);
	}
	else if(n%2==0)
	{
	    System.out.print(n%2);
	    int x=(n-1)/2,k=1,y=k+1;
	    
	    while(x!=0)
	    {
	        System.out.print(k-y+" "+k+" ");
	        x--;
	        k++;
	      //  System.out.print(k+" ");
	        y=y+2;
	       // System.out.print(y+" ");
	    }
	    System.out.print(n);
	}
	else
	{
	    int x=(n-1)/2,k=1,y=k+1;
	    
	    while(x!=0)
	    {
	        System.out.print(k-y+" "+k+" ");
	        x--;
	        k++;
	        y=y+2;
	    }
	    System.out.print(n);
	}
	}
}	
