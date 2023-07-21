import java.io.*;
import java.util.*;
public class O
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.printf("Enter the number\n");
int n=s.nextInt(),i,j;
System.out.printf("The Ascending order of given numbers are\n");
for(i=1;i<=n;i++)
{
System.out.printf("%d ",i);
}
System.out.printf("\nThe Descending order of given numbers are\n");
for(j=n;j>0;j--)
{
System.out.printf("%d ",j);
}

}
}
