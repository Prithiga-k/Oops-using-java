import java.util.*;

class Rotate
{
public static void main(String args[])
{
int n,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Array size ");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Array elements ");
for(i=0;i<n;i++)
{
  
a[i]=sc.nextInt();  

}
int temp;
int flag=0,count=0;
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{

if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{

if(a[i]<a[j])
{

flag=1;
}
else
{
flag=0;
count++;
break;
}
}
}

}
System.out.println("The no of rotation is "+count);
}
}