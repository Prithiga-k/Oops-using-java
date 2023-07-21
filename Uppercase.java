import java.io.*;
import java.util.*;

public class Uppercase 
{
    public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	  String str=s.nextLine();
	   int len=str.length();
    System.out.println(len);
	 char arr[]=new char[len];
        arr=str.toCharArray();
int y=0,i;
for(i=0;i<len;i++)
{
	if((arr[i]=='a') || (arr[i]=='e') || (arr[i]=='i') || (arr[i]=='o') || (arr[i]=='u'))
	{
	   arr[y++]=Character.toUpperCase(arr[i]);   
    }
	else
	{
        arr[y++]=arr[i];
    }
 }
     String x=new String(arr);
	 System.out.print(x);
	}
}
