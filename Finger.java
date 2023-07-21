import java.io.*;
import java.util.*;
public class Finger
{
public static void main(String args[])
{
       Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
	   int a=8;
if(n%a==1)
{
   System.out.println("THUMB");
}
if(n%a==2 || n%a==0)
{
   System.out.println("FOREFINGER");
}
if(n%a==3 || n%a==7)
{
   System.out.println("MIDDLE");
}
if(n%a==4 || n%a==6)
{
   System.out.println("RING");
}
if(n%a==5)
{
   System.out.println("LITTLE");
}
}
}
