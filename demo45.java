import java.io.*;
import java.util.*;
import java.lang.Math;
  
public class demo45{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to check if it is truly prime number or not: ");
        int number= sc.nextInt();
        if(isPrime(number)) {
            System.out.println(number + " is prime number");
        }
        else{
            System.out.println(number + " is a non-prime number");
        }
    }
static  boolean isPrime(int number)
    {
        if(number<=1)
        {
            return false;
        }
       for(int i=2;i<number;i++)
       {
           if((number%i)==0)
               return  false;
       }
       return true;
    }
}