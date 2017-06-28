import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        int n,i;
        n=sc.nextInt();
        for(int j=0;j<n;j++)
        {
            str=sc.next();
          
            for(i=0;i<str.length();i++)
            {
                if(i%2==0)
                {
                    System.out.print(str.charAt(i));
                }
            }
            System.out.print(" ");
            for(i=0;i<str.length();i++)
            {
                if(i%2==1)
                {
                    System.out.print(str.charAt(i));
                }
            }
             System.out.println();
        }
       
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}