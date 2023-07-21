import java.io.*;
import java.util.*;
public class Rock1
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int sum=0,sum1=0,sum2=0,sum3=0,sum4=0,sum5=0,sum6=0,
		sum7=0,sum8=0,sum9=0,sum10=0,sum11=0,sum12=0,sum13=0,sum14=0,sum15=0,sum16=0,
		sum17=0,sum18=0,sum19=0,sum20=0,sum21=0,sum22=0,sum23=0,
		sum24=0,sum25=0,sum26=0,sum27=0,sum28=0,sum29=0,sum30=0,sum31=0,sum32=0,sum33=0,sum34=0,sum35=0,
		sum36=0,sum37=0,sum38=0,sum39=0,sum40=0,sum41=0,sum42=0,sum43=0,sum44=0,sum45=0,sum46=0,sum47=0,
		sum48=0,sum49=0,sum50=0,sum51=0,sum52=0;
		
		
		//System.out.println(str1);
		//System.out.println(str2);
		
		while(t!=0)
		{
		String str=s.next();
		int len1=str.length();
		int len2=len1/2;
		String str1=str.substring(0,len2);
		String str2=str.substring(len2);
		char a[]=new char[len2];
		char b[]=new char[len2];
		a=str1.toCharArray();
		b=str2.toCharArray();
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		for(int i=0;i<len2;i++)
		{
		    for(int j=0;j<len2;j++)
		    {
		        if(a[i]==b[j])
		        {
		        char o=b[j];
		        for(int x=0;x<len2;x++)
		        {
		            if(b[x]==o)
		            {
		                b[x]=' ';
		            }
		        }
		           
		           System.out.println(Arrays.toString(b));
		           if(a[i]>='a'&&a[i]<='z') 
		           {
		              if(a[i]=='a')
		              {
		                  sum=sum+1;
		              }
		              else if(a[i]=='b')
		              {
		                  sum1=sum1+2;
		              }
		              else if(a[i]=='c')
		              {
		                  sum2=sum2+3;
		              }
		              else if(a[i]=='d')
		              {
		                  sum3=sum3+4;
		              }
		               else if(a[i]=='e')
		              {
		                  sum4=sum4+5;
		              }
		              else if(a[i]=='f')
		              {
		                  sum5=sum5+6;
		              }
		              else if(a[i]=='g')
		              {
		                  sum6=sum6+7;
		              }
		              else if(a[i]=='h')
		              {
		                  sum7=sum7+8;
		              }
		              else if(a[i]=='i')
		              {
		                  sum8=sum8+9;
		              }
		              else if(a[i]=='j')
		              {
		                  sum9=sum9+10;
		              }
		              else if(a[i]=='k')
		              {
		                  sum10=sum10+11;
		              }
		              else if(a[i]=='l')
		              {
		                  sum11=sum11+12;
		              }
		              else if(a[i]=='m')
		              {
		                  sum12=sum12+13;
		              }
		              else if(a[i]=='n')
		              {
		                  sum13=sum13+14;
		              }
		              else if(a[i]=='o')
		              {
		                  sum14=sum14+15;
		              }
		              else if(a[i]=='p')
		              {
		                  sum15=sum15+16;
		              }
		              else if(a[i]=='q')
		              {
		                  sum16=sum16+17;
		              }
		              else if(a[i]=='r')
		              {
		                  sum17=sum17+18;
		              }
		              else if(a[i]=='s')
		              {
		                  sum18=sum18+19;
		              }
		              else if(a[i]=='t')
		              {
		                  sum19=sum19+20;
		              }
		              else if(a[i]=='u')
		              {
		                  sum20=sum20+21;
		              }
		              else if(a[i]=='v')
		              {
		                  sum21=sum21+22;
		              }
		              else if(a[i]=='x')
		              {
		                  sum22=sum22+24;
		              }
		              else if(a[i]=='y')
		              {
		                  sum23=sum23+25;
		              }
		              else if(a[i]=='z')
		              {
		                  sum24=sum24+26;
		              }
		              else if(a[i]=='w')
		              {
		                  sum25=sum25+23;
		              }
		              }
		              else
		              {
		                  if(a[i]=='A')
		              {
		                  sum26=sum26+27;
		              }
		              else if(a[i]=='B')
		              {
		                  sum27=sum27+28;
		              }
		              else if(a[i]=='C')
		              {
		                  sum28=sum28+29;
		              }
					  else if(a[i]=='D')
		              {
		                  sum29=sum29+30;
		              }
		               else if(a[i]=='E')
		              {
		                  sum30=sum30+31;
		              }
		              else if(a[i]=='F')
		              {
		                  sum31=sum31+32;
		              }
		              else if(a[i]=='G')
		              {
		                  sum32=sum32+33;
		              }
		              else if(a[i]=='H')
		              {
		                  sum33=sum33+34;
		              }
		              else if(a[i]=='I')
		              {
		                  sum34=sum34+35;
		              }
		              else if(a[i]=='J')
		              {
		                  sum35=sum35+36;
		              }
		              else if(a[i]=='K')
		              {
		                  sum36=sum36+37;
		              }
		              else if(a[i]=='L')
		              {
		                  sum37=sum37+38;
		                  System.out.println(sum37);
		              }
		              else if(a[i]=='M')
		              {
		                  sum38=sum38+39;
		              }
		              else if(a[i]=='N')
		              {
		                  sum39=sum39+40;
		              }
		              else if(a[i]=='O')
		              {
		                  sum40=sum40+41;
		              }
		              else if(a[i]=='P')
		              {
		                  sum41=sum41+42;
		              }
		              else if(a[i]=='Q')
		              {
		                  sum42=sum42+43;
		              }
		              else if(a[i]=='R')
		              {
		                  sum43=sum43+44;
		              }
		              else if(a[i]=='S')
		              {
		                  sum51=sum51+45;
		              }
		              else if(a[i]=='T')
		              {
		                  sum44=sum44+46;
		              }
		              else if(a[i]=='U')
		              {
		                  sum45=sum45+47;
		              }
		              else if(a[i]=='V')
		              {
		                  sum46=sum46+48;
		              }
		              else if(a[i]=='X')
		              {
		                  sum47=sum47+50;
		              }
		              else if(a[i]=='Y')
		              {
		                  sum48=sum48+51;
		              }
		              else if(a[i]=='Z')
		              {
		                  sum49=sum49+52;
		              }
		              else if(a[i]=='W')
		              {
		                  sum50=sum50+49;
		              }
		              }
		              
		           }
		        }
		    }
		    t--;
		}
		int ans=sum+sum1+sum2+sum3+sum4+sum5+sum6+sum7+sum8+sum9+sum10+sum11+sum12+sum13+sum14+sum15+sum16+sum17+sum18+sum19+sum20+
		sum21+sum22+sum23+sum24+sum25+sum26+sum27+sum28+sum29+sum30+sum31+sum32+sum33+sum34+sum35+
		sum36+sum37+sum38+sum39+sum40+sum41+sum42+sum43+sum44+sum45+sum46+
		sum47+sum48+sum49+sum50+sum51;
		System.out.println(ans);
	
	}
	}