import java.io.*;
import java.util.*;
class T
{
    public static void main(String args[] )
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int min=0;
        int res=0;
        for(int i=0;i<t;i++)
        {
            int n=s.nextInt();
            int a[]=new int[n];
            for(int j=0;j<n;j++)
                a[j]=s.nextInt();
            
            for(int k=0;k<n;k++)
            {
                for(int l=k+1;l<n;l++)
                {
                     res=a[k]^a[l];
                    if(res<min)
                    res=min;
                }
            }System.out.println(res);

        }
    }
}