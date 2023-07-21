import java.io.*;
import java.util.*;

public class A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        int X=sc.nextInt();

        System.out.println(("enter the element of e"));
        int[] E=new int[X];

        for (int i=0;i<X;i++) {
            E[i]=sc.nextInt();
        }
        
        System.out.println("enter the elements of l");
        int[] L=new int[X];
        
        for (int i=0;i<X;i++) {
            L[i]=sc.nextInt();
        }
        int total=0;
        int person=0;
        for (int i=0;i<X;i++) {
            person=person+E[i]-L[i];
            if (person>total) {
                total=person;
            }
        }
        System.out.println(total);
        
    }
}