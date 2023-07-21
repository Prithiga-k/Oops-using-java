import java.io.*;
import java.util.*;
public class Tree
{
public static void main(String[] args)
{
   TreeSet<String> a=new TreeSet<String>();
   a.add("Prithi");
   a.add("Karpagam");
   TreeSet<String> b=new TreeSet<String>();
   b.add("Pavin");
   b.add("Prithikshaa");
   a.addAll(b);
   Iterator<String> itr=a.iterator();
   while(itr.hasNext())
   {
    System.out.println(itr.next());
  }
 }
}