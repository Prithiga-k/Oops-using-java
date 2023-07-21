import java.io.*;
import java.util.*;
class  Main20
    {
      public static void main(String args[])
      {
          Scanner s=new Scanner(System.in);
          int n=s.nextInt();
          int cnt=0;
          int temp=n,rem;
          int ans=0;
          if(n==0)
          {
              cnt=1;
              System.out.println(cnt);
			  System.out.println("Amstrong");
          }
          else
          {
          while(n!=0)
          {
              cnt++;
              n=n/10;
    
          }
          System.out.println(cnt);
           int a=cnt;
          while(cnt!=0)
          {
             rem=temp%10;
             ans=(int)(ans+(Math.pow(rem,a)));
             temp=temp/10;
             cnt--;
          } 
          System.out.println(ans);
          if(n==temp)
          {
              System.out.println("Amstrong");
          }
         else
         {
            System.out.println("Not an Amstrong"); 
         }
      }
    }
}