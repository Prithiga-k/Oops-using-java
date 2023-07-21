import java.io.*;
import java.util.Arrays;
class Q
{
public static void main(String args[])
{
        int num[]={50,77,12,54,-11};
		int n=-1,0;
		boolean bool=true;
		for(int i:num)
		{
		if(num==n)
		{
		    bool=false;
			break;
		}
		}
		if(bool)
		System.out.println("True");
		else
		System.out.println("False");
}
}