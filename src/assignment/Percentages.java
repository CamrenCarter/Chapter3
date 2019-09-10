package assignment;

import java.util.Scanner;

public class Percentages {
    public static void main(String[] args){
        double x;
        double y;

        System.out.print("What is your x value >>> ");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        System.out.print("What is your y value ");
        y = input.nextInt();

        computePercent(x, y);
    }
    public static void computePercent(double x, double y){
        double percent;

        percent = x / y * 100;

        System.out.println(x +" is " + percent + " percent of " + y);

    }


}
