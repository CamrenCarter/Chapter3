package assignment;

import java.util.Scanner;

public class FahrenheitConversion {
    public static void main(String[] args) {
        double tempMorning;
        double tempNoon;
        double tempEvening;

        System.out.print("What was the temp. at 8:00 am in Celsius >>> ");
        Scanner input = new Scanner(System.in);
        tempMorning = input.nextDouble();
        System.out.print("What was the temp. at 12.00 pm in Celsius >>> ");
        tempNoon = input.nextDouble();
        System.out.print("What was the temp at 5.00 pm in Celsius >>> ");
        tempEvening = input.nextDouble();

        displayConvMorning(tempMorning, tempNoon, tempEvening);


    }
    public static void displayConvMorning(double tempMorning, double tempNoon, double tempEvening){
        double newTempMorning;
        double newTempNoon;
        double newTempEvening;

        newTempMorning = (tempMorning * 9/5) + 32;
        System.out.println("The temp in Fahrenheit at 8:00 am is " + newTempMorning + " degrees Fahrenheit");
        if (newTempMorning < 33){
            System.out.println("It is FREEZING OUTSIDE!!!");
        }
        if (newTempMorning > 99){
            System.out.println("It is HOT OUTSIDE!!!");
        }
        newTempNoon = (tempNoon * 9/5) + 32;
        System.out.println("The temp in Fahrenheit at 12:00 pm is " + newTempNoon + " degrees Fahrenheit ");
        if (newTempNoon < 33){
            System.out.println("It is FREEZING OUTSIDE!!!");
        }
        if (newTempNoon > 99){
            System.out.println("It is HOT OUTSIDE!!!");
        }
        newTempEvening = (tempEvening * 9/5) + 32;
        System.out.println("The temp in Fahrenheit at 5:00 pm is " + newTempEvening + " degrees Fahrenheit");
        if (newTempEvening < 33){
            System.out.println("It is FREEZING OUTSIDE!!!");
        }
        if (newTempEvening > 99){
            System.out.println("It is HOT OUTSIDE!!!");
        }
    }

    }