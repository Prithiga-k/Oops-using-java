import java.io.*;
import java.util.*;
public class Prithiga1504
{
public static void main(String args[])
{ 
    Scanner s=new Scanner(System.in);
	System.out.println("Enter the string");
	String str=s.next();
    String[] arr = str.split(" "); 
    StringBuffer sb = new StringBuffer(); 
 
    for (int i = 0; i < arr.length; i++) 
	{ 
        sb.append(Character.toUpperCase(arr[i].charAt(0))) 
            .append(arr[i].substring(1)).append(" "); 
    }           
      System.out.println(sb.toString()); 
}
}   