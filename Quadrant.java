import java.io.*;
import java.util.*;
public class Quadrant
{
 public static void main(String ... args)
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the x axis value");
   int a=s.nextInt();
   System.out.println("Enter the y axis value");
   int b=s.nextInt();
   if(a==0 && b==0)
   {
   System.out.println("The coordinate point " +"("+a+","+b+")"+"  lies in origin");
   }
  else if(a>0 && b>0)
   {
   System.out.println("The coordinate point " +"("+a+","+b+")"+"  lies in first quadrant");
   }
   else if(a<0 && b>0)
   {
   System.out.println("The coordinate point " +"("+a+","+b+")"+"  lies in second quadrant");
   }
   else if(a<0 && b<0)
   {
   System.out.println("The coordinate point " +"("+a+","+b+")"+"  lies in third quadrant");
   }
   else
   {
   System.out.println("The coordinate point " +"("+a+","+b+")"+"  lies in fourth quadrant");
   }
 }
 }
   