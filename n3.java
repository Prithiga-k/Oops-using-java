import java.io.*;
import java.util.*;

class n3 {

public static void main(String args[] ) throws Exception { Scanner s = new Scanner(System.in);

int n=s.nextInt();

while(n!=0)

{String str=s.next();

int count=0;

if(!str.contains("W")|| !str.contains("B"))

{  System.out.println("0"); count=0; }

else

{if(str.contains("WWBWW"))

{ int c=(str.split("WWBWW",-1).length)-1;  count=count+(c*4); str=str.replace("WWBWW","ZZ");}

if(str.contains("WBWW"))

{int c=(str.split("WBWW",-1).length)-1;  count=count+(c*3);  str=str.replace("WBWW","ZZ");}

if(str.contains("WWBW"))

{int c=(str.split("WWBW",-1).length)-1;  count=count+(c*3);  str=str.replace("WWBW","ZZ");}

if(str.contains("WBW"))

{int c=(str.split("WBW",-1).length)-1;  count=count+(c*2);  str=str.replace("WBW","ZZ"); }

if(str.contains("BWW"))

{ int c=(str.split("BWW",-1).length)-1;  count=count+(c*2);  str=str.replace("BWW","ZZ");}

if(str.contains("WWB"))

{ int c=(str.split("WWB",-1).length)-1; count=count+(c*2); str=str.replace("WWB","ZZ");}

if(str.contains("BW"))

{int c=(str.split("BW",-1).length)-1; count=count+(c*1);  str=str.replace("BW","ZZ"); }

if(str.contains("WB"))

{ int c=(str.split("WB",-1).length)-1; count=count+(c*1); str=str.replace("WB","ZZ"); }

System.out.println(count);

}n--;

}}}

