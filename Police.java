import java.io.*;
import java.util.*;
public class Police
{
 public static void main(String args[])
 {
     Scanner s=new Scanner(System.in);
	 int r=s.nextInt();
	 int c=s.nextInt(),i,j;
	 int arr[][]=new int[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
   arr[i][j]=s.nextInt();
}
}
    int x=s.nextInt();
	int y=s.nextInt();
	int n=s.nextInt();
for(i=0;i<=x;i++)
{
for(j=1;j<=c;j++)
{
 if(arr[i][j]!=1 && arr[i][j]!=0)
 {
     arr[i][j]=n;
  }
 }
}
 	 
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(arr[i][j]);
 }
 System.out.println();
}
}
}

 