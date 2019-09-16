package assignment;

import java.util.Scanner;

public class PoundsConversion {
    public static void main(String[] args){
        double userEntry;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a weight in pounds >>> ");
        userEntry = input.nextInt();

        poundsToKilograms(userEntry);
        poundsToOunces(userEntry);
        poundsToMilligrams(userEntry);
    }
    public static void poundsToKilograms(double userEntry){
        double Kilos = userEntry * 0.453592;
        System.out.println(userEntry + " pounds converted to " + Kilos + " kilograms");
    }
    public static void poundsToOunces(double userEntry){
        double ounces = userEntry * 16;

        System.out.println(userEntry + " pounds converted to " + ounces + "ounces");
    }
    public static void poundsToMilligrams(double userEntry){
        double milligrams = userEntry * 453592;

        System.out.println(userEntry + " pounds converted to " + milligrams + "milligrams");
    }
}
