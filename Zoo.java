import java.io.*;
import java.util.*;
public class Zoo
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
          s.nextLine();
          String a=s.nextLine();
          int Z_count=0;
          int O_count=0;
          int  n=a.length();
          char[] zoo=new char[a.length()];
          int i;
        for(i=0;i<n;i++)
        {
            zoo[i]=a.charAt(i);
        }
        for(i=0;i<n;i++)
        {
            if(zoo[i]=='z'||zoo[i]=='Z')
            {
                Z_count++;
            }
            else
            {
                O_count++;
            }
        }
        if(2*Z_count==O_count)
        {
            System.out.print("Yes");
        }
        else
        {
           System.out.print("no"); 
        }
        
    }
}
