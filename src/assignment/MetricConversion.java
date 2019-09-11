package assignment;

import java.util.Scanner;

public class MetricConversion {
    public static void main(String[] args){
        double value;

        System.out.print("What is your x value >>> ");
        Scanner input = new Scanner(System.in);
        value = input.nextInt();

        conversionToCent(value);
        conversionToliter(value);

    }
   public static void conversionToCent(double value){
        double centimeter;

        centimeter = value / 2.54;

        System.out.println("Converted " + value + " inches to " + centimeter + " centimeter(s)");
   }
   public static void conversionToliter(double value){
        double liters;

        liters = value / 3.7854;

        System.out.println("Converted " + value + " gallons to " + liters + " liter(s)");

   }
}
