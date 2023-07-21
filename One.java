import java.util.*;
class One
{
   public static void main(String args[])
   {   
	Scanner s=new Scanner(System.in);
	int row=s.nextInt();
	int column=s.nextInt();
	int sum[][];
	System.out.println("Enter the rows and columns for first array");
	int a[][]=new int[row][column];
	System.out.println("Enter the rows and columns for second array");
	int b[][]=new int[row][column];
        for (int i = 0; i < row; i++)
	      {
	    for(int j = 0; j < column; j++)
	      {
           	a[i][j] = s.nextInt();
	     }
	    }
		for (int i = 0; i < row; i++)
	      {
	    for(int j = 0; j < column; j++)
	      {
           	b[i][j] = s.nextInt();
	     }
		 if(a[i][j]==b[i][j])
		 {
		 for (int i = 0; i < row; i++)
	      {
	    for(int j = 0; j < column; j++)
	      {
           	c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j]);
	      }
		 
	    }
		
	}  
   }
	}
}
