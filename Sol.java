import java.io.*;

import java.util.*;

public class Sol {

  public static BufferedReader br;

   public static void main(String[] args)throws IOException{

       br = new BufferedReader(new InputStreamReader(System.in));

       int n = Integer.parseInt(br.readLine());

       String s = br.readLine();

       String ch = "hackerearth";

       int[] arr = new int[11];

       int min = Integer.MAX_VALUE;

       for(int i=0; i<ch.length(); i++) {

           int count = 0;

           for(int j=0; j<n; j++) {

               if(ch.charAt(i)==s.charAt(j)) {

                   count++;

               }

           }

           arr[i] = count;

       }

       arr[0] /= 2;

       arr[1] /= 2;

       arr[4] /= 2;

       arr[5] /= 2;

       for(int i=0; i<11; i++) {

           if(arr[i]<min) min = arr[i];

       }

       System.out.println(min);

   }

}