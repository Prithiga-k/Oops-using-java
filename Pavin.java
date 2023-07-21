import java.io.*;
import java.util.*;
class Pavin
{
public static void main(String args[])
{

Scanner s=new Scanner(System.in);
int arr1[]=new int[100];
System.out.println("enter the length");
int l=s.nextInt();

int i;
int no=-1;

System.out.println("enter the number to find in an array");
int num=s.nextInt();

for( i=0;i<l;i++)
{
arr1[i]=s.nextInt();
}

 if(arr1[i]==num)
{

System.out.println(arr1[num]);

}
else
{
  System.out.println(no);
}





}
}
