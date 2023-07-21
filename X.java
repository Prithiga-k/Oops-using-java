import java.io.*;
import java.util.Arrays;
public class X
{
public static void main(String args[])
{
	int a[]={50,77,12,54,-11};
   System.out.println(Arrays.toString(a));
    boolean bool1=true;
	boolean bool2=false;
	if(a.contains("0")||a.contains("-1"))
	{
		System.out.println(bool1);
   }
   else
   {
	   System.out.println(bool2);
   }
}
}
   