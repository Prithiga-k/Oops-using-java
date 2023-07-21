import java.io.*;
import java.util.*;
public class Deletionelement
{
public static void main (String...args)
{
Scanner s=new Scanner(System.in);
String str=s.nextLine();
int n=str.length();
char arr[]=new char[n];
arr=str.toCharArray();
int cnt=0;
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
  if(arr[i]==arr[j])
  {
  cnt++;
  }
}
}
System.out.println(cnt);


}
}
