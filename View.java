import java.io.*;
import java.util.*;
public class View
{
public static void main(String... args)
{
Scanner s=new Scanner(System.in);
System.out.println("1.Add,2.Iterator,3.Addall ,4.Removeall,5.Retainall,6.Forward and backward");
int choice=1;
while(choice==1)
{  
  ArrayList <String> a=new ArrayList<String>();
   a.add("Prithi");
   a.add("Kannan");
   ArrayList <String> a1=new ArrayList<String>();
   a1.add("Prithi");
   a1.add("Pavi");
   Scanner s1=new Scanner(System.in);
   System.out.println("Enter the num");
     int b=s1.nextInt();
 switch(b)
 {
     case 1:
	 {
	 for(String obj : a)
	 System.out.println(obj);
	 
	 for(String obj1 : a1)
	 System.out.println(obj1);
	 break;
	 }
	 
	 case 2:
	 {
	   Iterator itr=a.iterator();
       while(itr.hasNext())
       System.out.println(itr.next());
	   break;
    }
	
	case 3:
	{
	  a.addAll(a1);  
     Iterator itr=a.iterator();
     while(itr.hasNext())
     System.out.println(itr.next());
      break;
	}
	
	
	case 4:
	{
	    a.removeAll(a1);
        System.out.println("iterating the elements after removing the elements of al...");
       Iterator itr=a.iterator();
       while(itr.hasNext())
       System.out.println(itr.next());
	   break;
	}
	
	case 5:
	{
	a.retainAll(a1);
    System.out.println("iterating the elements after retaining the elements of al...");
    Iterator itr=a.iterator();
    while(itr.hasNext())
    System.out.println(itr.next());
    break;
	}
	case 6:
	{
	ListIterator<String> itr=a.listIterator();
   System.out.println("traversing elements in forward direction...");
  while(itr.hasNext())
    {
       System.out.println(itr.next());
    }
  System.out.println("traversing elements in backward direction...");
  while(itr.hasPrevious())
    System.out.println(itr.previous());
	break;
    }
   }
  System.out.println("Enter the choice");
   choice =s1.nextInt();
   }
 }
 }