import java.io.*;
import java.util.*;
class Main34
{
	public static void main(String args[])
	{
    Scanner s=new Scanner(System.in);
	System.out.println("Enter the string");
    String str1=s.nextLine();
    int len1=str1.length();
	System.out.println("Enter the string");
    String str2=s.nextLine();
    int len2=str2.length();
      char a[]=new char[len1];
      char b[]=new char[len2];
      a=str1.toCharArray();
      b=str2.toCharArray();
	  int cnt=0;
for(int i=0;i<len1;i++)
{
	
    if(a[i]!=b[i])
    {
        cnt++;
    }
}
System.out.println(cnt);
if(cnt==2)
{
System.out.println("Yes");	
}
else
{
System.out.println("No");	
}    
}
}