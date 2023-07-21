import java.io.*;
import java.util.ArrayList;
class Main5
{
public static void main(String args[])
{
    ArrayList<Integer> a=new ArrayList<>();
	ArrayList<Integer> b=new ArrayList<>();
	a.add(1);
	a.add(2);
	a.add(3);
	b.add(4);
	b.add(4);
	b.add(4);
	a.addAll(b);
	System.out.println(b);
}
}
	