import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day11 {
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int sum=0;
        int maxSum=0;
        int count=1;
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
  
       for(int i=0;i<4;i++){
           for(int j=0;j<4;j++,count++){
                sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
        if(count==1){
               maxSum=sum;
           }
            if(sum>=maxSum){
               maxSum=sum;}

          }
       }
   if(sum>=maxSum){
       System.out.println(sum);

    }
   else{
       System.out.println(maxSum);  
   }
    }
}
