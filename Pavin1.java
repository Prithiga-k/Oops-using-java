import java.io.*;
import java.util.*;
class Pavin
{
  int num1;
  int num2;
  int num3;
void insertRecord(int n1,int n2,int n3)
{
     num1=n1;
	 num2=n2;
	 num3=n3;
}
void displayInformation()
{
     System.out.println("The Multiply is "); 
	System.out.println(num1*num2*num3);
}
	 
}
class Pavin1{
public static void main(String args[])
   {
	
        Pavin p1=new Pavin();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=s.nextInt();
		System.out.println("Enter the second number");
		int b=s.nextInt();
		System.out.println("Enter the Third number");
		int c=s.nextInt();
		
		p1.insertRecord(a,b,c);
		p1.displayInformation();
		
		
	
    }
}