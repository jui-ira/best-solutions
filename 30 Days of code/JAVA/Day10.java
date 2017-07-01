import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day10 {
    static int max(int a,int b)
        {
            if(a>b)
                return a;
            else
                return b;
                
        }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int remainder=0;
        int a[]= new int[20];
        int counter=0;
        int maxcount=0;
      while(n!=0)
        {
            remainder=n%2;
            n=n/2;
           counter=(counter+remainder)*remainder;
          maxcount=max(counter,maxcount);
      }
       System.out.println(maxcount);
        
    }
}
