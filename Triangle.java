import java.io.*;
import java.util.*;
public class Triangle
{
 public static void main(String ... args)
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the angle1");
   int a=s.nextInt();
   System.out.println("Enter the angle2");
   int b=s.nextInt();
   System.out.println("Enter the angle3");
   int c=s.nextInt();
   int x=a+b+c;
   if(x==180)
   {
   System.out.println("Triangle is formed");
   }
   else 
   {
   System.out.println("Triangle is not formed");
   }
  }
 }
   