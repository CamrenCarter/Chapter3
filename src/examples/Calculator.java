package examples;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){

        int userEntry1;
        int userEntry2;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number >>> ");
        userEntry1 = input.nextInt();
        System.out.print("Enter a number >>> ");
        userEntry2 = input.nextInt();

        calculateAddition(userEntry1, userEntry2);
        calculateSubtraction(userEntry1, userEntry2);
        calculateMulti(userEntry1, userEntry2);
        calculateDivision(userEntry1, userEntry2);
        calculateModulos(userEntry1, userEntry2);
    }

    public static void calculateAddition(int num1, int num2){
        int total = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + total);
    }
    public static void calculateSubtraction(int num1, int num2){
        int total = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + total);

    }
    public static void calculateMulti(int num1, int num2){
        int total = num1 * num2;
        System.out.println(num1 + " x " + num2 + " = " + total);
    }
    public static void calculateDivision(int num1, int num2){
        int total = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + total);
    }
    public static void calculateModulos(int num1, int num2){
        int total = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + total);
    }



}
