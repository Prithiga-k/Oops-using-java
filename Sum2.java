import java.io.*;
import java.util.*;
class Sum2
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Array size ");
n=sc.nextInt();
int a[]=new int[n];
int i,t,k=0,flag1=0,flag2=0,temp;
System.out.println("elements ");

for(i=0;i<n;i++)
{  
a[i]=sc.nextInt();  
}
for(i=0;i<n-1;i++)
{
if(a[i]<a[i+1])
{
flag1=1;
}
else
{
flag1=0;
break;
}

}

for(i=0;i<n-1;i++)
{

if(a[i]>a[i+1])
{
flag2=1;
}
else
{
flag2=0;
break;
}
}
if(flag1==1)
{

temp=a[n-1];
a[n-1]=a[n-2];
a[n-2]=temp;
for(i=0;i<n;i++)
{ 
System.out.print(a[i]+" "); 
}
}
if(flag2==1)
{
temp=a[n-1];
a[n-1]=a[0];
a[0]=temp;
for(i=0;i<n;i++)
{  
System.out.print(a[i]+" ");
}
}
}
}
