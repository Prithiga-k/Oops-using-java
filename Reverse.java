import java.io.*;
import java.util.*;
class Reverse
{
public static void main(String args[])
{
   Scanner s=new Scanner(System.in);
    System.out.println("Enter the number");
	int n=s.nextInt();
while(n!=0)
{
   int rem=n%10;
  n=n/10;
 if(rem%2==0)
 {
   System.out.println(n+"-"+"EVEN");
   }
  else
  {
  System.out.println(n+"-"+"ODD");
  }
  }
 }
 }