import java.io.*;
import java.util.*;
class S1
{
public static void main(String args[])
{
   ArrayList <String> a=new ArrayList<String>();
   System.out.println("Enter the input size");
   Scanner s=new Scanner(System.in);
   int ans=s.nextInt();
   System.out.println("Enter the input"); 
   for(int i=0;i<ans;i++)
   {  
       s.nextLine();
    String w =s.next();
   a.add(w);
   }
   System.out.println(a);
}
}
   