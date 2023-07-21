import java.io.*;
import java.util.*;
class Z
{
public static void main(String args[])
{
int i,j;
 System.out.println("Enter the number of lines");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(i=1;i<=n;i++)
{
if(i==1||i==n)
{
for(j=1;j<=n+1;j++)
{
System.out.print("@ ");
}
System.out.println(" ");
}
else
{
for(j=1;j<=n-i;j++)
{
System.out.print("   ");
}
System.out.print("##");
System.out.println(" ");
}
}
}
}