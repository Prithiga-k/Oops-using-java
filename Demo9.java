import java.io.*;
import java.util.Arrays;
public class Demo9
{
public static void main(String args[])
{
   int[] n1={1,2,3,4};
   int[] n2=new int[n1.length];
   int[] n3=new int[n2.length];
   System.arraycopy(n1,0,n2,0,n1.length);
   System.out.println("n2=" +Arrays.toString(n2));
   System.arraycopy(n2,0,n3,0,n2.length);
   System.out.println("n3=" +Arrays.toString(n3));
 }
 }
 
   
   