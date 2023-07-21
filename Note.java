import java.io.*;
import java.util.*;
public class Note
{
public static void main(String...args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
double n=s.nextDouble(),sum=1.0;
for(int i=2;i<=n;i++)
{
sum=sum+(1.0/i);
}
System.out.println("The sum of the series is: "+sum);
}
}