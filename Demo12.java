import java.io.*;
import java.util.*;
public class Demo12
{
public static void main(String args[])
{
   int[][] n1=new int[4][4];
   Scanner s= new Scanner(System.in);
   int i,j;
   for(i=0;i<4;i++)
   {
   for(j=0;j<4;j++)
   {
      n1[i][j]=s.nextInt();
	}
	System.out.println("Printing elements");
	for(i=0;i<4;i++)
   {
   System.out.println();
   for(j=0;j<4;j++)
    {
	  System.out.print(n1[i][j]);
	  }
	  
}
}
}
}

 