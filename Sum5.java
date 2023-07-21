import java.util.*;
class Sum5
{

public static void main(String args[])
{

int n,row,col,mat,mat1;
Scanner sc=new Scanner(System.in);
System.out.println("size ");
n=sc.nextInt();
for(row=1;row<=n;row++)
{
if(row==1||row==n)
{
for(col=0;col<=4;col++)
{
System.out.print(" ");

}
for(col=1;col<=4;col++)
{
System.out.print("#");
}
}
else if(row==2||row==3||row==n-1||row==n-2)
{
if(row%2==0)
{
mat=2;
mat1=2;
}

else
{
mat=1;
mat1=3;
}

for(col=1;col<=mat;col++)
{
System.out.print(" ");
}

System.out.print("* *");

for(col=1;col<=mat1;col++)
{
System.out.print("  ");
}

System.out.print("* *");
}
else
{
System.out.print("# #");
}
System.out.println(" ");
}
}
}
