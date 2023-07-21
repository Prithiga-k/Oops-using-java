import java.util.*;
class Two
{
   public static void main(String args[])
   {   
	Scanner s=new Scanner(System.in);
	int row=s.nextInt();
	int column=s.nextInt();
	int a[][]=new int[row][column];
        for (int i = 0; i < row; i++)
	{
	    for(int j = 0; j < column; j++)
	    {
           	a[i][j] = s.nextInt();
	    }
	}
        for (int i = 0; i < row; i++)
	{
        System.out.println(" ");
	    for(int j = 0; j < column; j++)
	    {
	       System.out.print(a[i][j]+" ");
 	    }
	}  
   }
}