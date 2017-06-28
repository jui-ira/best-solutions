import java.util.*;
import java.math.*;

public class Day2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        double tipPercent = scan.nextInt(); // tip percentage
        double taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      double tip,tax;
      tip=mealCost*(tipPercent/100);
        tax=mealCost*(taxPercent/100);
        // Write your calculation code here.
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(mealCost+tip+tax/*numberToRoundHere*/);
        System.out.println("The total meal cost is "+totalCost+" dollars.");
      
        // Print your result
    }
}