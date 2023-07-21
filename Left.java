import java.io.*;
import java.util.*;
public class Left 
{  
    public static void main(String[] args) 
	{  
	      Scanner s=new Scanner(System.in);
		   int a=s.nextInt();
           int [] arr = new int[a];  
        int n = 0;  
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) 
		{  
            arr[i]=s.nextInt();  
        }  
        for(int i = 0; i < n; i++)
		{  
            int j, first;  
            first = arr[0];  
            for(j = 0; j < arr.length-1; j++)
			{    
                arr[j] = arr[j+1];  
            }  
            arr[j] = first; 			
        }  
		System.out.println("The array is rotated " +n+ " times");
        System.out.println();   
              
    }  
}
