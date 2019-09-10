package assignment;

import java.util.Scanner;

public class NumbersDemo {
    public static void main(String[] args){

        int x;
        int y;


        System.out.print("What is your x value >>>");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        System.out.print("What is your y value");
        y = input.nextInt();

        displayTwiceTheNumbers(x, y);
        displayNumberPlusFive(x, y);
        displayNumberSquared(x, y);


    }
    public static void displayTwiceTheNumbers(int x, int y){
        int x2;
        int y2;


        x2 = x *2;
        y2 = y *2;
        System.out.println(x2 + " " + y2);


    }
    public static void displayNumberPlusFive(int x, int y){
        int x3;
        int y3;


        x3 = x + 5;
        y3 = y + 5;
        System.out.println(x3 + " " + y3);


    }
    public static void displayNumberSquared(int x, int y){
        int x4 = x * x;
        int y4 = (int) Math.pow(y, 2);


        System.out.println(x4 + " " + y4);
    }
}
