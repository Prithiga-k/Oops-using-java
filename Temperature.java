import java.io.*;
import java.util.*;
public class Temperature
{
 public static void main(String ... args)
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the temperature");
   float t=s.nextFloat();
   if(t<0)
   {
   System.out.println("Freezing weather");
   }
   else if(t>=0 && t<10)
   {
   System.out.println("Very cold weather");
   }
   else if(t>=10 && t<20)
   {
   System.out.println("Very cold weather");
   }
   else if(t<=20 && t<30)
   {
   System.out.println("Normal");
   }
   else if(t<=30 && t<40)
   {
   System.out.println("Hot");
   }
   else if(t>=40)
   {
   System.out.println("Very vot");
   }
   }
   }
   
   