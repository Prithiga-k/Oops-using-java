import java.io.*;
import java.util.Arrays;
public class Demo10
{
public static void main(String args[])
{
   int[] n1={1,2,3,4};
   for(int i:n1)
   {
     System.out.println(i);
   }
   System.out.println("After clearing an array");
   Arrays.fill(n1,0);
   for(int i:n1)
   {
     System.out.print(i);
	 }
}
}
 
	