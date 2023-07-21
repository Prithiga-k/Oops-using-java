import java.io.*;
import java.util.Arrays;
import java.util.*;
class Main31
{
public static void main(String args[])
{ 
Scanner s=new Scanner(System.in);
System.out.println("enter the no of elements : ");
int a = s.nextInt();
int i;
int arr[]=new int[a];
System.out.println("enter the array elements : ");
for(i=0;i<a;i++)
  arr[i]=s.nextInt();
    System.out.println("enter the k value : ");
	int k=s.nextInt();
	Arrays.sort(arr);
	int res=arr[k-1];
    System.out.println(res);
}
}