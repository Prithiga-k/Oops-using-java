import java.io.*;
import java.util.*;
public class Farenheit
{
public static void main(String args[])
   {
   System.out.println("Enter the celcius value");
   Scanner c=new Scanner(System.in);
     float a=c.nextFloat();
	 float f;
	f=(a*(9/5)+32);
	System.out.println(f);
    }
}
	