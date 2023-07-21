import java.io.*;
import java.util.*;
public class Demo7
{
public static void main(String args[])
{
    int age=2;
	String a=String.format("%d" ,age);
	String b=String.valueOf(age);
	System.out.println("The child is " +a + " Years old");
	System.out.println("The child is " +b + " Years old");
}
}
