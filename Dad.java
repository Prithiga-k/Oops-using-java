import java.io.*;
import java.util.*;
class Dad
{
public static void main(String args[])
{
   Scanner s=new Scanner(System.in);
    System.out.println("Enter the number of  elements of array");
	int n=s.nextInt();
	int arr[]=new int[n],num=0;
	System.out.println("The elements of array");
 for(int i=0;i<n;i++)
 {
     arr[i]=s.nextInt();
  
  }
  int cnt=0;
  for(int i=0;i<n;i++)
 {
     Arrays.sort(arr);
 }

}
}