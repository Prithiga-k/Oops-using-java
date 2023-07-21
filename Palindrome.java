import java.io.*;
import java.util.*;
public class Palindrome
{  
 public static void main(String[] args) 
 {
   String str = "Madam";
   StringBuffer sb = new StringBuffer(str);
   String rev = sb.reverse().toString();
   if(rev.equals(str))
	System.out.println("String " +str+ " is a palindrome.");
   else
	System.out.println("String" +str+ " is not a palindrome.");  
 }
}