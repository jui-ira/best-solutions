import java.util.*;
import java.io.*;

class Day8{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> mapping= new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            
            mapping.put(name,phone);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            if(mapping.get(s)==null)
            {
                System.out.println("Not found");
            }
            else
            {
                System.out.println(s+ "=" + mapping.get(s));
            }
            // Write code here
        }
        in.close();
    }
}
