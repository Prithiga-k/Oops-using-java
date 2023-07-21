import java.util.*;
import java.io.*;
public class Parkinglot
{
public static void main(String...args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of rows");
int n=s.nextInt();
System.out.println("Enter the number of column");
int m=s.nextInt();
int c[][]=new int[n][m];
int max=0,ans=0;
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
c[i][j]=s.nextInt();
}
}
for(int i=0;i<n;i++)
{
int count=0;
for(int j=0;j<m;j++)
{
if(c[i][j]==1)
{
count++;
}
}
if(count>=max)
{
max=count;
ans=i+1;
}
}
System.out.println(ans);
}
}