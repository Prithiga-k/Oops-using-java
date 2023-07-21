import java.io.*;
import java.util.*;
class Main40
{
public static void main(String args[])
{
     Scanner s=new Scanner(System.in);
        int j=0;
	    int n=s.nextInt();
	   int a[]=new int[n];
   for(int i=0;i<n;i++){
    a[i]=s.nextInt();
}
for(int i=0;i<n;i++){
    i=i+a[i];
    j++;
}
   System.out.println(j);

}
}