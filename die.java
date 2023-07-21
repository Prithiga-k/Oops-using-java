import java.util.Scanner;

import java.lang.*;

class TestClass {

public static int abs(int x)

{

if(x<0)

return x*(-1);

else

return x;

}

public static void main(String args[] ) throws Exception {

Scanner sc=new Scanner(System.in);

int n=sc.nextInt();

int a=sc.nextInt();

int b=sc.nextInt();

int p=sc.nextInt();

for(int i=0;i<n;i++)

{

for(int j=0;j<n;j++)

{

int x;

int y;

x=p-abs(a-i);

y=p-abs(b-j);

if(x<=y&&x>=0)

System.out.print(x+" ");

else if(x>y&&y>=0)

System.out.print(y+" ");

else

System.out.print("0 ");

}

System.out.println();

sc.close();

}

}

}