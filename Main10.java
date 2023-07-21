import java.io.*;
import java.util.*;
public class Main10
{
public static void main(String argss[])
{
    Scanner s=new Scanner(System.in);
	System.out.println("Enter the first string");
	  String str1=s.nextLine();
	  System.out.println("Enter the second string");
	  String str2=s.nextLine();
	  int l1=str1.length();
	  int l2=str2.length();
	  if(str1.contains(str2))
	  {
	    System.out.println("Yes");
		}
		else
	  {
	    System.out.println("No");
		}
}
}	
	  
	  
	  
	  