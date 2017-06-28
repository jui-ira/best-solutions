import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day9 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factorial(n));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
    static int factorial(int n1)
    {
        if(n1==0)
        {
           return 1;
        }
        else
        {
            return (n1*factorial(n1-1));
        }
    }
}