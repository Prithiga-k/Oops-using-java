import java.io.*;
import java.util.*;
public class Prn1
{
public static int minJumps(int N,int arr[])
{
int count=0;
for(int i=0;i<N;i++)
{
int max=arr[i];
if(max!=0)
{
int ans=arr[i+max];
max=ans;
count=count+1;
}
}
return -1;
}


public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int N=s.nextInt();
int arr[]=new int[N];
for(int i=0;i<arr.length;i++)
{
arr[i]=s.nextInt();
}
System.out.print(minJumps(N,arr));
}
}