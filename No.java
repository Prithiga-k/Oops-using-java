import java.io.*;
import java.util.*;
public class No
{
public static void main(String...args)
{
Scanner s=new Scanner(System.in);
int count=3;
while(count!=0)
{
System.out.println("Enter the pin");
int n=s.nextInt();
if(n==1234)
{
System.out.println("Correct, welcome back.");
break;
}
else if((n!=1234) && (count!=1))
{
System.out.println("Incorrect, try again");
}
count--;
if(count!=0)
{
System.out.println("Enter the correct pin again");
}

if(count==0)
{
	System.out.println("Sorry but you have been locked out");
}
}
}
}
